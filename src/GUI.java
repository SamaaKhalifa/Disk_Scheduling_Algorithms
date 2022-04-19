import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JFrame f;

    GUI() {
        f = new JFrame("Disk Scheduling");//creating instance of JFrame

        JLabel discklable = new JLabel("Disk Scheduling Algorithms");
        discklable.setBounds(250,50,250,40);
        f.add(discklable);

        JButton b1 = new JButton("FCFS Algorithm");//creating instance of JButton
        b1.setBounds(180, 100, 250, 40);
        String fsfs= b1.getText();

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               //action
            }
        });

        JButton b2 = new JButton("SSTF Algorithm");//creating instance of JButton
        b2.setBounds(180, 150, 250, 40);

        JButton b3 = new JButton("SCAN Algorithm");//creating instance of JButton
        b3.setBounds(180, 200, 250, 40);

        JButton b4 = new JButton("C-SCAN Algorithm");//creating instance of JButton
        b4.setBounds(180, 250, 250, 40);

        JButton b5 = new JButton("LOOK Algorithm");//creating instance of JButton
        b5.setBounds(180, 300, 250, 40);

        JButton b6 = new JButton("C-LOOK Algorithm");//creating instance of JButton
        b6.setBounds(180, 350, 250, 40);

        JButton b7 = new JButton("The newly optimized Algorithm");//creating instance of JButton
        b7.setBounds(180, 400, 250, 40);

        f.add(b1);//adding button in JFrame
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.setSize(600, 600);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
