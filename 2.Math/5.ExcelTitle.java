/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author Chaitanya
 */
public class ExcelTitle {
    public static void main(String[] args) {
        String res = convertToTitle(52);
        System.out.println(res);
    }
    
    public static String convertToTitle(int a) {
	    
        String[] alphaSys = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"} ;
        
	String res = "";
        while(a > 0){
            int rem = (a-1)%26;
            res += alphaSys[rem];
            a = (a-1)/26;
        }
        
        res = new StringBuffer(res).reverse().toString();
        
        return res;
    }
}
