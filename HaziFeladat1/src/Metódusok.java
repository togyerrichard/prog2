
import static java.lang.Math.abs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Metódusok {
    public static void main(String[] args) {
        //1. )
            növekvő(3,10,2);
        //2. )
            minmax(2,13.9,3);
        //3. )
            negyszam(1,2,3,-4);
        //4. )
            szigoru(6,6,4);
        //5. )
            szökőév(1599,2010);
        //6. )
            dolgozat(4);
        //7. )
            hányados(20,1);
        //8. )
            prim(13);
        //9. )
            fibo(6);
        //10.)
            forditott(321);
        //11.)
            faktorialis(4);
        //12.)
            kvaloszt(10,20,2);
        //13.)
            fibo2(3);
        //14.)
            keresget(1000);
    }
    //1. )
    public static void növekvő (int a, int b, int c)
    {
        int[] tömb = {a,b,c} ;
        int i,j;
        for(j=0;j<3-1;j++){
            for(i=1;i<3;i++){
                if(tömb[i]<tömb[j]){
                    int csere=tömb[j];
                    tömb[j]=tömb[i];
                    tömb[i]=csere;
                }
            }
        }
        for (i=0;i<3;i++)
            System.out.println(tömb[i]);
    }
    //2. )
    public static void minmax (double a, double b, double c){
        double min = 0,max = 0;
        if (a<b && a<c)
            min=a;
        if (b<a && b<c)
            min=b;
        if (c<a && c<b)
            min=c;
        if (Math.abs(a)>Math.abs(b) && Math.abs(a)>Math.abs(c))
            max=Math.abs(a);
        if (Math.abs(b)>Math.abs(a) && Math.abs(b)>Math.abs(c))
            max=Math.abs(b);
        if (Math.abs(c)>Math.abs(a) && Math.abs(c)>Math.abs(b))
            max=Math.abs(c);
        System.out.println("A 3 szám minimuma: " +min +", abszolút értékeinek maximuma: " +max);
    }
    //3. )
    public static void negyszam (double a, double b, double c, double d){
        if (d>=0)
            System.out.println(a +", "+c+", "+b+", "+d);
        else
            System.out.println(a +", "+b+", "+d+", "+c);
    }
    //4. )
    public static boolean szigoru (double a, double b, double c){
        if (a<=0 || b<=0 || c<=0)
            return false;
        if (a>b+c || b>a+c || c>a+b)
            return false;
        else
            return true;
    }
    //5. )
    public static void szökőév(int év1, int év2){
        int csere;
        if (év2<év1){
            csere=év2;
            év2=év1;
            év1=csere;
        }
        int counter=0,i=0;
        for(i=év1;i<=év2;++i)
        {
            if (i%4==0 && i%100!=0)
                ++counter;
            if(i%400==0)
                ++counter;
        }
        System.out.println("A 2 évszám között ennyi szökőév van: "+counter);
    }
    //6. )
        public static void dolgozat(int a){
            String osztályzat;
            switch(a){
                case 1: osztályzat="Elégtelen";
                break;
                case 2: osztályzat="Elégséges";
                break;
                case 3: osztályzat="Közepes";
                break;
                case 4: osztályzat="Jó";
                break;
                case 5: osztályzat="Jeles";
                break;
                default: osztályzat="Érvénytelen az érték";
                break;
            }
            System.out.println(osztályzat);
        }
    //7. )
        public static void hányados(int a, int b){
            int hány=0;
            while (a>=b){
                hány=hány+1;
                a=a-b;
            }
            System.out.println(hány);
        }
    //8. )
        public static void prim (int n){
            int osztók_száma=0;
            int i;
            for (i=1;i<=n;++i)
            {
                if (n%i==0)
                    osztók_száma++;
            }
            if (osztók_száma==2)
                System.out.println("Prím!");
            else
                System.out.println("Nem prím!");
        }
    //9. )
        public static void fibo(int n){
            int a=0,b=1;
            if (n==1)
                System.out.println(a);
            else if (n==2)
                System.out.println(a+", "+b);
            else{
                int c=a+b;
                System.out.println(a+", "+b+", "+c);
                int k=3;
                while (k<n)
                {
                    a=b;
                    b=c;
                    c=a+b;
                    System.out.println(c);
                    k++;
                }
            }
        }
    //10.)
        public static void forditott(int n){
             int újszám=0;
             while (n!=0){
                 újszám=újszám*10+(n%10);
                 n=n/10;
             }
             System.out.println(újszám);
            }
    //11.)
        public static void faktorialis(int n){
            long fakt = 1;
            int i;
            for (i=1; i<=n;++i)
            {
                fakt=i*fakt;
            }
            System.out.println(fakt);
        }
    //12.)
        public static void kvaloszt(int n1, int n2, int k){
            int i;
            for (i=n1;i<=n2;++i){
                if(i%k==0)
                    System.out.print(i +", ");
            }
        }
    //13.)
        public static void fibo2(int n){
            int a=1,b=0;
            while (b<=n){
                b=a+b;
                a=b-a;
            }
            System.out.println();
            System.out.println(b);
            
        }
    //14.)
        public static void keresget(int n){
            int i,j,k;
            for (i=1;i<10;++i)
            {
                if (i==i*i*i)
                    System.out.print(i +", ");
            }
            for (j=10;j<100;++j){
                if ((j%10*j%10*j%10+j*j*j)==i)
                    System.out.print(i+", ");
            }
            for (i=100;i<n;++i){
                if ((i%100*i%100*i%100+i%10*i%10*i%10+i*i*i)==i)
                    System.out.print(i+", ");
            }
        }
}