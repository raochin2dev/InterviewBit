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
import java.util.*;

public class Nby3RepeatedNumber {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(5);
        a.add(1);
        a.add(4);
        a.add(1);
        a.add(4);
        a.add(6);
        a.add(1);
        
        int num = repeatedNumber(a);
        System.out.println(num);
    }
    
    public static int repeatedNumber(final List<Integer> a) {
        int num = Integer.MIN_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int len = a.size();

        for(int i = 0; i < a.size(); i++){
            if(hm.containsKey(a.get(i))){
                hm.put(a.get(i),hm.get(a.get(i))+1);
            }
            else{
                hm.put(a.get(i),1);
            }

            if((hm.get(a.get(i))) > (len/3) )
                return a.get(i);

        }
        
        return -1;
    }
}
