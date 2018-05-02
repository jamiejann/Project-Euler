import java.util.*;
import java.math.*; 

class Euler{ 
    int SUM = 0; 
    int currentSumFactors = 0;
    int largestSumFactors = 0; 
    int counter = 1;

    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 

    final long startTime = System.nanoTime();


        while(currentSumFactors < 500){ 
            SUM += counter;
            currentSumFactors = checkFactorsAmount(SUM);

            if(currentSumFactors > largestSumFactors){ 
                largestSumFactors = currentSumFactors;
                System.out.println(SUM + " " + largestSumFactors);
            } 
            counter++; 
        } 
        System.out.println(SUM);

        final long duration = System.nanoTime() - startTime;
        System.out.println("This Program finished in: " + duration/1000000000 + " seconds!");
    } 

    public int checkFactorsAmount(int number){ 
        int factors = 0; 
        int squareRoot = (int) Math.floor(Math.sqrt(number)); 

        for(int i = 1; i< squareRoot; i++){ 
            if((number%i) == 0){ 
                factors += 2; 
            } 
        } 
        if(squareRoot * squareRoot == number){ 
            factors += 1;
        }
        return factors; 
    } 
} 
