#include<iostream>
using namespace std;
int main(){
	cout << "enther the number" << endl;
	int n,p=1,s=0;
	cin >> n;
	while(n != 0){
		int rem = n % 10;
		s += rem;
		p = p * rem;
		n = n /10;
	}
	cout << "sum = " << s<< " product = "<< p << endl;
}
