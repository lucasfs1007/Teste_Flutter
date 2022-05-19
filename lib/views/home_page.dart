import 'package:flutter/material.dart';
import 'package:github_users/models/user_model.dart';
import 'package:github_users/services/github_services.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final formKey = GlobalKey<FormState>();
  final nameController = TextEditingController();

  bool loading = true;
  List<UserModel> allUsers = [];

  UserModel? user;

  GitHubService service = GitHubService();

  void submit() {
    if (formKey.currentState!.validate()) {
      String name = nameController.text;

      service.getUserByName(name).then((value) {
        setState(() {
          user = value;
        });

        nameController.text = "";
      }).catchError((onError) {
        print("Comportamento inesperado");
      });
    }
  }

  void initialize() {
    service.getUsers().then((value) {
      setState(() {
        allUsers = value;
        loading = false;
      });
    }).catchError((_) {});
  }

  @override
  void initState() {
    initialize();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Pesquisador de usuarios do Github"),
        centerTitle: true,
      ),
      body: SafeArea(
          child: SingleChildScrollView(
        child: Form(
          key: formKey,
          child: Padding(
            padding: const EdgeInsets.all(15),
            child: Column(
              children: [
                TextFormField(
                  controller: nameController,
                  decoration: const InputDecoration(
                    prefixIcon: Icon(Icons.person),
                    labelText: "Nome do usuário",
                  ),
                  validator: (value) {
                    if (value == "") {
                      return "Esse campo não pode ser vazio!";
                    } else if (value!.length < 5) {
                      return "Esse campo não pode ser menor que 5 caracteres!";
                    }

                    return null;
                  },
                ),
                const SizedBox(
                  height: 50,
                ),
                ElevatedButton(
                    onPressed: submit, child: const Text('pesquisar')),
                const SizedBox(
                  height: 50,
                ),
                if (user != null)
                  Card(
                    child: ListTile(
                      leading: Image.network(user!.avatarUrl),
                      title: Text(user!.login),
                    ),
                  ),
                const SizedBox(
                  height: 50,
                ),
                loading
                    ? const CircularProgressIndicator()
                    : Column(
                        children: [
                          ...allUsers.map(
                            (e) => Card(
                              key: Key(e.id.toString()),
                              child: ListTile(
                                leading: Image.network(e.avatarUrl),
                                title: Text(e.login),
                              ),
                            ),
                          )
                        ],
                      ),
              ],
            ),
          ),
        ),
      )),
    );
  }
}
