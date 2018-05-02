import java.math.BigInteger;
import java.util.*;

class Euler{ 

    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 
    } 

    public void updateCurrentProduct(ArrayList<Character> number){ 
        long currentProduct= 1; 
        for(int i=0; i< ADJACENT_DIGITS; i++){ 
             currentProduct*= Character.getNumericValue(number.get(i));
        } 
        numberInChar.remove(0); 

        if(currentProduct> currentLargestProduct){ 
            currentLargestProduct = currentProduct; 
            System.out.println(currentLargestProduct);
        } 

    } 
} 
