import 'package:dio/dio.dart';
import 'package:github_users/models/user_model.dart';

class GitHubService {
  Future<UserModel> getUserByName(String name) async {
    try {
      Response response = await Dio().get("https://api.github.com/users/$name");
      print(response.statusCode);
      return UserModel.fromJson(response.data);
    } catch (e) {
      rethrow;
    }
  }

  Future<List<UserModel>> getUsers() async {
    try {
      Response response =
          await Dio().get("https://api.github.com/users/lucasfs1007/followers");
      return (response.data as List).map((e) => UserModel.fromJson(e)).toList();
    } catch (e) {
      rethrow;
    }
  }
}
