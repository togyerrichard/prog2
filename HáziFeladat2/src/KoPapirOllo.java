
import java.util.Random;
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
public class KoPapirOllo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String bemenet;
        bemenet=sc.nextLine();
        int gy=0,v=0,d=0,j=0;
        while(bemenet.compareTo("Vege")!=0)
        {
            int a=rand.nextInt(3);
            switch(bemenet){
                case "Ko":
                    if (a==0)
                    {
                        System.out.println("Döntetlen!");
                        ++d;
                    }
                    else if (a==1)
                    {
                        System.out.println("Vesztes!");
                        ++v;
                    }
                    else
                    {
                        System.out.println("Győztes!");
                        ++gy;
                    }
                    break;
                case "Papir":
                    if (a==1)
                    {
                        System.out.println("Döntetlen!");
                        ++d;
                    }
                    else if (a==2)
                    {
                        System.out.println("Vesztes!");
                        ++v;
                    }
                    else
                    {
                        System.out.println("Győztes!");
                        ++gy;
                    }
                    break;
                case "Ollo":
                    if (a==2)
                    {
                        System.out.println("Döntetlen!");
                        ++d;
                    }
                    else if (a==0)
                    {
                        System.out.println("Vesztes!");
                        ++v;
                    }
                    else
                    {
                        System.out.println("Győztes!");
                        ++gy;
                    }
                    break;
                default:System.out.println("Nem Kő vagy Papír vagy Olló!");
                        
            }
            j=gy+v+d;
            bemenet=sc.nextLine();
        }
        System.out.println("A "+j+" db értelmezett játékból "+gy+"alkalommal Győztél, "+v+" alkalommal Vesztettél és "+d+" Döntetlen született!");
    }
}
