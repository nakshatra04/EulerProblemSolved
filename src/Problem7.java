/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naksh
 */
public class Problem7 {

    private static int count = 1;
    
    public static void main (String args[])
    {
        
        int i,j;
        boolean c,p= true;
        int size;
        size = 999999999;
        
        for (i=3; i<=size+1;i= i+2)
        { p = true;
            
            for (j=3; j<i; j = j+ 2)
            {
                if (i%j == 0)
                    p = false;
            }
            if (p)
            {
                count ++;
                if (count == 10001)
                {
                System.out.println(i);
                break;
                }
            }
        }
    }
}
    

