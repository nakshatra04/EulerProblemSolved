/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//************Without using array************
/**
 *
 * @author naksh
 */
public class Problem2__v2 {
    
    int limitNumber;
    public Problem2__v2(int limit)
    {
        limitNumber = limit;
    }
    public static void main (String args[])
    {
        int a=1,b=2,c=0,sum=2;
        
        while (c<4000000)
        {
            c= a+b;
            
            a=b;
            
            b = c;
            
            if (c%2 == 0) 
            {
                sum+= c;
            }
            
        }
        System.out.println("Value of sum is ="+sum);
    }
    
}
