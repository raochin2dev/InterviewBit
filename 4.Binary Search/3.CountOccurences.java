import java.util.*;
/* Chaitanya's Solution , Correctness : YES , Time Complexity : NO  */
class SearchRange{

	public static void main(String[] args){
            
            List<Integer> a = new ArrayList<>();
//            a.add(2147483647);
//            a.add(2147483647);
//            a.add(10);
            a.add(8);
            a.add(8);
            a.add(8);
//            a.add(9);
//            a.add(10);
            ArrayList<Integer> res = searchRange(a,8);
            System.out.println(res);

	}

	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
                
                ArrayList<Integer> res = new ArrayList<>();
		int startI = BinarySearch(a,b);
		int endI = startI;
                int i = 0;
                int j = 0;
		if(startI == -1){
                    res.add(-1);
                    res.add(-1);
                    return res;
                }
		else{
                    
                    while(startI >= 0 && a.get(startI) == b){
                        startI--;
                    }
                    while(a.size() > endI && a.get(endI) == b){
                        endI++;
                    }
		}
                
                res.add(startI+1);
                res.add(endI-1);
                System.out.println(endI-startI-1);
                return res;
	}

	public static int BinarySearch(List<Integer> a,int b){

		int start = 0;
		int end = a.size()-1;
		int mid = start + ((end - start)/2);
                int lowestI = Integer.MAX_VALUE;
                boolean foundNum = false;
		while(start <= end){

			mid = (start + ((end - start)/2));
			if(a.get(mid) == b){
                            return mid;
                        }
			else if(a.get(mid) > b)
                            end = mid-1;
			else
                            start = mid+1;

		}
                
		return -1;

	}

}



/* Inbuilt Solution */

public class Solution {
	// DO NOT MODIFY THE LIST
	public int findCount(final List<Integer> a, int b) {
	     ArrayList<Integer> res = new ArrayList<>();
		int startI = BinarySearch(a,b);
		int endI = startI;
                int i = 0;
                int j = 0;
		if(startI == -1){
                    res.add(-1);
                    res.add(-1);
                    return 0;
                }
		else{

                while(startI >= 0 && a.get(startI) == b){
                    startI--;
                }
                while(a.size() > endI && a.get(endI) == b){
                    endI++;
                }

		}
                
        res.add(startI+1);
        res.add(endI-1);
        
        return endI-startI-1;
	}
	
	public static int BinarySearch(List<Integer> a,int b){

		int start = 0;
		int end = a.size()-1;
		int mid = start + ((end - start)/2);
                int lowestI = Integer.MAX_VALUE;
                boolean foundNum = false;
		while(start <= end){

			mid = (start + ((end - start)/2));
			if(a.get(mid) == b){
                            return mid;
                        }
			else if(a.get(mid) > b)
                            end = mid-1;
			else
                            start = mid+1;

		}
                
		return -1;

	}
}
