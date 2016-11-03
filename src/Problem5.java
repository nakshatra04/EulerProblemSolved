/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**** Problem StateMent *****/

/*
https://projecteuler.net/problem=5  

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
/**
 *
 * @author naksh
 */
public class Problem5 {
    
    int[] numbers;
    int totalSize;
    public Problem5(int size)
    {
        numbers = new int[size+1];
        totalSize = size;
        for (int i = 1; i<=size;i++)
        {
            numbers[i]= i;           
        }
        
    }
    public static void main(String args[])
    {
        int mul= 1; 
        boolean ask = false;
        Problem5 obj = new Problem5(20);
        for (int i =2; i<=obj.totalSize; i++)
        { 
            ask = false;
            for (int j= 2; j<=obj.totalSize; j++)
            {
                if(obj.numbers[j] != 1)
                {   
                    if (obj.numbers[j]%i == 0)
                    {
                        
                        obj.numbers[j]= obj.numbers[j]/i;
                        ask = true;
                        
                    }
                }
            }
            if (ask){
                    System.out.println(i);
                    mul = mul * i;
                }
        }
        System.out.println(mul);
        for (int k = 2 ; k<=obj.totalSize; k++)
        {
            if (obj.numbers[k] !=1)
            {
            mul = mul* obj.numbers[k];
           
            }
        }
        System.out.println(mul);
    }
    
}
