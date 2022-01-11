// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int i = 3;
	char sym;
cout<<"Enter a symbol: ";
	cin>>sym;
	cout<<endl;
	while (true){
	    gotoxy(5,i-1);
		cout<<"   ";
		gotoxy(5,i);
		cout<<sym<<endl;
		sleep(1);
		i++;
		
	}
}
