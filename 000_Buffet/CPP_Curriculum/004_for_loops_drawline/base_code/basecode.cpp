// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char sym;
	int num;
	char way;
	int i;
	cout<<"Enter a symbol.";
	cin>>sym;
	cout<<"Enter the length of the line. ";
	cin>>num;
	cout<<"Enter h for horizontal line. Enter v for vertical line. ";
	cin>>way;
	if (way=='h')
	for(i=0;i<num;i++){
		cout<<sym;
	} else if (way=='v'){
	for(i=0;i<num;i++){
		cout<<sym<<endl;
	}
	}
}
