#include <iostream>
using namespace std;

class A
{ 
public:
virtual void p()
{
	 cout << "A.p" << endl; 
}
 void q()
{ 
	cout << "A.q" << endl; 
}
 virtual void r()
{
	 p(); 
	 q(); 
}

};
class B : public A
{ 
public:
void p()
{
	 cout << "B.p" << endl; 
}

};
class C : public B
{ 
public:
void q()
{
	 cout << "C.q" << endl; 
}
 void r()
{
	 p(); 
	 q(); 
}

};

int main() 
{
	A *newptr = new C();
	newptr -> r();
	//newptr = new B;
	//newptr -> r();
	//newptr = new C;
	//newptr -> r();

	
	cin.get();
	cin.get();
		return 0;
}