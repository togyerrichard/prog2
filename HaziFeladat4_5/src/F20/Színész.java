/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Togyi
 */
public class Színész implements Comparable<Színész>{
    private String név;
    private List<Film> film;

    public Színész(String név) {
        this.név = név;
        this.film = new ArrayList();
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public List<Film> getFilm() {
        return film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    @Override
    public int compareTo(Színész t) {
         if(this.film.size()==t.getFilm().size()){
             return this.név.compareTo(t.getNév());
         }else{
             return (-1)*Integer.compare(this.film.size(), t.getFilm().size());
         }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(név).append("\n");
        Collections.sort(film);
        for(int i=0;i<film.size();i++){
            if(i<film.size()-1){
                sb.append(film.get(i)).append("\n");
            }else{
                sb.append(film.get(i));
            }
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Színész)){
            return false;
        }
        Színész sz=(Színész)obj;
        
        return this.név.equals(sz.getNév());
    }
    
    
    
    
}
