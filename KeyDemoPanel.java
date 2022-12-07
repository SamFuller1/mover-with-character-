import java.awt.*;//

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class KeyDemoPanel extends JPanel {
  //
  Toolkit t = Toolkit.getDefaultToolkit();
  Image player = t.getImage("images/spr_mct_right_idle.png");
  //
  private Rectangle target = new Rectangle(420,420,60,30);
  private Rectangle mover = new Rectangle(10, 386, 32, 64);
  private Rectangle obstacle = new Rectangle(0, 450, 500, 51);

    private Color targetColor = Color.BLUE;

    @Override
    public void paint(Graphics g) {
      
      super.paintComponent(g);
      g.setColor(targetColor);
      g.fillRect(target.x, target.y, target.width, target.height);
      g.setColor(Color.ORANGE);
      g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
      //g.setColor(Color.RED);
      //g.fillRect(mover.x, mover.y, mover.width, mover.height);
      //
      g.drawImage(player, mover.x, mover.y, mover.width, mover.height, this);
      //

    }

   public void moveLeft() {
     mover.x -= 5;
     if (obstacle.intersects(mover)) {mover.x +=5;}
     this.repaint();
     checkIntersection();
   }

   public void moveRight() {
     mover.x += 5;
     if (obstacle.intersects(mover)) {mover.x -=5;}
     this.repaint();
     checkIntersection();
   }

  public void moveUp() {
     mover.y -= 5;
    if (obstacle.intersects(mover)) {mover.y +=5;}
     this.repaint();
     checkIntersection();
  }

  public void moveDown(){
     mover.y += 5;
    if (obstacle.intersects(mover)) {mover.y -=5;}
     this.repaint();
     checkIntersection();
  }
 /*)
  public void jump(){
    for (int i = 0; i < 2; i++) {
    mover.y -=5;
    if (obstacle.intersects(mover)) {mover.y +=5;}
    this.repaint();
      System.out.println("works");
    }
    for (int i = 0; i < 2; i++) {
    mover.y +=5;
    if (obstacle.intersects(mover)) {mover.y -=5;}
    this.repaint();
    }
  }
*/
  private void checkIntersection() {
    if (target.intersects(mover)) {
      targetColor = Color.BLACK;
    } else {
      targetColor = Color.BLUE;
    }
  }
}
