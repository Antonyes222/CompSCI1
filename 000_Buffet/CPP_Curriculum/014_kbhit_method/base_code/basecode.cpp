// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	bool check = true;
	bool checc = true;
	char yada;
	while (check){ 
		checc = true;
		while(kbhit()==0){ 
			gotoxy(0,3); 
			cout<<"    "; 
			gotoxy(0,3); 
			cout<<random(100); 
			}
		while (checc){
			cin>>yada;
		if(getch()=='q'){
		check = false;
		checc = false;
		}
		else { checc = false; 
		}
		}
}
}

