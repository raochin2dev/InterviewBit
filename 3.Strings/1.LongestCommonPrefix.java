import java.util.*;

class LongestCommonPrefix{

	public static void main(String[] args){
            ArrayList<String> a = new ArrayList<>();
            a.add("abcdefgh");
            a.add("abcghijk");
            a.add("absefgh");
            String s = longestCommonPrefix(a);
            System.out.println(s);
        }


	public static String longestCommonPrefix(ArrayList<String> a) {

            ArrayList<Character> prevCommonPrefix = new ArrayList<>();
            for(int i = 0; i < a.size(); i++){

                    char[] charArr = a.get(i).toCharArray();
                    ArrayList<Character> charList = new ArrayList<>();
                    for (int j = 0; j < charArr.length; j++)
                        charList.add(charArr[j]);

                    if(prevCommonPrefix.size() > 0){
                            prevCommonPrefix = (ArrayList<Character>) getCommonPrefix(prevCommonPrefix,charArr);
                    }
                    else{
                            prevCommonPrefix = charList;
                    }

            }

            StringBuilder result = new StringBuilder(prevCommonPrefix.size());
            for (Character c : prevCommonPrefix) {
              result.append(c);
            }
            String output = result.toString();    
                
             return output;
	}


	public static ArrayList<Character> getCommonPrefix(ArrayList<Character> prevCommonPrefix,char[] charArr){

		int l1 = prevCommonPrefix.size();
		int l2 = charArr.length;
		int minL = (l1 < l2)?l1:l2;
		ArrayList<Character> commonPrefix = new ArrayList<>();
		for(int i = 0; i < minL; i++){
			if(prevCommonPrefix.get(i) == charArr[i]){
				commonPrefix.add(charArr[i]);
			}
		}

		return commonPrefix;

	}
}