/*
* LoginServer.h
* Lab 7, Exercise D
* By: Ziad Chemali & Lotfi Hasni
* Submission: November 6, 2020
*/
#pragma once
#ifndef LoginServer_h
#define LoginSErver_h
#include <string>
#include <vector>
#include<string.h>
using namespace std;

struct User
{
	string username;
	string password;

};

class LoginServer {
	
public:
	
	
	static LoginServer* getInstance();
	void add(string username, string password);
	User* validate(string username, string password);
    ~LoginServer();
private:
	vector<User> users;
	static LoginServer* instance;
	LoginServer();
	};
#endif // !LoginServer_h
