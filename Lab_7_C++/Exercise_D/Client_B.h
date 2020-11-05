#pragma once
#pragma once
#ifndef ClientB_h
#define ClientB_h
#include"LoginServer.h"
class Client_B {
private:
	LoginServer* instance;
public:
	void add(string username, string password);
	User* validate(string username, string password);
	Client_B();
	
};
#endif
