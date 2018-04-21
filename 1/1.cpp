#include <iostream> 

using namespace std; 

int main( int argc, char ** argv){ 
	int MAX = 1000;
	int sum = 0; 

	for(int i=0; i < MAX; i++){ 
		if((i%3 == 0) || (i%5 == 0)){ 
			sum = sum + i; 
		}
	} 

	cout << "Total: " << sum << endl; 
	return 0;
} 
