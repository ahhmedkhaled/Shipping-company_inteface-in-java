
package hotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

    //  --------------------- Delete Order ---------------------

public class deleteorder extends add implements ActionListener {
    
    //  -------- Global Variables --------
    
JPanel p11,p22,p33,p44,p55,p66,p77,p88,p99,p100;
    JLabel l11,l22,l33,l44,l55,l66,l77,l88,l99,l100;
    JTextField t11,t22,t33,t44,t55,t66,t77,t88,t99,t100;
    JComboBox c11,c22;
     JButton b11;
    
     //  -------- Delete Order Constructor --------
     
    deleteorder(){
        p11=new JPanel();
        p11.setLayout(new GridLayout(4,1));
        this.add(p11);
        
        //  -------- Panel 1 --------
        
        p22=new JPanel();
        p22.setLayout(new FlowLayout(FlowLayout.LEFT,35,20));
        p22.setLocation(200,100);
        p22.setBackground(Color.black);
        l11=new JLabel("Name");
        l11.setForeground(Color.pink);
        l11.setFont(new Font("Times new Roman" , Font.BOLD ,15));
        t11=new JTextField(10);
        p22.add(l11);
        p22.add(t11);
        p11.add(p22);
        
        //  -------- Panel 2 --------
        
        p33=new JPanel();
        p33.setLayout(new FlowLayout(FlowLayout.LEFT,35,1));
        p33.setBackground(Color.black);
        l22=new JLabel("Phone");
        l22.setForeground(Color.pink);
        l22.setFont(new Font("Times new Roman" , Font.BOLD ,15));
        t22=new JTextField(10);
        p33.add(l22);
        p33.add(t22);
        p11.add(p33);
        
        //  -------- Panel 3 --------
        
        p66=new JPanel();
        p66.setLayout(new FlowLayout(FlowLayout.LEFT,35,1));
        p66.setBackground(Color.black);
        l66=new JLabel("ID");
        l66.setForeground(Color.pink);
        l66.setFont(new Font("Times new Roman" , Font.BOLD ,15));
        t66=new JTextField(10);
        p66.add(l66);
        p66.add(t66);
        p11.add(p66);
        
        //  -------- Panel 4 --------
        
        p44=new JPanel();
        p44.setBackground(Color.darkGray);
        p44.setLayout(new FlowLayout(FlowLayout.LEFT,35,1));
        p44.setLocation(200,200);
        l33=new JLabel("Make Sure to write the right Shippment Data");
        l33.setForeground(Color.pink);
        l33.setFont(new Font("Times new Roman" , Font.BOLD + Font.ITALIC ,13));
        p33.add(l33);
        p11.add(p33);
        
        //  -------- Panel 5 --------
        
        p55=new JPanel();
        p55.setLayout( new BorderLayout());
        p55.setBackground(Color.black);
        b11=new JButton("Delete Shipment");
        b11.setFont(new Font("Ariel" , Font.BOLD  ,20));
        b11.setForeground(Color.pink);
        b11.setBackground(Color.black);
        p55.add(b11,BorderLayout.SOUTH);
        p11.add(p55);
        b11.addActionListener(
                
        //  -------- Cancel Order Frame --------
                
        new ActionListener(){
        public void actionPerformed (ActionEvent e){
        ShippmentCanceled s=new ShippmentCanceled();
        s.setVisible(true);
        s.setSize(820,200);
        
        JLabel ltest;
        JPanel ptest;
        ptest=new JPanel();
        ptest.setBackground(Color.black);
        ptest.setLayout(new BorderLayout());
        String testfield=t6.getText();
            
        //  -------- Delete Order Confirmation Message --------
        
        ltest=new JLabel("Shipment by the Name:  "+t11.getText()+"  "+", and ID: "+ t66.getText()+ " and Phone Number: "+t22.getText() + " has been deleted.");
        ltest.setFont(new Font("Times new Roman" , Font.BOLD  ,15));
        ltest.setForeground(Color.pink);
        ptest.add(ltest,BorderLayout.CENTER);
        s.add(ptest);
        
                }
        
       }
        );
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
