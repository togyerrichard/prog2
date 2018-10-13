/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegyesFeladat;

import java.util.Date;

/**
 *
 * @author Togyi
 */
public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátum;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátum=new Date();
    }
    
    public String getRendszám(){
        return rendszám;
    }
    public int getMotorTeljesítmény(){
        return motorTeljesítmény;
    }
    public Date getGyártásDátum(){
        return gyártásDátum;
    }
    public void setRendszám(String rendszám){
        this.rendszám=rendszám;
    }

    @Override
    public String toString() {
        return "Aut\u00f3" + "rendsz\u00e1m=" + rendszám + "\t motorTeljes\u00edtm\u00e9ny=" + motorTeljesítmény + "\t gy\u00e1rt\u00e1sD\u00e1tum=" + gyártásDátum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Autó)){
            return false;
        }
        Autó a=(Autó) obj;
        
        return this.rendszám.equals(a.getRendszám());
    }
    
    
    
}
   
