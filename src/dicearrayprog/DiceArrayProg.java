package dicearrayprog;

import java.util.Scanner;
import java.util.Random;

public class DiceArrayProg 
{
    public static void main(String[] args) 
    {
         
        int [] frq=new int[7];
        Random r=new Random();
        
        for(int i=1; i<=10000; i++)
        {
            frq[r.nextInt(6)+1]++;
     
        }
        
        System.out.printf("%5s %15s\n","Face","Frequency");
        for(int i=1; i<frq.length; i++)
        {
            System.out.printf("%5d %15d\n", i,frq[i]);
        }
        
        int sum=0;
        for(int i=0; i<frq.length; i++)
        {
            sum=sum+frq[i];
        }
        System.out.printf("Count: %d", sum);
        
    
    }
    
}
