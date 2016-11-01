/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**** Problem StateMent *****/

/*
https://projecteuler.net/problem=4

A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
/**
 *
 * @author naksh
 */
public class Problem4__v2 {
    
    
    public boolean checkPalindrome (int number)
    {
        int reverseNumber = 0, temp;
        temp = number;
        while (temp> 0)
        {
            reverseNumber = reverseNumber*10 + temp % 10;
            temp = temp/10;           
        }
        
        if (number == reverseNumber)
            return true;
        else 
            return false;
    }
    public static void main (String args[])
    { int greatestnumber = 0;
        Problem4 obj = new Problem4();
        
        
        for (int i = 999; i>= 100 ; i--)
        {
            for (int j = 999 ; j >= 100; j--)
            {
                if ( obj.checkPalindrome(i*j) && i*j > greatestnumber)
                {    greatestnumber = i*j;
                System.out.println("i = " + i+ " and j = " + j);
                }
            }
        }
        
        System.out.println(greatestnumber);
    }
    
}
