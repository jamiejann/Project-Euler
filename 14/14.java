import java.util.*;
import java.math.*; 

class Euler{ 
    long startingNumber = 1; 
    long finishingNumber = 1; 
    long currentNumber = 0; 
    long chain = 1; 
    long maxChain = 0; 

    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 

        final long startTime = System.nanoTime();

        while(startingNumber < 1000000){
            currentNumber = startingNumber; 
            while(currentNumber != finishingNumber){ 
                if((currentNumber%2) == 0){ 
                    currentNumber = even(currentNumber); 
                } else{ 
                    currentNumber = odd(currentNumber); 
                } 
                chain++; 
            } 
            if(chain > maxChain){ 
                maxChain = chain;
                System.out.println(startingNumber); 
                //System.out.println(maxChain); 
            } 
            startingNumber++;
        } 
        System.out.println("Chain Number: " +maxChain); 

        final long duration = System.nanoTime() - startTime;
        System.out.println("This Program finished in: " + duration/1000000000 + " seconds!");
    } 

    public long even(long number){ 
        return number/2;
    } 
    
    public long odd(long number){ 
        return number * 3 + 1; 
    } 
} 
