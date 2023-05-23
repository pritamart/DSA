#include<iostream>
using namespace std;
main(){
	int n,i=2,f=true;
	cout<<"Enter a number (>2)\t";
	cin >> n;
	while(i<n){
		if(n % i==0){		
			f = false;//change the flack
			cout << n << " is not prime number"<<endl;
			break;
		}
		i += 1;
	}
	if(f){ //chek is devisible by 2...(n-1)
		cout << n << " is prime number"<<endl;
	}	
}
