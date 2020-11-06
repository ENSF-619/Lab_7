/*
* Client_B.cpp
* Lab 7, Exercise D
* By: Ziad Chemali & Lotfi Hasni
* Submission: November 6, 2020
*/

#include "Client_B.h"

void Client_B::add(string username, string password)
{
	instance->add(username, password);
}

User* Client_B::validate(string username, string password)
{
	return instance->validate(username,password);
}

Client_B::Client_B()
{
	instance =LoginServer::getInstance();
}


