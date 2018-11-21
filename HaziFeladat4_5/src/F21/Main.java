/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Togyi
 */
public class Main {

    public static void main(String[] args) {
        List<Film> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String st[] = sor.split("[();:]");
            for (int i = 3; i < st.length; i++) {
                Film fc = new Film(st[i]);
                if (li.contains(fc)) {
                    li.get(li.indexOf(fc)).getNév().add(new Színész(st[0], Integer.parseInt(st[1])));

                } else {
                    fc.getNév().add(new Színész(st[0], Integer.parseInt(st[1])));
                    li.add(fc);
                }

            }
            sor = sc.nextLine();

        }
        Collections.sort(li);
        for (Film i : li) {
            System.out.println(i);
        }

    }

}
