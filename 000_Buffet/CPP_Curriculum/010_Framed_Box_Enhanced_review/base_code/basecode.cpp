// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int l;
	int w;
	char sym;
	int x;
	int y;
	int i;
	cout<<"Enter border length";
	cin>>l;
	cout<<"Enter border width";
	cin>>w;
	cout<<"Enter border symbol"<<endl;
	cin>>sym;
	cout<<"Enter x value."<<endl;
	cin>>x;
	cout<<"Enter y value."<<endl;
	cin>>y;
	for(i=0;i<l;i++){
	gotoxy(x,i+y);
	cout<<sym;
	gotoxy(w+x,i+x);
	cout<<sym; }
	for(i=0;i<w;i++){
		gotoxy(x+i,y);
		cout<<sym;
		gotoxy(i+x,l-1+x);
		cout<<sym;
	}
}
