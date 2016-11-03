/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naksh
 */
public class Problem6 {
    
    public static void main (String args[])
    {
        int sumofSq =0 , sqofSum=0;
        int size = 100;
        for (int i = 1; i<=size ; i++)
        {
            sumofSq = sumofSq + i*i;
            sqofSum = sqofSum + i;
        }
        sqofSum = sqofSum* sqofSum;
        System.out.println("Difference is = "+ (sqofSum- sumofSq));
        
    }
    
}
