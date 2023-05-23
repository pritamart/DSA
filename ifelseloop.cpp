#include<iostream>
using namespace std;
main(){
	int n , i = 0,sum=0;
	cin >> n;
	while(i <= n){
		cout << i <<endl;
		sum += i;
		i+=1;		
	}
	cout << sum;
}
