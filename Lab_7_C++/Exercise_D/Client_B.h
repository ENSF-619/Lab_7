/*
* Client_B.h
* Lab 7, Exercise D
* By: Ziad Chemali & Lotfi Hasni
* Submission: November 6, 2020
*/
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
