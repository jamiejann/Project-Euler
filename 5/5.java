class Five{ 

	public static void main(String args[]){ 
		boolean divisible; 
		boolean found = false; 
		long currentNumber=1;
		while(!found){ 
			if(checkIfDivisible(currentNumber)){ 
				found = true; 	
				System.out.println(currentNumber);
			} 
			currentNumber +=1; 
		} 
	}

	public static boolean checkIfDivisible(long number){ 
		for(int i=1; i<=20; i++){ 	
			if((number%i) !=  0){
				return false;
			}
		} 
		return true;
	}
} 		
