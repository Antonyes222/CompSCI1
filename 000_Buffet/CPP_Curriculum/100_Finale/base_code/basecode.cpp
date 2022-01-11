// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	cout<<"   #   "<<endl;
    cout<<"  ###  "<<endl;
    cout<<" ##### "<<endl;
    cout<<"#######"<<endl;
    int i;
    int x;
    for(i=1;i<=3;i++){
    	for(x=1;x<=3;x++){
    		gotoxy(x+2,i+5);
    		cout<<"I"<<endl;;
    	}
    }
    int z;
    for(z=0;z<=2;z++){
    	gotoxy(9+z,6);
    		cout<<"X";
    		gotoxy(9+z,8);
    		cout<<"X";
    		gotoxy(9,6+z);
    		cout<<"X";
    		gotoxy(11,6+z);
    		cout<<"X";
    	}
    
	gotoxy(9,5);
	cout<<"\\|/";
	
	string inp;
	gotoxy(10,2);
	cout<<"What is your first name? ";
	cin>>inp;
	gotoxy(10,3);
	cout<<"Merry Christmas, "<<inp<<"!"<<"      Press '='";
	char n;
	int count;
	int k;
	while(true){
		n = getch();
		if(n=='='){
			gotoxy(random(30),count);
		cout<<"*"<<endl;
		count=count+1;
		}
		
	}
	cout<<""<<endl;	cout<<""<<endl;	cout<<""<<endl;	cout<<""<<endl;
	
	
	
	}

