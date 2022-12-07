

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDemoKeyListener implements KeyListener {

  private KeyDemoPanel panel;

  public KeyDemoKeyListener(KeyDemoPanel panel) {
      this.panel = panel;
  }

  @Override
    public void keyTyped(KeyEvent e) {
      
    }
  
  @Override
    public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)  {
        panel.moveLeft();
      } 
      if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
        panel.moveRight();
      }
      if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
        panel.moveDown();
      }
      if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
        panel.moveUp();
      }
      /*if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        panel.jump();
      }
      */
    }
  
  @Override
    public void keyReleased(KeyEvent e) {
    }
}