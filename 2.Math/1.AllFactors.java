/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.*;

/**
 *
 * @author cbrahmbh
 */
public class AllFactors {
    public static void main(String[] args) {
        
        ArrayList<Integer> res = allFactors(16);
        
        System.out.println(Arrays.toString(res.toArray()));
    }
    
    public static ArrayList<Integer> allFactors(int a) {
        
        ArrayList<Integer> factors = new ArrayList<>();
        ArrayList<Integer> factors2 = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(a) ; i++){
            if(a % i == 0){
                factors.add(i);
                if(i != (a/i)){
                    factors2.add(a/i);
                }
            }
        }
        
        for(int i = factors2.size()-1; i >= 0; i--){
            factors.add(factors2.get(i));
        }
        
        return factors;
    }
            
}
