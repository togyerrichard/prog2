/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Togyi
 */
public class Main {
    
    public static void kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hátizsák> lista){
        for(int i=0;i<lista.size();i++){
            Collections.sort(lista);
            System.out.println(lista.get(i));
        }
    }
    public static void main(String[] args) {
        List<Hátizsák> hátizsákok=new ArrayList<>();
        hátizsákok.add(new Hátizsák("M1", 10.2, 4, false));
        hátizsákok.add(new Hátizsák("M2", 13.1, 7, true));
        hátizsákok.add(new Hátizsák("M3", 6.1, 4, false));
        hátizsákok.add(new Hátizsák("M1", 8.1, 5, false));
        hátizsákok.add(new Hátizsák("M1", 5.5, 6, true));
        hátizsákok.add(new Hátizsák("M3", 5.5, 4, false));
        hátizsákok.add(new Hátizsák("M2", 12.1, 7, false));
        hátizsákok.add(new Hátizsák("M4", 8.3, 2, true));
        hátizsákok.add(new Hátizsák("M1", 6.5, 3, false));
        hátizsákok.add(new Hátizsák("M3", 12.1, 4, true));
        
        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(hátizsákok);
    }
}
