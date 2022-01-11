// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int y;
	int l;
	char sym;
	int i;
	cout<<"How long do you want the line?";
	cin>>l;
	cout<<"What symbol do you want the line to be?";
	cin>>sym;
	cout<<"What is the x-coordinate of your line?";
	cin>>x;
	cout<<"What is the y-coordinate of your line?";
	cin>>y;
	for(i=0;i<l;i++){
		gotoxy(x+i,y);
		cout<<sym;
	}
}
