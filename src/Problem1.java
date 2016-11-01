
import java.io.Console;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**** Problem StateMent *****/

/*
https://projecteuler.net/problem=1

If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/


/**
 *
 * @author naksh
 */
public class Problem1 {
    
    int sumTotal, sum3, sum5, sum15;
    int size;
    
    public Problem1(int number)
    {
        size = number;
    }
    
    public int mutipleOf3()
    {
       for (int i=0; i<size; i++)
       {
           if (i%3 == 0)
           {
               sum3 = sum3+ i;
           }
       }
       
        return sum3;       
    }
    public int mutipleOf5()
    {
       for (int i=0; i<size; i++)
       {
           if (i%5 == 0)
           {
               sum5 = sum5+ i;
           }
       }
       
        return sum5;       
    }
    public int mutipleOf15()
    {
       for (int i=0; i<size; i++)
       {
           if (i%15 == 0)
           {
               sum15 = sum15+ i;
           }
       }
       
        return sum15;       
    }
    
    
    public void printMessage(String msg)
    {
        System.out.println(msg);
    }
    
    public static void main(String args[])
    {
        Problem1 obj = new Problem1(1000);
        obj.sumTotal = obj.mutipleOf3() + obj.mutipleOf5() - obj.mutipleOf15();
        obj.printMessage("Total is = " + obj.sumTotal);
    }
    
}
