// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int i;
	int a1 = 5;
	int b1 = 15;
	while (a1<=25){
    cout<<a1<<endl;
    a1=a1+1;
}
	while(b1>=5){
		cout<<b1<<endl;
		b1=b1-1;
	}
	for(i=5;i<=25;i++){
		cout<<i<<endl;
	}
}