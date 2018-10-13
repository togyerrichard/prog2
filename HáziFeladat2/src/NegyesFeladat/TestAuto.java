/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegyesFeladat;

/**
 *
 * @author Togyi
 */
public class TestAuto {

    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher) {
        for (int i = 0; i < teher.length - 1; i++) {
            for (int j = i + 1; j < teher.length; j++) {
                if (teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                    Teherautó csere = teher[i];
                    teher[i] = teher[j];
                    teher[j] = csere;
                }
            }
        }

    }

    public static Autó keresMaxMotorTeljesítmény(Autó[] auto) {
        int maxx=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<auto.length;i++){
            if(auto[i].getMotorTeljesítmény()>maxx){
                maxx=auto[i].getMotorTeljesítmény();
                index=i;
            }
        }
        return auto[index];
    }

    public static void main(String[] args) {
        Autó[] auto = new Autó[]{
            new Autó("AAA-111", 1800),
            new Autó("BBB-222", 2200),
            new Autó("CCC-333", 1900),
            new Autó("DDD-444", 2200),
            new Autó("EEE-555", 1500),
            new Teherautó("GGG-666", 3000, 5),
            new Teherautó("HHH-777", 3100, 100),
            new Teherautó("III-888", 3200, 20),
            new Teherautó("JJJ-999", 5100, 50),
            new Teherautó("KKK-101", 5000, 10)
        };
        Teherautó[] teher = new Teherautó[]{
            new Teherautó("LLL-111", 3000, 100),
            new Teherautó("MMM-222", 4000, 83),
            new Teherautó("NNN-333", 5000, 42),
            new Teherautó("OOO-444", 5500, 3),
            new Teherautó("PPP-555", 5000, 101),
            new Teherautó("QQQ-666", 3000, 33),
            new Teherautó("RRR-777", 6500, 9),
            new Teherautó("SSS-888", 2800, 200),
            new Teherautó("TTT-999", 4900, 111),
            new Teherautó("UUU-001", 6300, 12)

        };
        rendezMaxSzállíthatóTeherCsökkenőleg(teher);
        for(Teherautó t:teher){
            System.out.println(t);
        }
        System.out.println("A legnagyobb motorteljesítményű: "+keresMaxMotorTeljesítmény(auto));

    }

   
}
