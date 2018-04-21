#include <iostream> 

using namespace std; 

int main(int argc, char ** argv) { 
	int An = 1; 
	int AnPlusOne = 2; 
	int MAX_VALUE = 4000000;
	int TERM = 0; 
	int SUM = 0; 
	int iteration = 3; 

	while (TERM < MAX_VALUE){ 
		TERM = An + AnPlusOne;
		
		//initialize for next iteration
		An = AnPlusOne; 
		AnPlusOne = TERM; 
		 
		if(TERM%2 == 0) { 
			SUM = SUM + TERM; 
		} 
		 
		cout << "Iteration: " << iteration  <<  "Term :" << TERM << endl;  
		iteration++; 
	} 
	
	cout << 2+SUM << endl; 
	return 0; 
} 
			

