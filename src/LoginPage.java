import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton logBut=new JButton("Login");
    JButton resetButton=new JButton("Reset");
    JTextField userIDField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JLabel userIDlabel=new JLabel("userID:");
    JLabel userPasslabel=new JLabel("userPass:");
    JLabel messageLabel=new JLabel();
    HashMap<String ,String> loginInfo=new HashMap<>();
    public LoginPage(HashMap<String, String> loginInfoOrig) {
        loginInfo=loginInfoOrig;

        userIDlabel.setBounds(50,100,75,25);
        userPasslabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));
        userIDField.setBounds(125,100,200,25);
        passwordField.setBounds(125,150,200,25);

        logBut.setBounds(125,200,100,25);
        logBut.setFocusable(false);
        logBut.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDlabel);
        frame.add(userPasslabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(passwordField);
        frame.add(logBut);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==resetButton){
            userIDField.setText("");
            passwordField.setText("");
        }
        if (e.getSource()==logBut){
            String userID=userIDField.getText();
            String passID=String.valueOf(passwordField.getPassword());
            if (loginInfo.containsKey(userID))
                if  (loginInfo.get(userID).equals(passID)){
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("yes");
                    frame.dispose();
                    WelcomePage welcomePage=new WelcomePage(userID);
                }
            else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("no");
                }
        }
        else{
            messageLabel.setForeground(Color.red);
            messageLabel.setText("no usr");
        }
    }
}
