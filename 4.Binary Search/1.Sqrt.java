
import java.util.ArrayList;

class Sqrt{

	public static void main(String[] args){

            int res = sqrt(2147483647);
            System.out.println(res);

	}

	public static int sqrt(int a) {
                
                if(a == 1 || a == 2 || a == 3)
                    return 1;
                ArrayList<Long> digits = new ArrayList<>();

		long start = 0;
		long end = ((a/2)+2);
		long mid = 0;
                long numSqr = 0;
		while(start <= end){
                        
			mid = start + (end-start)/2;
			numSqr = mid*mid;
			if(numSqr == a){
                            return (int)mid;
			}
			else if(a < numSqr){
				end = mid-1;
			}
			else{
				start = mid+1;	
			}

		}

		return (int)start-1;

	}

}