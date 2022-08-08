
package hotelmanagementsystem;


import java.awt.*;
import static java.awt.Color.BLACK;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class dashboard extends JFrame implements ActionListener{
    
  
       
          dashboard(){
               JMenuBar mb;
        JMenu m1,m2;
        JMenuItem i1,i2,i3;
        
              mb = new JMenuBar();
              add(mb);
              
              m1 = new JMenu("Hotel management");
              mb.add(m1);
              
              m2 = new JMenu("Admin");
              m2.setForeground(Color.BLUE);
              mb.add(m2);
              
              
              i1 = new JMenuItem("Reception");
              i1.addActionListener(this);
              m1.add(i1);
              
               i2 = new JMenuItem("Add Staff");
               i2.addActionListener(this);
              m2.add(i2);
              
               i3 = new JMenuItem("Add Rooms");
               i3.addActionListener(this);             
               m2.add(i3);
              
              
              
              
              mb.setBounds(0,0,1920,30);
              
              ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/third.jpg"));
              JLabel l1 = new JLabel(p1);
              l1.setBounds(160,0,1250,790);
              add(l1);
                      
              JLabel l2 = new JLabel("Welcome To Our Hotel");
                      l2.setBounds(370,80,600,50);
                      l2.setForeground(Color.WHITE);
                      l2.setFont(new Font("Tahoma", Font.PLAIN, 46));
                      l1.add(l2);
                      
              setLayout(null);
            getContentPane().setBackground(BLACK);
              setBounds(-10,0,1920,824);
              setVisible(true);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          
    }

          public void actionPerformed(ActionEvent ae)  {    
              if(ae.getActionCommand().equals("Reception")){
                  new Reception().setVisible(true);
              }else if(ae.getActionCommand().equals("Add Staff")){
                  new Admin().setVisible(true);
              }else if(ae.getActionCommand().equals("Add Rooms")){
                  new Admin2().setVisible(true);
              }





}
          
          
          
          
          
       
public static void main(String[] args){

new dashboard().setVisible(true);
}
}
