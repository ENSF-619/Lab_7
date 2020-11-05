#include "LoginServer.h"
#include<iostream>
LoginServer::LoginServer()
{
	}





LoginServer* LoginServer::getInstance()
{
	if (instance == nullptr)
		instance = new LoginServer();
	return instance;
}

void LoginServer::add(string username, string password)
{
	
	bool check = true;
	for (int i = 0;i < users.size();i++)
	{
		User temp = users[i];

		if (username == temp.username || password == temp.password) {
			std::cout << "Error "<<username << " already exists" << endl;
			return;
		}
	}
	User add_to_list = { username, password };
	users.push_back(add_to_list);
}

User* LoginServer::validate(string username, string password)
{
	for (int i = 0;i < users.size();i++)
	{
		User temp = users[i];
		
		if (username == temp.username && password == temp.password) {
			return &users[i];
		}

	}
	
	return nullptr;
}
LoginServer::~LoginServer()
{
	cout << "Deleting" << endl;
	delete instance;
}
LoginServer* LoginServer::instance = new LoginServer();