// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int num1;
	int num2;
	char op;
	int ans;
	cout<<"Enter a number:";
	cin>>num1;
	cout<<"Enter a second number:";
	cin>>num2;
	cout<<"Enter an operation (-,+,/,*):";
	cin>>op;
	if (op=='-') {
	ans = num1-num2;
	cout<<"Your answer is : "<<ans;
	}
	if (op=='+') {
		ans = num1+num2;
	cout<<"Your answer is : "<<ans;
	}
	if (op=='/') {
		ans = num1/num2;
	cout<<"Your answer is : "<<ans;
	}
	if (op=='*') {
		ans = num1*num2;
	cout<<"Your answer is : "<<ans;
	}
	

}
