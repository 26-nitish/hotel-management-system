/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author nitis
 */
public class Admin extends JFrame implements ActionListener {
    
        JLabel l1,l2,l3;
        JTextField t1,t3;
        JPasswordField t2;
        JButton b1,b2; 
   Admin() {    
         l3 = new JLabel("Confirm Your Identity");
         l3.setFont(new java.awt.Font("Segoe UI Black", 1, 18));
         l3.setBounds(150,0,1000,60);
         add(l3);
       
         l1 = new JLabel("Admin Id");
         l1.setBounds(70,70,100,30);
         add(l1);
         
         l2 = new JLabel("password");
         l2.setBounds(70,120,100,30);
         add(l2);
         
         t1 = new JTextField();
         t1.setBounds(150,70,150,30);
         add(t1);
         
         t2 = new JPasswordField();
         t2.setBounds(150,120,150,30);
         add(t2);
         
        
         
         b1 = new JButton("Login");
         b1.setBounds(60,200,120,30);
         b1.addActionListener(this);
         add(b1);
         
        b2 = new JButton("Cancel");
        b2.setBounds(200,200,120,30);
        b2.addActionListener(this);
         add(b2);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/admin2.jpg"));
JLabel l1 = new JLabel(i1);
l1.setBounds(350,25,200,200);
add(l1);

 getContentPane().setBackground(Color.WHITE);
 
   setLayout(null);
         setBounds(470,300,600,300);
         setVisible(true);
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         
   }
  public void actionPerformed(ActionEvent ae){
if(ae.getSource()== b1){
    try{
            Connector c1 = new Connector();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from admin where Admin_Id='"+u+"' and Password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
             new AddEmployee().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
if(ae.getSource()== b2){
    System.exit (0);
}
  }
public static void main(String[] args){
    Admin A = new Admin();
}

}
