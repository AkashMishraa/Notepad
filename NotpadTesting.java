//import notpad.Notpad.java;
import javax.swing.*;

public class NotpadTesting{

  public static void main(String[] args) {
    Notpad np = new Notpad();
    np.setTitle("Notpad");
    np.setVisible(true);
    np.setSize(500,500);
    np.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
}
