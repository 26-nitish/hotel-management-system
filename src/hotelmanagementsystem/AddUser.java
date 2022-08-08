/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author nitis
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public  class AddUser extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2;
    JTextField t1,t4;
    JPasswordField p1,p2;
    JComboBox c2;
        
    
    public static void main (String[] args) {
        AddUser au = new AddUser();
    }
    
   public AddUser() {
         l1 = new JLabel("Name");
         l1.setBounds(50,70,100,100);
         l1.setFont(new java.awt.Font("Tahoma", 1, 18));
         l1.setVisible(true);
             l1.setForeground(Color.red);
         add(l1);
         
         l2 = new JLabel("Job");
         l2.setBounds(590,70,100,100);
         l2.setFont(new java.awt.Font("Tahoma", 1, 18));
         l2.setVisible(true);
             l2.setForeground(Color.red);
         add(l2);
         
      
         
         t1 = new JTextField();// name
         t1.setBounds(130,107,150,25);
         t1.setVisible(true);
         add(t1);
    
       
    
           l4 = new JLabel("SET LOGIN CREDENTIALS");
         l4.setFont(new java.awt.Font("Segoe UI Black", 1, 36));
         l4.setForeground(Color.green);
         l4.setBounds(190,180,1000,60);
         add(l4);
         
          l4 = new JLabel("Sign Up");
         l4.setFont(new java.awt.Font("Segoe UI Black", 1, 36));
         l4.setForeground(Color.green);
         l4.setBounds(350,10,1000,60);
         add(l4);
         
        l5 = new JLabel("Username");
         l5.setBounds(90,250,100,100);
         l5.setFont(new java.awt.Font("Tahoma", 1, 18));
         l5.setVisible(true);
             l5.setForeground(Color.red);
         add(l5);
        
         l6 = new JLabel("Password");
         l6.setBounds(90,300,100,100);
         l6.setFont(new java.awt.Font("Tahoma", 1, 18));
         l6.setVisible(true);
             l6.setForeground(Color.red);
         add(l6);
        
            l7 = new JLabel("Confirm");
         l7.setBounds(90,400,500,100);
         l7.setFont(new java.awt.Font("Tahoma", 1, 18));
         l7.setVisible(true);
            l7.setForeground(Color.red);
         add(l7);
         
         l8 = new JLabel("Password");
         l8.setBounds(90,420,500,100);
         l8.setFont(new java.awt.Font("Tahoma", 1, 18));
         l8.setVisible(true);
            l8.setForeground(Color.red);
         add(l8);
        
         p1 = new JPasswordField();
         p1.setBounds(200,440,150,25);
         add(p1);
        
         p2 = new JPasswordField();
         p2.setBounds(200,340,150,25);
         add(p2);
         
         t4 = new JTextField();
         t4.setBounds(200,290,150,25);
         t4.setVisible(true);
         add(t4);
         
         String course[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c2 = new JComboBox(course);
            c2.setBackground(Color.WHITE);
            c2.setBounds(640,107,150,25);
            add(c2);
      
b1 = new JButton("Sign in");
b1.setFont(new java.awt.Font("Tahoma", 1, 14));
b1.setBounds(500,500,100,40);
b1.setForeground(Color.WHITE);
b1.setBackground(Color.ORANGE);
b1.addActionListener(this);
add(b1);

b2 = new JButton("cancel");
b2.setFont(new java.awt.Font("Tahoma", 1,14));
b2.setBounds(700,500,100,40);
b2.setForeground(Color.WHITE);
b2.setBackground(Color.ORANGE);
 b2.addActionListener(this);
add(b2);
         
         setLayout(null);
         setVisible(true);
            setBounds(320,200,900,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.getContentPane().setBackground(Color.DARK_GRAY);
        
    }
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()== b2){
    System.exit (0);
}
                
                
                if(ae.getSource() == b1);
                try {
                    Connector c1 = new Connector();
                    String a = t1.getText();
                    String c = (String)c2.getSelectedItem();
                    String d = p1.getText();
                    String e = p2.getText();
                    String f = t4.getText();
                    
                    if( d.equals(e)) {
                        String q = "Select * from Staff where name = '"+a+ "' and job = '"+c+"'";
                        
                          ResultSet rs = c1.s.executeQuery(q); 
                          if(rs.next()) {
                              
                              String str = "INSERT INTO login values('"+f+"', '"+d+"', '"+a+"', '"+c+"')";
                        c1.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Staff Added");
                        setVisible(false);
                              new Login().setVisible(true);
                setVisible(false);
                          }
                          
                          else {
                         JOptionPane.showMessageDialog(null,"your staff details are incorrect"); 
                          }
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"above passwords do not match");
                    }
                        
                    }catch(Exception e){
            e.printStackTrace();
                }
                
                
               
                }
        }

  

