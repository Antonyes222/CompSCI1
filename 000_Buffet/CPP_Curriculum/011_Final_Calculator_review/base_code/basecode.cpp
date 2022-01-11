// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char bd;
	int num1;
	int num2;
	char op;
	int ans;
	int i;
	cout<<"Enter a symbol for you border.";
	cin>>bd;
	cout<<"Enter a number:";
	cin>>num1;
	cout<<"Enter an operation (-,+,/,*):";
	cin>>op;
	cout<<"Enter a second number:";
	cin>>num2;
	if (op=='-') {
	ans = num1-num2;
	}
	if (op=='+') {
		ans = num1+num2;
	}
	if (op=='/') {
		ans = num1/num2;
	}
	if (op=='*') {
		ans = num1*num2;
	}

	for(i=0;i<5;i++){
	gotoxy(0,i+6);
	cout<<bd;
	gotoxy(12,i+6);
	cout<<bd; }
	for(i=0;i<12;i++){
		gotoxy(i,6);
		cout<<bd;
		gotoxy(i,18);
		cout<<bd;
	}
	gotoxy(3,8);
	cout<<num1<<op<<num2<<"="<<ans;

}
