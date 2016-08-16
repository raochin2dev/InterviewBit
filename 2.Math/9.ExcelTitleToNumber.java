import java.util.*;

class ExcelColNum{

	public static void main(String[] args){
		int res = titleToNumber("BB");
                System.out.println(res);
	}

	public static int titleToNumber(String a) {
                
                HashMap<Character,Integer> hm = new HashMap<>();
		char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                for(int i = 0 ; i < alphabets.length; i++){
                    hm.put(alphabets[i],i+1);
                }
		char[] charArr = a.toCharArray();
		int num = 0;
		int j = 0;
		for(int i = (charArr.length)-1 ; i >= 0; i-- ){
			num += Math.pow(26,i)*hm.get(charArr[j]);
			j++;
		}
                
                return num;
	}

}