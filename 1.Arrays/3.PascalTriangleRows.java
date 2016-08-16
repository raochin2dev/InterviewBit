public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    ArrayList<ArrayList<Integer>> res = genNums(arr,0,a);
	    
	    return res;
	}
	
	public static ArrayList<ArrayList<Integer>> genNums(ArrayList<ArrayList<Integer>> arr,int curr,int end){
	    
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(curr == end){
	        // do nothing or end
	        result  = arr;
	    }
	    else{
	        
	        ArrayList<Integer> subArr = new ArrayList<Integer>();
	        
	        if(curr == 0){
	            subArr.add(0,1);
	        }
	        else{

    	        for(int i = 0; i <= curr; i++){
    	            int val1 = 0,val2 = 0;
    	            try {
                        val1 = arr.get(curr-1).get(i); 
                    } catch ( IndexOutOfBoundsException e ) {
                        val1 = 0; 
                    }    
    	            try {
                        val2 = arr.get(curr-1).get(i-1); 
                    } catch ( IndexOutOfBoundsException e ) {
                        val2 = 0; 
                    }    
    	            int val = val1 + val2;
    	            subArr.add(i,val);
    	        }
	        }
	        arr.add(curr,subArr);
	        
	       result = genNums(arr,curr+1,end);
	        
	       
	    }
	    
	    
	     return result;
	    
	}
}
