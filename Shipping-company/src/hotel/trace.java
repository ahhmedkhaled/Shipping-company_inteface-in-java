
package hotel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

    //  --------------------- Traced Order -------------------------------------

public class trace extends JFrame {
    
    //  --------------------- Global Variables ---------------------------------
    
    ImageIcon image1,image2,image3;
    JLabel l1,l2,l3,l4,l5;
    JPanel p1,p2,p3;
    
    //  --------------------- Trace Order Constructor --------------------------
    
    public trace(){
        
        //  -------- Panel 1 --------
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(2,1));
        this.add(p1);
        
        //  -------- Panel 2 --------
        //--Included label and image--
        
        p2=new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        l2 = new JLabel();
        l2.setIcon(new ImageIcon("E:\\Future\\Advanced\\project\\Proj\\Shipping-company\\Shipping.gif"));
        l4=new JLabel("Preparing your Shipment: ");
        l4.setFont(new Font("Ariel" , Font.BOLD  ,15));
        p2.add(l4);
        p2.add(l2);
        p1.add(p2);
        
        //  -------- Panel 3 --------
        //--Included label and image--
        
        p3=new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        l3 = new JLabel();
        l3.setIcon(new ImageIcon("E:\\Future\\Advanced\\project\\Proj\\Shipping-company\\ETA.gif"));
        l5=new JLabel("Estimated Time Of Arrival:");
        l5.setFont(new Font("Ariel" , Font.BOLD  ,15));
        p3.add(l5);
        p3.add(l3);
        p1.add(p3);
        
    }
}
