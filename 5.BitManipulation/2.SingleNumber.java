import java.util.*;

class SingleNumber{

	public static void main(String[] args){
            List<Integer> a = new ArrayList<>();
//            a.add(1);
            a.add(2);
//            a.add(3);
//            a.add(2);
//            a.add(2);
//            a.add(4);
//            a.add(3);
//            a.add(3);
//            a.add(4);
//            a.add(4);
            int res = singleNumber(a);
            System.out.println(res);
	}

	public static int singleNumber(final List<Integer> a) {
		
		int size = a.size();
		int num = 0;
		int cnt1 = 0;
		for(int j = 0 ; j < 32 ; j++){
			cnt1 = 0;
			for(int i = 0 ; i < size ; i++){

				int bit = ((a.get(i) & (1 << j)) >> j);
				if(bit == 1)
					cnt1++;

			}

			if(cnt1%3 == 1)
				num += Math.pow(2,j); 

		}

		return num;

	}

}