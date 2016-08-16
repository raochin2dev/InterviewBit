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
public class SetMatrixZeros {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        b.add(1);
        b.add(1);
        b.add(1);
        b.add(1);
        c.add(1);
        c.add(0);
        c.add(1);
        c.add(1);
        d.add(1);
        d.add(1);
        d.add(1);
        d.add(1);
        
        a.add(b);
        a.add(c);
        a.add(d);
        
        setZeroes(a);
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.get(i).size(); j++){
                System.out.print(a.get(i).get(j));
            }
            System.out.println("");
        }
        
    }
    
    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        HashMap<Integer,Integer> hmR = new HashMap<>();
        HashMap<Integer,Integer> hmC = new HashMap<>();
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.get(i).size(); j++){
                int val = a.get(i).get(j);
                if(val == 0){
                    hmR.put(i,1);
                    hmC.put(j,1);
                }
            }
        }

        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.get(i).size(); j++){
                if(hmR.containsKey(i) || hmC.containsKey(j)){
                    a.get(i).set(j, 0);
                }
            }
        }

    }
}
