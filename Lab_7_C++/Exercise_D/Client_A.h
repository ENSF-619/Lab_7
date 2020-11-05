#pragma once
#ifndef ClientA_h
#define ClientA_h
#include"LoginServer.h"
class Client_A {
private:
	LoginServer* instance;
public:
	void add(string username, string password);
	User* validate(string username, string password);
	Client_A();
	
};
#endif
