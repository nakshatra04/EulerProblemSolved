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
public class Problem4 {
    
    public boolean checkPalindrome(int number)
    {
        int reverseNumber= 0, temp= number;
        for (int i=10, j=100000; i<=1000; i = i*10, j = j/100)
        {            
            reverseNumber =  reverseNumber + (number%i)*j;
            number = number - number%i;  
            
         
        }      
        if (temp > 100000)
        {
        if (reverseNumber == number)
        {
            //System.out.println("Rev Num :" +reverseNumber+" and Num is : "+number + "Original Number is :" +temp);
            return true;
        }
        else
            return false;
        }
        else return false;
  
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
