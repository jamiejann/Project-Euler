#include <iostream>

using namespace std; 

bool primeCheck(long number);

int main (int argc, char ** argv) { 
	bool isPrime = false; 
	long MAX_VALUE = 600851475143;
	long currentLargestPrime = 0; 
	long largestPrimeFactor = 0;
	
	for(long i = 2; i<MAX_VALUE; i++){
		if(primeCheck(i) == true){
			currentLargestPrime = i;

			if((MAX_VALUE%currentLargestPrime) == 0){ 
				largestPrimeFactor = currentLargestPrime;
				cout << largestPrimeFactor << endl; 
			} 
		} 
	} 
	
	cout << "Largest :" << currentLargestPrime << endl;
	return 0; 
}

bool primeCheck(long number){ 
	for(long j = 2; j<=number/2; j++){ 
		if((number%j) == 0){ 
			return false;
		}
	} 	
	return true;
} 

	 


		
 
