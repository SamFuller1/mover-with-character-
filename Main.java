

import javax.swing.JFrame;

public class Main {

  public static void main(String[] arguments) {
    JFrame frame = new JFrame();
    KeyDemoPanel panel = new KeyDemoPanel();
    panel.setFocusable(true);
    panel.addKeyListener(new KeyDemoKeyListener(panel));
    frame.getContentPane().add(panel);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(500,500);
    frame.setVisible(true);
  }
 }
