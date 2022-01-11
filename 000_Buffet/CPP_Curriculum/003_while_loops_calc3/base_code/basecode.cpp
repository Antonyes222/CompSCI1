// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	while (true){
		char Question;
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
	cout<<"Your answer is : "<<ans<<endl;
	} else if (op=='+') {
		ans = num1+num2;
	cout<<"Your answer is : "<<ans<<endl;
	} else if (op=='/') {
		ans = num1/num2;
	cout<<"Your answer is : "<<ans<<endl;
	} else if (op=='*') {
		ans = num1*num2;
	cout<<"Your answer is : "<<ans<<endl;
	} else {
		cout<<"That was not an appropiate input."<<endl;
	}
	cout<<"Do you wish to stop? Type y for yes. Type n for no.";
	cin>>Question;
	if (Question=='y'){
		break;
	} else if (Question!='n'){
		cout<<"That was not an appropiate answer. Restarting calculator.";
	}
	}

}
