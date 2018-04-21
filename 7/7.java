class Seven{ 
	public static void main(String args[]){

	long index = 0; 
	long currentPrime = 0;
	long currentNumber = 0;

	while(index <= 10002){ 
		if(primeCheck(currentNumber)){ 
			currentPrime = currentNumber; 
			index++; 
		} 
		currentNumber++;
	} 
	System.out.println(currentPrime);
	} 


	public static boolean primeCheck(long number){ 
		for(long j = 2; j<=number/2; j++){ 
			if((number%j) == 0){ 
				return false; 
			} 
		} 
		return true; 
	} 

} 
