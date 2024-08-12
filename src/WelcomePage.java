import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame=new JFrame();
    JLabel welcomL=new JLabel("Hello");

    public WelcomePage(String userID) {
        welcomL.setBounds(0,0,200,35);
        welcomL.setFont(new Font(null,Font.ITALIC,25));
        welcomL.setText("hello "+userID);
        frame.add(welcomL);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
