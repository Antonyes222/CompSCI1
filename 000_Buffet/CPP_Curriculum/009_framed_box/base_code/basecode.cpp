// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

	int l;
	int w;
	char sym;
	int x=0;
	int y=0;
	int i;
	cout<<"Enter border length";
	cin>>l;
	cout<<"Enter border width";
	cin>>w;
	cout<<"Enter border symbol";
	cin>>sym;
	
	for(i=0;i<=l;i++){
	gotoxy(x,i+y);
	cout<<sym;
	gotoxy(w+x,i+x);
	cout<<sym; }
	for(i=0;i<=w;i++){
		gotoxy(x+i,y);
		cout<<sym;
		gotoxy(i+x,l+x);
		cout<<sym;
	}
}
