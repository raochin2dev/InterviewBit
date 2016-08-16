class LongestPalindromeSubString{

	public static void main(String[] args){

            String ans = longestPalindrome("abaa");
            System.out.println(ans);

	}

	public static String longestPalindrome(String a) {

		char[] aArr = a.toCharArray();
		String longestPalSubStr = ""; 
		String curPalSubStr1 = ""; 
		String curPalSubStr2 = ""; 
		for(int i = 0 ; i < aArr.length ; i++){

			curPalSubStr1 = checkLongestPalindrome(i, i, aArr,a);			
			curPalSubStr2 = checkLongestPalindrome(i, i+1, aArr,a);			

			if(curPalSubStr1.length() > curPalSubStr2.length() && curPalSubStr1.length() > longestPalSubStr.length() ){

                            longestPalSubStr = curPalSubStr1;				

			}
			if(curPalSubStr2.length() > curPalSubStr1.length() && curPalSubStr2.length() > longestPalSubStr.length() ){

                            longestPalSubStr = curPalSubStr2;				

			}
		}

		return longestPalSubStr;

	}


	public static String checkLongestPalindrome(int ptr1,int ptr2,char[] aArr,String a){

		String ans = "";
                
                /* For Loop Timeout */
		// Compare Left & Right Sides of the pointer & continue until both the characters keep coming same
//		for(int l = ptr1, r = ptr2; l >= 0 && r < aArr.length ; l--,r++){
//			if(aArr[l] != aArr[r]){
//				break;
//			}
//			else{
//                            if(l == r)
//                                ans += aArr[l];
//                            else
//				ans = aArr[l]+ans+aArr[r];
//			}
//		}
//
//		return ans;

                /* While Loop Properly working */  
                while (ptr1 >= 0 && ptr2 <= aArr.length - 1 && aArr[ptr1] == aArr[ptr2]) {
                        ptr1--;
                        ptr2++;
                }
                return a.substring(ptr1 + 1, ptr2);
	}			

}