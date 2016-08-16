/*
The idea is:

The ZERO comes from 10.

The 10 comes from 2 x 5

And we need to account for all the products of 5 and 2, like 4×5 = 20 …

How many multiples of 5 are there in the numbers from 1 to 100?

Because 100 ÷ 5 = 20, so, there are twenty multiples of 5 between 1 and 100.

But wait, actually 25 is 5×5, so each multiple of 25 has an extra factor of 5, e.g. 25 × 4 = 100，which introduces an extra of zero.

So, we need to know how many multiples of 25 are there between 1 and 100? Since 100 ÷ 25 = 4, there are four multiples of 25 between 1 and 100.

Finally, we get 20 + 4 = 24 trailing zeroes in 100!


*/

class TrailingZeros{

	public static void main(String[] args){

            int res = trailingZeroes(23);
            System.out.println(res);

	}

	public static int trailingZeroes(int a) {
		
		int nooffive = 0;
                int denom5 = 5;
		while(denom5 <= a){
			nooffive += a/denom5;
			denom5 *= 5;
		}

             return nooffive;
	}

}