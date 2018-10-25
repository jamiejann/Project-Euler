import java.util.*;
import java.math.*; 

class Euler{ 

    public static void main(String args[]){
        Euler euler = new Euler(); 
        euler.start();
    } 

    public void start(){ 
		//Binomial Coefficient
		//The number of lattice paths from (0,0) to (n,k) 
		//is equivalent to the binomial coefficient
		//n+k choose n.
		//n choose k = (n!/(k!(n-k)!))

		BigInteger Fac20 = calculateFactorial(new BigInteger("20"));	
		BigInteger Fac40 = calculateFactorial(new BigInteger("40"));
		BigInteger bottom = Fac20.multiply(Fac20);
		
		BigInteger ans = Fac40.divide(bottom);

		System.out.println(ans);
    } 

	public BigInteger calculateFactorial(BigInteger number){
		if(number.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return number.multiply(calculateFactorial(number.subtract(BigInteger.ONE)));
	} 
}
