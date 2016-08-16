
/*

If you had extra space to do it, the problem will be very easy. 
Store a copy of Arr in B.

And then for every element, do Arr[i] = B[B[i]]

Lets restate what we just said for extra space :

If we could somehow store 2 numbers in every index ( that is, Arr[i] can contani the old value, and the new value somehow ), then the problem becomes very easy. 
NewValue of Arr[i] = OldValue of Arr[OldValue of Arr[i]]

Now, we will do a slight trick to encode 2 numbers in one index. 
This trick assumes that N * N does not overflow.

1) Increase every Array element Arr[i] by (Arr[Arr[i]] % n)*n.
2) Divide every element by N.
Given a number as 
 A = B + C * N if ( B, C < N ) A % N = B A / N = C 

We use this fact to encode 2 numbers into each element of Arr.

*/

import java.util.*;

public class RearrangeArray {
	public void arrange(ArrayList<Integer> a) {
	   // arrange2(a,0,0,a.get(0));
	   // First step: Increase all values by (arr[arr[i]]%n)*n
        int n = a.size();
        for (int i = 0; i < n; i++)
            a.set(i,a.get(i)+((a.get(a.get(i)) % n)*n));
 
        // Second Step: Divide all values by n
        for (int i = 0; i < n; i++)
            a.set(i,a.get(i)/n);
	}
	
// 	public static void arrange2(ArrayList<Integer> a,int cnt,int i,int val) {
		
// 		if(a.size() == cnt){
// 			// do nothing;
// 		}
// 		else{
//             int temp = a.get(i);
// 			a.set(i,val);
// 			arrange2(a,++cnt,a.indexOf(i),temp);
// 		}

// 	}
    
    
}
