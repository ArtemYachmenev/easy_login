import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public static void main(String[] args) {
        IDandPass iDandPass=new IDandPass();
        LoginPage loginPage=new LoginPage(iDandPass.getLoginInfo());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}