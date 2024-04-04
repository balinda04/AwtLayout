package awtlayout;
import java.awt.*;
import javax.swing.*;
public class AwtLayout {
   JFrame frame;
   JLabel l1,l2,l3;
   JTextField tf1,tf2;
   JButton btn;
   
    AwtLayout(){
    frame=new JFrame();
    l1= new JLabel("Username");
    l2= new JLabel("Password");
    l3=new JLabel("LOGIN PAGE");
    tf1=new JTextField();
    tf2=new JTextField();
    btn=new JButton("LOGIN");
    JButton btn1=new JButton("SIMPLE JAVA AWT LAYOUT");
    JButton btn2=new JButton();
    JButton btn3=new JButton();
    JButton btn4=new JButton();
    JButton btn5=new JButton();
    frame.setLayout(new BorderLayout(20,15));
    frame.add(btn1,BorderLayout.NORTH);
    frame.add(btn4,BorderLayout.SOUTH);
    frame.add(l3,BorderLayout.CENTER);
    frame.add(l1,BorderLayout.CENTER);
    frame.add(l2,BorderLayout.CENTER);
    frame.add(tf1,BorderLayout.CENTER);
    frame.add(tf2,BorderLayout.CENTER);
    frame.add(btn,BorderLayout.CENTER);
    
    frame.add(btn2,BorderLayout.EAST);
    frame.add(btn3,BorderLayout.WEST);
    frame.add(btn5,BorderLayout.CENTER);
    btn.setBounds(160,180,80,40);
    l3.setBounds(130,40,90,50);
    l1.setBounds(70,80,60,50);
    l2.setBounds(70,110,60,80);
    tf1.setBounds(160,90,100,30);
    tf2.setBounds(160,140,100,30);
    frame.setSize(400, 300);
    frame.setVisible(true);
    frame.setTitle("AWT MENU Practice");
    
    }
    private static class i2 {
        public i2() {
        }
    }
    class Menu{
        MenuItem i2;
        MenuItem i1;
        Menu menu;
    Menu menu1;
    Menu menu2;
        Menu(){
    MenuBar mb=new MenuBar();
    menu= new Menu();
    menu1= new Menu();
    menu2= new Menu();
    i1=new MenuItem("login");
    i2=new MenuItem("Student");
    menu.add(i1);
    menu.add(i2);
    jframe.setMenuBar(mb);
    
   
        }

        private void add(MenuItem i2) {
        }
    
    }
   
    public static void main(String[] args) {
         new AwtLayout();
       
        
    }
    
} 
