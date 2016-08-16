/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author civa-raochin2
 */

/*

- lr , ub , rl  , bu , level
- m n => total elements 
while eleCnt < total 

if lr
inc col until colsize - 1 (lastsecond col of current matrix) 

elif ub
inc row until rowsize - 1 (lastsecond row of current matrix)

elif rl 
dec col until rowsize - 1 (second row of current matrix)

elif bu
dec row until colsize - 1 (second row of current matrix)	 
inc level



 */
public class SpiralOrderMatrix {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
//        a.add(3);
//
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
//        b.add(6);
//
//        
        ArrayList<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
//        c.add(9);

        
        List<ArrayList<Integer>> A = new ArrayList<>();
        A.add(a);
        A.add(b);
        A.add(c);
        System.out.println(A);

//        ArrayList<Integer> res = spiralMatrix(A);
        
//        int[][] B = new int[][]{
//            {335, 401, 128, 384, 345, 275, 324, 139, 127, 343, 197, 177, 127, 72, 13, 59},
//            {102, 75, 151, 22, 291, 249, 380, 151, 85, 217, 246, 241, 204, 197, 227, 96},
//            {261, 163, 109, 372, 238, 98, 273, 20, 233, 138, 40, 246, 163, 191, 109, 237},
//            {179, 213, 214, 9, 309, 210, 319, 68, 400, 198, 323, 135, 14, 141, 15, 168}
//    };
        
        int[][] B = new int[][]{{336, 248, 164, 85, 230},
                                {114, 78, 93, 86, 109},
                                {318, 121, 28, 187, 77},
                                {269, 56, 185, 267, 219},
                                {67, 352, 15, 237, 396}
                               };



//        int[][] B = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        int[][] B = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> res = spiralMatrix1(B);
        
        System.out.println(res.toString());
    }

    public static ArrayList<Integer> spiralMatrix(List<ArrayList<Integer>> a) {

        int m = a.size();
        int n = a.get(0).size();
        int total = m * n;
        
        
        int cnt = 0;
        int level = 0;
        int row = 0, col = 0;
        int lr = 1, rl = 0, ub = 0, bu = 0; // Directions
        ArrayList<Integer> result = new ArrayList<>();

        Integer[][] A = new Integer[a.size()][];
        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> row1 = a.get(i);
            A[i] = row1.toArray(new Integer[row1.size()]);
        }
        
        if(total == 1){
            result.add(A[0][0]);
            return result;
        }

        
        while (cnt < total) {
            
//            System.out.println((row+level)+" "+(col+level)+" "+cnt);
            if (lr == 1) {
                
//                if(n % 2 == 0){
//                    
//                }
                
                // Stop at the last second col
                if ((col + level) < (n -level - 1)) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    col++;
                }
                else{
                    lr = 0;
                    ub = 1;
                }
            }
            else if(ub == 1){
                
                // Stop at the last second row
                if ((row + level) < (m -level - 1)) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    row++;
                }
                else{
                    ub = 0;
                    rl = 1;
                }
            }
            else if(rl == 1){
                
                // Stop at the second column
                if ((col + level) > level) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    col--;
                }
                else{
                    rl = 0;
                    bu = 1;
                }
            }
            else if(bu == 1){
                
                // Stop at the second column
                if ((row + level) > level) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    row--;
                }
                else{
                    bu = 0;
                    lr = 1;
                    level++;
                }
            }

        }

        return result;
    }

    
    
    public static ArrayList<Integer> spiralMatrix1(int[][] A) {
        
        ArrayList<Integer> result = new ArrayList<>();

        int m = A.length;
        
        if(m == 0){
            return result;
        }
        
        int n = A[0].length;
        int total = m * n;
        
        
        int cnt = 0;
        int level = 0;
        int row = 0, col = 0;
        int lr = 1, rl = 0, ub = 0, bu = 0; // Directions
        
        if(total == 1){
            result.add(A[0][0]);
            return result;
        }
        
        while (cnt < total) {
            
            if (lr == 1) {
                
                // Stop at the last second col
                if ((col + level) < (n - level - 1)) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    col++;
                }
                else{
                    lr = 0;
                    ub = 1;
                }
            }
            else if(ub == 1){
                
                // Stop at the last second row
                if ((row + level) < (m - level - 1)) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    row++;
                }
                else{
                    ub = 0;
                    rl = 1;
                }
            }
            else if(rl == 1){
                
                // Stop at the second column
                if ((col + level) > level) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    col--;
                }
                else{
                    rl = 0;
                    bu = 1;
                }
            }
            else if(bu == 1){
                
                // Stop at the second column
                if ((row + level) > level) {
                    result.add(A[row + level][col + level]);
                    cnt++;
                    row--;
                }
                else{
                    bu = 0;
                    lr = 1;
                    level++;
                    if((m % 2) != 0 && (cnt == (total-1))){
                        result.add(A[row + level][col + level]);
                        cnt++;
                    }

                }
            }
            

        }

        return result;
    }

    
}
