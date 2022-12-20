/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

    //  --------------------- Added Frame ------------------------------

public class add extends JFrame implements ActionListener {
    
    //  -------- Global Variables --------
    
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JCheckBox cb1,cb2;
    JComboBox c1,c2;
    JButton b1;
    String checkIn;
    
    //  --------------------- Add Order Constructor ----------------------------
    
    public add(){
        
        //  -------- Inputs --------
        //  -------- First Name --------
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(9,1));
        this.add(p1);
        p2=new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT,35,10));
        p2.setBackground(Color.white);
        p2.setLocation(200,100);
        l1=new JLabel("First Name");
        l1.setForeground(Color.black);
        l1.setFont(new Font("Times new Roman" , Font.BOLD ,15));
        t1=new JTextField(10);
        p2.add(l1);
        p2.add(t1);
        p1.add(p2);
        
        //  -------- Last Name --------
        
        p3=new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT,35,1));
        p2.setLocation(200,200);
        p3.setBackground(Color.white);
        l2=new JLabel("Last Name");
        l2.setForeground(Color.black);
        l2.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        t2=new JTextField(10);
        p3.add(l2);
        p3.add(t2);
        p1.add(p3);
        
        //  -------- Shipping --------
        
        p10=new JPanel();
        p10.setLayout(new FlowLayout(FlowLayout.LEFT,45,1));
        p10.setBackground(Color.white);
        p10.setLocation(200,200);
        l9=new JLabel("Next Day Shipping");
        cb1=new JCheckBox("Yes");
        cb2=new JCheckBox("No");
        l9.setForeground(Color.black);
        l9.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        p10.add(l9);
        p10.add(cb1);
        p10.add(cb2);
        p1.add(p10);
        
        //  -------- Address --------
        
        p6=new JPanel();
        p6.setLayout(new FlowLayout(FlowLayout.LEFT,40,1));
        p6.setBackground(Color.white);
        p6.setLocation(200,200);
        l5=new JLabel("Address");
        l5.setForeground(Color.black);
        l5.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        t3=new JTextField(10);
        p6.add(l5);
        p6.add(t3);
        p1.add(p6);
        
        //  -------- Email --------
        
        p7=new JPanel();
        p7.setLayout(new FlowLayout(FlowLayout.LEFT,45,1));
        p7.setBackground(Color.white);
        p7.setLocation(200,200);
        l6=new JLabel("Email ");
        l6.setForeground(Color.black);
        l6.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        t4=new JTextField(10);
        p7.add(l6);
        p7.add(t4);
        p1.add(p7);
        
        //  -------- Phone --------
        
        p8=new JPanel();
        p8.setLayout(new FlowLayout(FlowLayout.LEFT,45,1));
        p8.setBackground(Color.white);
        p8.setLocation(200,200);
        l7=new JLabel("Phone");
        l7.setForeground(Color.black);
        l7.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        t5=new JTextField(10);
        p8.add(l7);
        p8.add(t5);
        p1.add(p8);
        
        //  -------- Date --------
        
        p9=new JPanel();
        p9.setLayout(new FlowLayout(FlowLayout.LEFT,45,1));
        p9.setBackground(Color.white);
        p9.setLocation(200,200);
        l8=new JLabel("Date  ");
        l8.setForeground(Color.black);
        l8.setFont(new Font("Ariel" , Font.BOLD  ,15));
        t6=new JTextField(10);
        p9.add(l8);
        p9.add(t6);
        p1.add(p9);
       
        //  -------- Place Order Button --------
        
        p5=new JPanel();
        p5.setLayout( new BorderLayout());
        p5.setBackground(Color.pink);
        b1=new JButton("Place Shipment!");
        b1.setFont(new Font("Ariel" , Font.BOLD  ,20));
        b1.setForeground(Color.black);
        b1.setBackground(Color.orange);
        p5.add(b1,BorderLayout.SOUTH);
        p1.add(p5);
        
        //  -------- Placed Order Frame --------
        
        b1.addActionListener(
        new ActionListener(){
           public void actionPerformed (ActionEvent e){
            JLabel ltest;
            JPanel ptest;
            data s=new data();
        s.setVisible(true);
        s.setSize(900,200);
          s.setLocation(650, 150);
        
        
        //  -------- Order Placed --------
        ptest=new JPanel();
        ptest.setBackground(Color.white);
        ptest.setLayout(new BorderLayout());
        String testfield=t6.getText();
        
        //  -------- Added Order Confirmation Message --------
        
        ltest=new JLabel("You have placed an order to address: "+t3.getText()+"\n"+" For Mr/Mrs: "+t1.getText()+" "+t2.getText());
        ltest.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        ltest.setForeground(Color.black);
        ptest.add(ltest,BorderLayout.CENTER);
        s.add(ptest);    
            }
        }
    );
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
int roomprice;
}
