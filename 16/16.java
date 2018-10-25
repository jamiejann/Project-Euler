import java.util.*;
import java.math.*; 

class Euler{ 
	int sum=0;
    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 
		BigInteger base = new BigInteger("2");

		BigInteger powered = base.pow(1000);

		String powerchar = powered.toString();
		System.out.println(powerchar);

		for(int i = 0; i < powerchar.length(); i++) {
			if(Character.isDigit(powerchar.charAt(i))) {
					sum = sum + Integer.parseInt(powerchar.charAt(i) + "");
			} 
		}

		System.out.println(sum);
	} 
}
