/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Áru extends JFrame{

    private JButton bt1;  
    private JButton bt2;
    
    private JLabel rövidités;
    private JLabel név;
    private JLabel ár;
    private JLabel egység;
    private JLabel szavatosság;
    private JLabel db;
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;

   
    public Áru() throws HeadlessException{
         super("Árukészlet");
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
         
         bt1=new JButton("Új áru hozzáadása");
         bt2=new JButton("Áru törlése");
         
         tf1=new JTextField(15);
         tf2=new JTextField(15);
         tf3=new JTextField(15);
         tf4=new JTextField(15);
         tf5=new JTextField(15);
         tf6=new JTextField(15);

         
         rövidités=new JLabel("Rövidítés: ");
         név=new JLabel("Név: ");
         ár=new JLabel("Ár: ");  
         egység=new JLabel("Egység: ");
         db=new JLabel("Mennyiség: ");
         szavatosság=new JLabel("Szavatosság: ");

         
         p1=new JPanel();
         p2=new JPanel();
         p3=new JPanel();
         p4=new JPanel();
         p5=new JPanel();
         p6=new JPanel();
         p7=new JPanel();

         
         GridLayout gr=new GridLayout(7, 1);
         setLayout(gr);
         
         GridLayout gr1=new GridLayout(1,2);
         p1.setLayout(gr1);
         GridLayout gr2=new GridLayout(1,2);
         p2.setLayout(gr2);
         GridLayout gr3=new GridLayout(1,2);
         p3.setLayout(gr3);
         GridLayout gr4=new GridLayout(1,2);
         p4.setLayout(gr4);
         GridLayout gr5=new GridLayout(1,2);
         p5.setLayout(gr5);
         GridLayout gr6=new GridLayout(1,2);
         p6.setLayout(gr6);
         GridLayout gr7=new GridLayout(1,2);
         p7.setLayout(gr7);
         
         

         p1.add(rövidités);
         p1.add(tf1);
         p2.add(név);
         p2.add(tf2);
         p3.add(egység);
         p3.add(tf3);
         p4.add(ár);
         p4.add(tf4);
         p5.add(db);
         p5.add(tf5);
         p6.add(szavatosság);
         p6.add(tf6);
         p7.add(bt1);
         p7.add(bt2);
         
         this.add(p1);
         this.add(p2);
         this.add(p3);
         this.add(p4);
         this.add(p5);
         this.add(p6);
         this.add(p7);

         pack();
         
    }
    
    public static void main(String[] args) {
        Áru l=new Áru();
        
    }

    }

  