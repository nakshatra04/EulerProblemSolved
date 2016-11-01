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
        Problem5 obj = new Problem5(10);
        for (int i =1; i<=obj.totalSize; i++)
        {
            for (int j= 2; j<=obj.totalSize; j++)
            {
                if(obj.numbers[i] != 1)
                {   
                    if (obj.numbers[i]%j == 0)
                    {
                        obj.numbers[i]= obj.numbers[i]/j;
                        mul = mul*j;
                    }
                }
            }
        }
        for (int j=1; j<=obj.totalSize; j++)
        {
            
            
            //System.out.println(obj.numbers[j]);
        }
        System.out.println(mul);
    }
    
}
