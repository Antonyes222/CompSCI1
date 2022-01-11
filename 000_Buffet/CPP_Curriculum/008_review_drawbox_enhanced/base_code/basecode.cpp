// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int l;
	int w;
	char sym;
	int x;
	int y;
	int i;
	int z;
	cout<<"Box Making time!"<<endl;
	cout<<"Enter the length of the box.";
	cin>>l;
	cout<<"Enter the width of the box.";
	cin>>w;
	cout<<"Enter the symbol of the box.";
	cin>>sym;
	cout<<"Enter the x-coordinate of the box.";
	cin>>x;
	cout<<"Enter the y-coordinate of the box.";
	cin>>y;
	for(i=0;i<l;i++){
	 for(z=0;z<w;z++){
	 	gotoxy(z+x,i+y);
	 	cout<<sym;
	 }
	}
}
