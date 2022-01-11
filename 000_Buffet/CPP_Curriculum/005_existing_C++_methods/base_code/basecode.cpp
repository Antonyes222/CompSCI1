// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char sym;
	int num;
	char way;
	int i;
	int x = 0;
	int y = 0;
	cout<<"Enter a symbol.";
	cin>>sym;
	cout<<"Enter the length of the line. ";
	cin>>num;
	cout<<"Enter h for horizontal line. Enter v for vertical line. Enter d for diagonal line. ";
	cin>>way;
	if (way=='h')
	for(i=0;i<num;i++){
		cout<<sym;
	} else if (way=='v'){
	for(i=0;i<num;i++){
		cout<<sym<<endl;
	}
	}
	else if (way=='d'){
		for(i=0;i<num;i++){
			gotoxy(i+1,i+5);
			cout<<sym<<endl;
		}
	}
}
