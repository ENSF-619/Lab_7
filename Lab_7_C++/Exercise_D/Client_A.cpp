/*
* Client_A.cpp
* Lab 7, Exercise D
* By: Ziad Chemali & Lotfi Hasni
* Submission: November 6, 2020
*/
#include "Client_A.h"

void Client_A::add(string username, string password)
{
	instance->add(username, password);
}

User* Client_A::validate(string username, string password)
{
	return instance->validate(username, password);
}

Client_A::Client_A()
{
	instance = LoginServer::getInstance();
}

