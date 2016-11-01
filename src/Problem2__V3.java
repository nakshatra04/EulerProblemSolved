/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ************Without using Array and checking if it is even
/**
 *
 * @author naksh
 */
public class Problem2__V3 {
    
    public static void main (String args[])
    {
        int a =1 , b= 2, c=0 , sum= 0;
        while (b<4000000)
        {
        sum = sum +b;
        c = a+b;
        a = b+c;
        b = a+c;
        
        
        }
        System.out.println(sum);
    }
}
