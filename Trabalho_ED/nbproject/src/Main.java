/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
import boundary.FormLogin;
import javax.swing.JFrame;
public class Main {
    
    public static void main(String args[]){
        FormLogin formLogin = new FormLogin();
        formLogin.setVisible(true);
        formLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
