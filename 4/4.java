class Four{ 

	public static void main(String args[]){ 

		int MAX_VALUE = 1000;
		int first = 0;
		int second = 0; 
		int currentValue = 0; 
		int currentMaxPalindrome = 0; 
		int i,j;

		for(i = 0; i<MAX_VALUE; i++){ 
				
			for(j = 0; j < MAX_VALUE; j++){ 
				currentValue = i*j; 
				if(checkIfPalindrome(currentValue)){
					if(currentValue > currentMaxPalindrome){ 
						currentMaxPalindrome = currentValue; 
					} 
				} 
			} 
		currentValue = i*j;
		if(checkIfPalindrome(currentValue)){
			if(currentValue > currentMaxPalindrome){ 
				currentMaxPalindrome = currentValue; 
			} 
		} 
	} 

	System.out.println(currentMaxPalindrome);

	} 

	public static boolean checkIfPalindrome(int number){ 
		char [] numbers = String.valueOf(number).toCharArray();
		int front = 0; 
		int back = numbers.length - 1; 
		while( back > front){ 
			if( numbers[front] != numbers[back]){ 
				return false; 
			} 
			++front; 
			--back;
		} 
		return true;
	} 
} 

