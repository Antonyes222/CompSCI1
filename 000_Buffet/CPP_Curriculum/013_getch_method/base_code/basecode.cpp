// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int i;
	char jon;
	for (i=1;i<=5;i++){
		gotoxy(i,2);
		cout<<"X";
		gotoxy(i,6);
		cout<<"X";
		gotoxy(0,i+1);
		cout<<"X";
		gotoxy(5,i+1);
		cout<<"X";
	}
	while (jon!='q'){
		gotoxy(2,4);
		jon = getch();
		cout<<"   ";
		gotoxy(2,4);
		cout<<random(100);
	}

}
