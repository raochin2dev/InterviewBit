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
public class PracticeQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean res = isPower(1);
        System.out.println(res);
    }
    
    
    public static boolean isPower(int a) {
        
        if(a == 1)
            return true;
        
        boolean res = false;
        
        for(int i = 1; i <= Math.sqrt(a); i++){
            for (int j = 1; j <= Math.sqrt(a); j++) {
                if((Math.pow(i, j) == a && j > 1) || (Math.pow(j, i) == a && i > 1)){
                    res = true;
                    break;
                }
            }
            
            if(res)
                break;
        }
        
        return res;
    }
    
}
