// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int l;
	int w;
	char sym;
	int i;
	int x;
	cout<<"Box Making time!"<<endl;
	cout<<"Enter the length of the box.";
	cin>>l;
	cout<<"Enter the width of the box.";
	cin>>w;
	cout<<"Enter the symbol of the box.";
	cin>>sym;
	for(i=0;i<l;i++){
	 for(x=0;x<w;x++){
	 	gotoxy(x+2,i+7);
	 	cout<<sym;
	 }
	}
}
