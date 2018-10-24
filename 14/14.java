import java.util.*;
import java.math.*; 

class Euler{ 
    long startingNumber = 1; 
    long currentNumber = 0; 
    long chain = 1; 
    long maxChain = 0; 
    long numberOfMaxchain=0;

    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 
		
		for(currentNumber=0; currentNumber<1000000; currentNumber++){
			long currentChain=calculateChainNumber(currentNumber);
			if(currentChain > maxChain){
				maxChain=currentChain;
				numberOfMaxchain=currentNumber;
			}
			System.out.println("currently: " + currentNumber);
		}
		//long target=13;
		//long chainNumber = calculateChainNumber(target);
				
		System.out.println("number: " + numberOfMaxchain);
    } 

    public long even(long number){ 
        return number/2;
    } 
    
    public long odd(long number){ 
        return number * 3 + 1; 
    } 

	public long calculateChainNumber(long number){
		while(number != 1){
			if((number%2)==0){
				number=even(number);
			} else{
				number=odd(number);
			}
			chain++;
		}
		return chain;
	}
} 
