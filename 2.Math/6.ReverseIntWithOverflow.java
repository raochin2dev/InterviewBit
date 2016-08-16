/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import javafx.scene.image.PixelFormat;

/**
 *
 * @author Chaitanya
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int ans = reverse(-1146467285);
        System.out.println(ans);
    }
    
    public static int reverse(int a) {
        
        long ans = 0;

        if(a < -2147483647 || a > 2147483646)
            return (int)ans;

        boolean isNegative = false;
        if(a < 0){
            a = a*-1;
            isNegative = true;
        }
        while(a > 0){
            int rem = a%10;
            if(ans*10 > 2147483647){
                ans = 0;
                break;
            }
            ans = (ans*10)+rem;
            
            a = a/10;
        }
        ans = (isNegative)?(ans*-1):ans;
       
        return (int)ans;
        
    }
}
