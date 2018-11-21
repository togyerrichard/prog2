/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F02;

/**
 *
 * @author Togyi
 */
public class Dolgozat extends SzeszesItal{

    public Dolgozat(String név, String kiszerelés, int ár, int alkoholtartalom) {
        super(név, kiszerelés, ár, alkoholtartalom);
    }
    
    public static SzeszesItal[] metodus(Ital [] t){
        
        SzeszesItal[] tomb=new SzeszesItal[3];
        int szamol=0;

        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  szamol++;
            }
        }
        
        SzeszesItal [] atmeneti=new SzeszesItal [szamol];
        int index=0;
        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  atmeneti[index]=szi;
                  index++;
            }
        }

        
        for(int i=0;i<atmeneti.length-1;i++) {
            for(int j=i+1;j<atmeneti.length;j++) {
               if(atmeneti[i].getAlkoholTartalom()<atmeneti[j].getAlkoholTartalom()) {
                    SzeszesItal tmp=atmeneti[i];
                    atmeneti[i]=atmeneti[j];
                    atmeneti[j]=tmp;
               }
            }
        }
              
        if(szamol<3) {
            return null;
        }
        else{
        tomb[0]=atmeneti[0];
        tomb[1]=atmeneti[1];
        tomb[2]=atmeneti[2];
       
        return tomb;
        }
        
    }
}
