import java.util.*;

class DifferentBits{

	public static void main(String[] args){
            
            
            ArrayList<Integer> A = new ArrayList<>();
            A.add(68);
//            A.add(93);
//            A.add(10);
//            A.add(15);
//            A.add(15);
            int res = cntBits(A);
            System.out.println(res);

	}
        
    public static int cntBits(ArrayList<Integer> A) {
        
        int maxLen = 0;
        int prevNum = 0;
        int size =A.size();
        int cnt = 0;
        int diff = 0;
        
        for(int j = 0 ; j < 32 ; j++ ){
            int count1 = 0;
            int count0 = 0;
            for(int i = 0 ; i < size ; i++){
                
                try{
                    if(((A.get(i) & ( 1 << j )) >> j) == 1) // Most important step , its to get the bit at "j"th position of number A.get(i) i.e (num & ( 1 << bitPos )) >> bitPos) will give you 0/1 at this pos
                        count1++;
                    else
                        count0++;
                }
                catch (IndexOutOfBoundsException e) {
                    count0++;
                }
            }
            diff += 2*count1*count0;
        }
        
        return diff;
    }       
        
}