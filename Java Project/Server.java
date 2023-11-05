package chatting.application;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.*;

public class Server extends JFrame{
    Server(){
      setLayout(null);
      

      JPanel p1=new JPanel();
      p1.setBackground(new Color(7,94,84));
      p1.setBounds(0,0,450,70);
      add(p1);


      setSize(450, 700);//sets the size of of Frame
      setLocation(200,50);//by default frame opens on top left corner 
      getContentPane().setBackground(Color.WHITE);



      setVisible(true);// by default it is false, aur ye last line honi chahiya kyoki visible changes hone ke baad hona chahiye.
    }

    public static void main(String[] args) {
        new Server();
    }
}
