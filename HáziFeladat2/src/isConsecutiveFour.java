
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class isConsecutiveFour {
    public static boolean isConsecutiveFour(int[] values){
        if(values.length>4)
        {
            for(int i=3;i<values.length;i++)
            
                if(values[i]==values[i-1] && values[i-1]==values[i-2] && values[i-2]==values[i-3])
                    return true;
            return false;
         
        }
        else
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        
        while(sc.hasNextInt()){
            
            int k=sc.nextInt();
            
            if (k==0){
                
                break;
            }
            
            n++;

        }
        
        int[] t=new int[n];
        System.out.println(isConsecutiveFour(t));
    }
}
