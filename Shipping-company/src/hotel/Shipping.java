
package hotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// ---------------------- Add, Delete, Trace ------------------

public class Shipping extends JFrame implements ActionListener {
    //  -------- Global Variables --------
    JPanel p1,p2,p3,p4,p5,p6;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JComboBox c1,c2,c3;
    JButton b1,b2,b3;
    
    
    public Shipping(){
        
        //  -------- Main Panel --------
        p1=new JPanel();
        p1.setLayout(new GridLayout());
        this.add(p1);
        b1=new JButton("Add");
        b1.setForeground(Color.black);
        b1.setFont(new Font("Ariel" , Font.BOLD  ,25));
        b1.setBackground(Color.RED);
        b2=new JButton("Delete");
        b2.setForeground(Color.black);
        b2.setBackground(Color.gray);
        b2.setFont(new Font("Ariel" , Font.BOLD  ,20));
        p1.add(b1,BorderLayout.WEST);
        p1.add(b2,BorderLayout.EAST);

        JPanel p3=new JPanel(); 
        p3.setLayout(new GridLayout());
        b3=new JButton("Trace");
        b3.setForeground(Color.black);
        b3.setBackground(Color.gray);
        b3.setFont(new Font("Ariel" , Font.BOLD  ,25));
        p3.add(b3,BorderLayout.CENTER);
        p1.add(p3);
        b1.addActionListener(this);
        b2.addActionListener(
                
        //  -------- Delete Order Frame --------        
        new ActionListener(){
           public void actionPerformed (ActionEvent e){
              deleteorder s=new deleteorder();
        s.setVisible(true);
        
        s.setSize(700,240);
               
           }
       }
       );
            
        //  -------- Trace Order Frame --------
               b3.addActionListener(
       new ActionListener(){
           public void actionPerformed (ActionEvent e){
               trace s=new trace();
            s.setVisible(true);
            s.setSize(700,700);
            
           }
       }
       );
        
        
    }
    
        //  -------- Add Order Frame --------
    @Override
    public void actionPerformed(ActionEvent e) {
        add s=new add();
        s.setVisible(true);
        s.setSize(400,400);
       
    }
    
}
