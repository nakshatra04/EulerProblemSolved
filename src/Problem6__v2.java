/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naksh
 */
public class Problem6__v2 {
    
    public static void main (String args[])
    {
        int n = 100;
        //calculation difference between sum of sq and sq of sum
        
        n = (((n)*(n+1)*(n)*(n+1))/4) - (((n)*(n+1)*(2*n+1))/6);
        System.out.println("Difference = " + n);
    }
    
}
