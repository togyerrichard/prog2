/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Togyi
 */
public class Film implements Comparable<Film> {

    private String cím;
    private List<Színész> név;

    public Film(String cím) {
        this.cím = cím;
        this.név = new ArrayList();
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public List<Színész> getNév() {
        return név;
    }

    public void setNév(List<Színész> név) {
        this.név = név;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Film)) {
            return false;
        }
        Film f = (Film) obj;

        return this.cím.equals(f.getCím());
    }

    @Override
    public int compareTo(Film t) {
        if (this.név.size() == t.getNév().size()) {
            return this.cím.compareTo(t.getCím());
        } else {
            return (-1)*Integer.compare(this.név.size(), t.getNév().size());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cím).append("\n");
        Collections.sort(név);
        for (int i = 0; i < név.size(); i++) {
            if (i < név.size() - 1) {
                sb.append(név.get(i)).append("\n");
            } else {
                sb.append(név.get(i));
            }
        }
        return sb.toString();
    }

}
