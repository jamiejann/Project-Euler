         
import java.math.BigInteger;
import java.util.*;

class Euler{ 

    long MAX_VAlUE = 2000000; 
    long currentNumber = 2; 
    long SUM = 0; 

    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 
        while(currentNumber < MAX_VAlUE){ 
            if(checkIfPrime(currentNumber)){ 
                SUM += currentNumber; 
            } 
            currentNumber++;
        } 
        System.out.println(SUM); 

    } 


    public boolean checkIfPrime(long number){ 
        for(long j = 2; j<=number/2; j++){ 
            if((number%j) == 0){ 
                return false;
            } 
        } 
        return true; 
    } 

} 
