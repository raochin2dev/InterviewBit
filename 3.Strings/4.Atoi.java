/*

    Take care of all the corner cases possible


*/


class Atoi{

	public static void main(String[] args){

//            int res = atoi("+99");
//            int res = atoi("-99");
//            int res = atoi("++99");
//            int res = atoi("@ 123");
//            int res = atoi("-91@123");
//            int res = atoi("-2147483648");
//            int res = atoi("-2147483649");
//            int res = atoi("2147483647");
            int res = atoi("2147483648");
            System.out.println(res);
            
	} 


	public static int atoi(final String a) {
                
		char[] aArr = a.trim().toCharArray();
		boolean expectIntNext = false;
                boolean isNegative = false;
		long ans = 0;
		for (int i = 0 ; i < aArr.length ; i++ ) {
			

			if(aArr[i] == '+' || aArr[i] == '-'){
                                
                                if(aArr[i] == '-')
                                    isNegative = true;
				// If next char is + / - then return 0 as the string is of type ++99
				if(expectIntNext)
					return 0;

				expectIntNext = true;
			}
			else if(Character.isDigit(aArr[i])){
				int digit = Character.getNumericValue(aArr[i]);
                                if(isNegative && (-1*(ans*10+digit)) < -2147483648){
                                    return Integer.MIN_VALUE;
                                }
                                else if(!isNegative && (ans*10+digit) > 2147483647){
                                    return Integer.MAX_VALUE;
                                }
                                else{
                                    ans = ans*10+digit;
                                }

			}
			else{
				break;	
			}
		}
            
            return (isNegative)?(int)ans*-1:(int)ans;

	}


}