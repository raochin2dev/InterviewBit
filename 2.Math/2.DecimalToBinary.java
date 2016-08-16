/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author cbrahmbh
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        
        String binStr = findDigitsInBinary(2);
        System.out.println(binStr);
        
    }
    // Generic algorithm can be changed to any Base system i.e if you want to convert DecimalToHexa then just change 2 to 16
    public static String findDigitsInBinary(int a) {
        String res= ""; 
        if(a == 0)
            return "0";
        while(a > 0){
            int rem = a % 2;
            res += rem;
            a = a/2;
        }
        
        // Reverse the string to get proper result as we had gone from last to digit to first digit
        
        res = new StringBuffer(res).reverse().toString();
        
        return res;
    }
 
}
