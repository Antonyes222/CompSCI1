// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int i;
	char mhm;
		for(i=0;i<=3;i++){
		gotoxy(i,2);
		cout<<"&";
		gotoxy(i,4);
		cout<<"&";
		gotoxy(0,i+1);
		cout<<"&";
		gotoxy(3,i+1);
		cout<<"&";
	}
	while (true) {

	gotoxy(2,3);
	cout<<random(9);
	gotoxy(4,4);
	cout<<"Type 'q' if you wish to stop.";
	cin>>mhm;
	if(mhm=='q'){
		break;
	}
	}
}
