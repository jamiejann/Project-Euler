class Six{ 
	public static void main(String args[]){
		int MAX_VALUE = 100; 

		int sumOfSquares = calculateSumOfSquares(MAX_VALUE); 
		int squareOfSums = calcualteSquareOfSums(MAX_VALUE); 
		int answer = squareOfSums - sumOfSquares;
		System.out.println(answer); 
	} 

	public static int calculateSumOfSquares(int number){
		int sum=0; 
		for(int i=1; i<=number; i++){ 
			int square = i*i;
			sum += square; 
		} 
		return sum; 
	} 

	public static int calcualteSquareOfSums(int number){ 
		int sum = 0; 
		for(int i = 0; i <= number; i++){ 
			sum = sum + i; 
		} 
		return sum * sum;
	} 
} 

