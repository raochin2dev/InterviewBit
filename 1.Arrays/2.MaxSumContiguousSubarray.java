public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    
	    // Divide & Conquer
    //     Integer[] arr = new Integer[a.size()];
    //     arr = a.toArray(arr);
	   // int maxSum = maxSubArrayFn(arr,0,arr.length-1);
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        Iterator<Integer> aIt = a.iterator();
        while (aIt.hasNext()) {
            sum = sum + aIt.next();
            maxSum = Math.max(sum, maxSum);
            if(sum < 0)
                sum = 0;
            
            
        }
        
        return maxSum;
	    
	}
	
	public static int maxSubArrayFn(final Integer[] a,int l, int h) {
        
        int maxSum = 0;
	
        if(l == h)
            return a[l]; 
        
//        Integer[] arr = (Integer[]) a.toArray();
        int m  = (l+h)/2;
        
        maxSum = Math.max(maxSubArrayFn(a,l,m), maxSubArrayFn(a,m+1,h));
        maxSum = Math.max(maxSum,maxSubArraySum(a,l,m,h));
        
        return maxSum;
    }

    private static int maxSubArraySum(Integer[] a, int l, int m, int h) {

        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        
        int sum = 0;
        for(int i = m; i >= l ; i--){
            sum = sum+a[i];
            if(sum > leftSum)
                leftSum = sum;
        }


        sum = 0;
        for(int i = m+1; i <= h ; i++){
            sum = sum+a[i];
            if(sum > rightSum)
                rightSum = sum;
        }
        
        return leftSum+rightSum;
        
    }
}
