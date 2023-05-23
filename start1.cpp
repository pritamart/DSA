#include<iostream>
using namespace std;
int main(){
	int n;
	cin>> n;
/* 
*
**
***
****
*****
	

	for(int i = 0; i<5;i++){
		for(int j = 0; j <=i;j++){
			cout<<"*";
			
		}
		cout<<endl;
	}
 
*****
****
***
**
*
	

cout<<"----------"<<endl;
	for(int i = 0; i<5;i++){
		for(int j = 0; j <(5-i);j++){
			cout<<"*";
			
		}

		cout<<endl;
	}

*****
 ****
  ***
   **
    *

cout<<"----------"<<endl;
	for(int i = 0; i<5;i++){
			for(int j = 0; j<=i-1;j++){
			cout<<" ";
		}
		for(int j = 0; j <(5-i);j++){
			cout<<"*";
		}
	

		cout<<endl;
	}

    *
   **
  ***
 ****
*****
	

cout<<"----------"<<endl;
	for(int i = 0; i<5;i++){
			for(int j = 0; j<=5-i-2;j++){
			cout<<" ";
		}
		for(int j = 0; j <i+1;j++){
			cout<<"*";
		}
	

		cout<<endl;
	}
 
1234
1234
1234
1234

int n = 5;
cout<<"---------------"<<endl;	
	for(int i = 0 ;i <5;i++){
		for(int j = 1;j <=4;j++){
			cout<<j;
		}
		cout<<endl;
	}	
cout<<"---------------"<<endl;	

1
2 3
3 4 5 
4 5 6 7
5 6 7 8 9

	
for(int i = 0; i <n;i++){
	for(int j = 0;j<=i;j++){
		cout<<j+1+i;
	}
	cout<<endl;	
}

	int n;
	cin >> n;
	for(int row = 1;row<=n; row ++){
		for(int col = 1;col <= row;col++){
			cout<<col+row;
		}
	cout<<endl;	
	}
/*	
	
1
21
321
4321
54321


	for(int i = 1; i <= n;i++){
		int v = 1;
		for(int j = i; j >= 1;j--){
			cout<< j;
		}
		cout<<endl;
	}

AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

char a = 'A';
	for(int i = 0; i<n;i++){
		for(int j = 0; j <n;j++){
			cout<<char(a+i);
		}
		cout<<endl;
	}
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE

char a = 'A';
	for(int i = 0; i<n;i++){
		for(int j = 0; j <n;j++){
			cout<<char(a+j);
		}
		cout<<endl;
	}
A
AB
ABC
ABCD
ABCDE	

		char a = 'A';
	for(int i = 0; i<n;i++){
		for(int j = 0; j <=i;j++){
		
			cout<<char(a+j);
		}
		cout<<endl;
	}

A
BC
DEF
GHIJ
KLMNO
	char a = 'A';
	for(int i = 0; i<n;i++){
		for(int j = 0; j <=i;j++){
			cout<<char(a);
			a+=1;
		}
		cout<<endl;
	}	

    for (int i = n; i >= 0; i--) {
        for (int j = i; j <= n-1; j++) {
            cout << char('A'+j) << " ";
        }
        cout << endl;
    }

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

	for(int i = 0; i<n;i++){
			for(int j = 1; j<=5-i-1;j++){
			cout<<"  ";
		}
		for(int j = 1; j <=i+1;j++){
			cout<<j<<" ";
		}
			for(int j = i; j > 0;j--){
			cout<<j <<" ";
			
		}
	

		cout<<endl;
	}
*/

}
