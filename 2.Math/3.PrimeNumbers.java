public class Solution {
	public ArrayList<Integer> sieve(int a) {
	    Integer[] primes = new Integer[a];
	    
	    for(int i = 0 ; i < a ; i++){
	        primes[i] = 1;
	    }
	    
	    for(int i = 2; i < Math.sqrt(a) ; i++){
	        if(primes[i] == 1){
	            for(int j = 2 ; i*j < a ; j++){
	                primes[i*j] = 0;
	            }
	        }
	    }
	    primes[0] = 0;
	    primes[1] = 0;
	    ArrayList<Integer> res = new ArrayList<>();
	    for(int i = 0; i < a ; i++){
	        if(primes[i] == 1)
	            res.add(i);
	    }
	    
	    
	    return res;
	    
	    
	}
}
