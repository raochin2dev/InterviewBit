
/* Euclid's Theorem for GCD 

Since the remainders decrease with every step but can never be negative, a remainder rN must eventually equal zero, at which point the algorithm stops.[13] The final nonzero remainder rN−1 is the greatest common divisor of a and b. The number N cannot be infinite because there are only a finite number of nonnegative integers between the initial remainder r0 and zero.

*/

class gcd{

	public static void main(String[] args){
		
		int m = 24;
		int n = 16;
		int res = gcd(m,n);
                System.out.println(res);
	}


	public static int gcd(int m , int n){
                
		if(m == 0 || n == 0) return m+n;
		return gcd(n,m%n);		

	}

}