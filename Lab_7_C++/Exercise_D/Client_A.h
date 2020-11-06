/*
* Client_A.h
* Lab 7, Exercise D
* By: Ziad Chemali & Lotfi Hasni
* Submission: November 6, 2020
*/
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
