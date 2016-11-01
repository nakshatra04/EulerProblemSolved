/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**** Problem StateMent *****/

/*
https://projecteuler.net/problem=3

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
/**
 *
 * @author naksh
 */
public class Problem3 {
    long myNumber, largestPrime;
    public Problem3(long n)
    {
        myNumber=n;
    }
    public boolean prime (long checkPrime)
    {
        for (long i = 2; i<checkPrime; i++)
        {
            if (checkPrime%i ==0)
                return false;
        }
        return true;
    }
    public static void main (String args[])
    {
                
        Problem3 obj = new Problem3(600851475143L);
        for (long i =2; i*i<obj.myNumber;i++)
        {
            if (obj.myNumber % i == 0)
            {
                if (obj.prime(i))
                {
                    obj.largestPrime= i;
                }
            }
                     
        }
        System.out.println(obj.largestPrime);
    }
    
}
