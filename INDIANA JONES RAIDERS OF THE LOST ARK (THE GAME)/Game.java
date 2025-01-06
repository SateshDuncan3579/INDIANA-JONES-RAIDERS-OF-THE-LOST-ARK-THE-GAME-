package game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

@SuppressWarnings("")
public class Game extends JPanel
{

  int x = 10;
  int y = 165;
  int x2 = 1000;
  int y2 = 1000;
  int x3 = 1000;
  int y3 = 1000;
  int x4 = 1000;
  int y4 = 1000;
  int x5 = 1000;
  int y5 = 1000;

  int x2_Movement = -4;
  int x3_Movement = -2;
  int x4_Movement = 4;
  int x5_Movement = -1;
  int x14_Movement = -5;
  int x16_Movement = -1;
  int x17_Movement = -1;
  int x18_Movement = -1;
  int x24_Movement = 5;
  int x26_Movement = -3;
  int x27_Movement = 8;

  int x6 = 263;
  int y6 = 285;
  int x7 = 438;
  int y7 = 187;
  int x8 = 1000;
  int y8 = 1000;
  int x9 = 1000;
  int y9 = 1000;
  int x10 = 1000;
  int y10 = 1000;
  int x11 = 1000;
  int y11 = 1000;
  int x12 = 183;
  int y12 = 390;
  int x13 = 1000;
  int y13 = 1000;
  int x14 = 1000;
  int y14 = 1000;
  int x15 = 1000;
  int y15 = 1000;
  int x16 = 1000;
  int y16 = 1000;
  int x17 = 1000;
  int y17 = 1000;
  int x18 = 1000;
  int y18 = 1000;
  int x19 = 1000;
  int y19 = 1000;
  int x20 = 9999;
  int y20 = -9999;
  int x21 = 1000;
  int y21 = 1000;
  int x22 = 1000;
  int y22 = 1000;
  int x23 = -9999;
  int y23 = -9999;
  int x24 = -9999;
  int y24 = -9999;
  int x25 = 1000;
  int y25 = 1000;
  int x26 = -9999;
  int y26 = -9999;
  int x27 = 9999;
  int y27 = -9999;
  int x28 = 9999;
  int y28 = -9999;
  int x29 = 0;
  int y29 = 0;
  int x30 = 20;
  int y30 = 70;
  int x31 = 1000;
  int y31 = 511;
 
  private BufferedImage image;
  private BufferedImage image2;
  private BufferedImage image3;
  private BufferedImage image4;
  private BufferedImage image5;
  private BufferedImage image6;
  private BufferedImage image7;
  private BufferedImage image8;
  private BufferedImage image9;
  private BufferedImage image10;
  private BufferedImage image11;
  private BufferedImage image12;
  private BufferedImage image13;
  private BufferedImage image14;
  private BufferedImage image15;
  private BufferedImage image16;
  private BufferedImage image17;
  private BufferedImage image18;
  private BufferedImage image19;
  private BufferedImage image20;
  private BufferedImage image21;
  private BufferedImage image22;
  private BufferedImage image23;
  private BufferedImage image24;
  private BufferedImage image25;
  private BufferedImage image26;
  private BufferedImage image27;
  private BufferedImage image28;
  private BufferedImage image29;
  private BufferedImage image30;
  private BufferedImage image31;


  String color = "";

  public Game()
  {
    KeyListener listener = new MyKeyListener();
    addKeyListener(listener);
    setFocusable(true);
    try
    {              
      image = ImageIO.read(new File("res/Indiana Jones.png"));
      image2 = ImageIO.read(new File("res/Mummy.png"));
      image3 = ImageIO.read(new File("res/Arrow.png"));
      image4 = ImageIO.read(new File("res/Mummy right.png"));
      image5 = ImageIO.read(new File("res/Arrow.png"));
      image6 = ImageIO.read(new File("res/Golden Idol.png"));
      image7 = ImageIO.read(new File("res/Mummy Tomb.png"));
      image8 = ImageIO.read(new File("res/Mummy.png"));
      image9 = ImageIO.read(new File("res/Golden Idol.png"));
      image10 = ImageIO.read(new File("res/Golden Idol.png"));
      image11 = ImageIO.read(new File("res/GOLDEN IDOL2.png"));
      image12 = ImageIO.read(new File("res/Inventory.png"));
      image13 = ImageIO.read(new File("res/Revolver.png"));
      image14 = ImageIO.read(new File("res/Bullet.png"));
      image15 = ImageIO.read(new File("res/REVOLVER2.png"));
      image16 = ImageIO.read(new File("res/Arrow.png"));
      image17 = ImageIO.read(new File("res/Arrow.png"));
      image18 = ImageIO.read(new File("res/Arrow.png"));
      image19 = ImageIO.read(new File("res/Mummy right.png"));
      image20 = ImageIO.read(new File("res/Indiana Jones Left.png"));
      image21 = ImageIO.read(new File("res/Revolver.png"));
      image22 = ImageIO.read(new File("res/Mummy Shot.png"));
      image23 = ImageIO.read(new File("res/Golden Idol.png"));
      image24 = ImageIO.read(new File("res/Boulder Right.png"));
      image25 = ImageIO.read(new File("res/NO Cheating.png"));
      image26 = ImageIO.read(new File("res/Boulder.png"));
      image27 = ImageIO.read(new File("res/Mummy right.png"));
      image28 = ImageIO.read(new File("res/Mummy Shot.png"));
      image29 = ImageIO.read(new File("res/Black Screen.png"));
      image30 = ImageIO.read(new File("res/Start Screen.png"));
      image31 = ImageIO.read(new File("res/Win Screen.png"));
    }
    catch (IOException ex)
    {
      System.out.println("");
    }
  }

  public void paint(Graphics g)
  {
    super.paint(g);
       
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, 550, 550);

    g.setColor(Color.ORANGE);
    g.fillRect(50, 10, 455, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(500, 10, 5, 365);
    g.setColor(Color.ORANGE);
    g.fillRect(50, 10, 5, 145);
    g.setColor(Color.ORANGE);
    g.fillRect(130, 115, 5, 40);
    g.setColor(Color.ORANGE);
    g.fillRect(400, 115, 5, 40);
    g.setColor(Color.ORANGE);
    g.fillRect(130, 210, 5, 55);
    g.setColor(Color.ORANGE);
    g.fillRect(400, 210, 5, 55);
    g.setColor(Color.ORANGE);
    g.fillRect(90, 270, 5, 50);
    g.setColor(Color.ORANGE);
    g.fillRect(90, 60, 5, 45);
    g.setColor(Color.ORANGE);
    g.fillRect(450, 60, 5, 45);
    g.setColor(Color.ORANGE);
    g.fillRect(450, 270, 5, 50);
    g.setColor(Color.ORANGE);
    g.fillRect(50, 210, 5, 160);
    g.setColor(Color.ORANGE);
    g.fillRect(305, 270, 5, 50);
    g.setColor(Color.ORANGE);
    g.fillRect(240, 155, 5, 165);
    g.setColor(Color.ORANGE);
    g.fillRect(305, 60, 5, 155);
    g.setColor(Color.ORANGE);
    g.fillRect(240, 60, 5, 50);
    g.setColor(Color.ORANGE);
    g.fillRect(245, 105, 60, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(50, 370, 455, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(90, 60, 155, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(90, 315, 155, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(305, 60, 150, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(305, 315, 150, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(50, 150, 195, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(400, 150, 100, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(310, 210, 190, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(50, 210, 80, 5);
    g.setColor(Color.ORANGE);
    g.fillRect(245, 270, 60, 5);
 
    g.drawImage(image14, x14, y14, this);
    g.drawImage(image3, x3, y3, this);
    g.drawImage(image4, x4, y4, this);
    g.drawImage(image5, x5, y5, this);
    g.drawImage(image6, x6, y6, this);
    g.drawImage(image7, x7, y7, this);
    g.drawImage(image8, x8, y8, this);
    g.drawImage(image9, x9, y9, this);
    g.drawImage(image10, x10, y10, this);
    g.drawImage(image11, x11, y11, this);
    g.drawImage(image12, x12, y12, this);
    g.drawImage(image15, x15, y15, this);
    g.drawImage(image16, x16, y16, this);
    g.drawImage(image17, x17, y17, this);
    g.drawImage(image18, x18, y18, this);
    g.drawImage(image19, x19, y19, this);
    g.drawImage(image22, x22, y22, this);
    g.drawImage(image2, x2, y2, this);
    g.drawImage(image4, x4, y4, this);
    g.drawImage(image13, x13, y13, this);
    g.drawImage(image, x, y, this);
    g.drawImage(image21, x21, y21, this);
    g.drawImage(image23, x23, y23, this);
    g.drawImage(image24, x24, y24, this);
    g.drawImage(image25, x25, y25, this);
    g.drawImage(image27, x27, y27, this);
    g.drawImage(image28, x28, y28, this);
    g.drawImage(image26, x26, y26, this);
    g.drawImage(image20, x20, y20, this);
    g.drawImage(image29, x29, y29, this);
    g.drawImage(image30, x30, y30, this);
    g.drawImage(image31, x31, y31, this);
  }




  public void imagecolor()
  {
    BufferedImage img = new BufferedImage(550, 750,
    BufferedImage.TYPE_INT_RGB);
    Graphics g = img.createGraphics();
 
    super.paint(g);
   
    if (x==0 && y>=0 && y<=600 || y<=15 && x>=0 && x<=600 || y>=330 && x>=0 && x<=600||y==10 && x>=50 && x<=500||x==485 && y>=10 && y<=600||x>=35 && x<=50 && y>=10 && y<=146||x>=115 && x<=130 && y>=75 && y<=145||x>=385 && x<=400 && y>=75 && y<=145||x>=115 && x<=130 && y>=175 && y<=262||x>=385 && x<=400 && y>=175 && y<=262||x>=75 && x<=90 && y>=230 && y<=320||x>=75 && x<=90 && y>=25 && y<=102||x>=432 && x<=450 && y>=25 && y<=102||x>=435 && x<=450 && y>=230 && y<=320||x>=35 && x<=50 && y>=175 && y<=356||x>=225 && x<=240 && y>=110 && y<=320||x>=290 && x<=305 && y>=230 && y<=320||x>=293 && x<=305 && y>=20 && y<=213||x>=225 && x<=240 && y>=20 && y<=105||x>=230 && x<=290 && y>=62 && y<=105||x>=230 && x<=290 && y>=230 && y<=273||x>=75 && x<=240 && y>=20 && y<=62||x>=75 && x<=240 && y>=275 && y<=317||x>=300 && x<=445 && y>=275 && y<=317||x>=300 && x<=445 && y>=20 && y<=62||x>=35 && x<=240 && y>=113 && y<=153||x>=385 && x<=500 && y>=110 && y<=153||x>=290 && x<=500 && y>=170 && y<=213||x>=35 && x<=130 && y>=170 && y<=215)
    {
      x = 10;
      y = 165;
      x2 = 1000;
      y2 = 1000;
      x3 = 1000;
      y3 = 1000;
      x4 = 1000;
      y4 = 1000;
      x5 = 1000;
      y5 = 1000;
      x16 = 1000;
      y16 = 1000;  
      x17 = 1000;
      y17 = 1000;
      x18 = 1000;
      y18 = 1000;
      x6 = 263;
      y6 = 285;
      x8 = 1000;
      y8 = 1000;
      x9 = 1000;
      y9 = 1000;
      x10 = 1000;
      y10 = 1000;
      x11 = 1000;
      y11 = 1000;
      x23 = 1000;
      y23 = 1000;
      x24 = 1000;
      y24 = 1000;
      x25 = 1000;
      y25 = 1000;
    }
    if (y20<=15 && x20>=0 && x20<=600 || y20>=330 && x20>=0 && x20<=600||y20==10 && x20>=50 && x20<=500||x20==485 && y20>=10 && y20<=600||x20>=35 && x20<=50 && y20>=10 && y20<=146||x20>=115 && x20<=130 && y20>=75 && y20<=145||x20>=385 && x20<=400 && y20>=75 && y20<=145||x20>=115 && x20<=130 && y20>=175 && y20<=262||x20>=385 && x20<=400 && y20>=175 && y20<=262||x20>=75 && x20<=90 && y20>=230 && y20<=320||x20>=75 && x20<=90 && y20>=25 && y20<=102||x20>=432 && x20<=450 && y20>=25 && y20<=102||x20>=435 && x20<=450 && y20>=230 && y20<=320||x20>=35 && x20<=50 && y20>=175 && y20<=356||x20>=225 && x20<=240 && y20>=110 && y20<=320||x20>=290 && x20<=305 && y20>=230 && y20<=320||x20>=293 && x20<=305 && y20>=20 && y20<=213||x20>=225 && x20<=240 && y20>=20 && y20<=105||x20>=230 && x20<=290 && y20>=62 && y20<=105||x20>=230 && x20<=290 && y20>=230 && y20<=273||x20>=75 && x20<=240 && y20>=20 && y20<=62||x20>=75 && x20<=240 && y20>=275 && y20<=317||x20>=300 && x20<=445 && y20>=275 && y20<=317||x20>=300 && x20<=445 && y20>=20 && y20<=62||x20>=35 && x20<=240 && y20>=113 && y20<=153||x20>=385 && x20<=500 && y20>=110 && y20<=153||x20>=290 && x20<=500 && y20>=170 && y20<=213||x20>=35 && x20<=130 && y20>=170 && y20<=215)
    {
      x10 = 1000;
      y10 = 1000;
      x11 = 200;
      y11 = 430;
      x13 = 370;
      y13 = 192;
      x19 = 310; 
      y19 = 167;
      x5 = 1000;
      y5 = 1000;
      x16 = 1000;
      y16 = 1000;  
      x17 = 1000;
      y17 = 1000;
      x18 = 1000;
      y18 = 1000;
      x20 = 400;
      y20 = 168;
      x21 = 1000;
      y21 = 1000;
      x4 = 1000;
      y4 = 1000;
      x2 = 1000;
      y2 = 1000;
      x = 9999;
      y = 9999;
      x14 = 9999;
      y14 = 9999;
      x15 = 1000;
      y15 = 1000;
      x22 = 1000;
      y22 = 1000;
      x23 = 1000;
      y23 = 1000;
      x26 = 1000;
      y26 = 1000;
      x27 = 1000;
      y27 = 1000;
      x28 = 1000;
      y28 = 1000;
      x4_Movement = 4;
    }
    if(y>=320 && y<=350 && x>=50 && x<=80)
    {
      x2 = 1000;
      y2 = 1000;
      x8 = 480;
      y8 = 326;
    }
    if(y>=310 && y<=330 && x==95)
    {
      x2 = 480;
      y2 = 326;
      x8 = 1000;
      y8 = 1000;
    }
    if(y>=20 && y<=50 && x>=50 && x<=80)
    {
      x2 = 1000;
      y2 = 1000;
      x8 = 480;
      y8 = 16;
    }
    if(y>=10 && y<=30 && x==95)
    {
      x2 = 480;
      y2 = 16;
      x8 = 1000;
      y8 = 1000;
    }
    if(y>=310 && y<=330 && x==320)
    {
      x4 = 220;
      y4 = 326;
   
    }
    if(y>=10 && y<=30 && x==320)
    {
      x4 = 220;
      y4 = 16;
   
    }
    if(y20>=10 && y20<=30 && x20==410)
    {
      x4 = 120;
      y4 = 17;
      x4_Movement = 14;
      x22 = 1000;
      y22 = 1000;
    }

      if(y20>=310 && y20<=330 && x20==410)
    {
      x4 = 120;
      y4 = 326;
      x4_Movement = 14;
      x22 = 1000;
      y22 = 1000;
   
    }
    if(y>=120 && y<=170 && x==35)
    {
      x8 = 420;
      y8 = 167;
     
    }
    if(y>=120 && y<=170 && x==110)
    {
      x3 = 214;
      y3 = 160;
      x5 = 424;
      y5 = 270;
      x16 = 214;
      y16 = 70;
      x17 = 424;
      y17 = 70;
      x18 = 214;
      y18 = 270;
     
    }
    if(y20>=120 && y20<=170 && x20==130)
    {
      x27 = -26;
      y27 = 166;
      x28 = 1000;
      y28 = 1000;
     
    }
    if(y20>=120 && y20<=170 && x20==100)
    {
      x26 = 180;
      y26 = 160;
      
     
    }
    
  }

  public void frame()
  {
    Game keyboardExample = new Game();
    keyboardExample.imagecolor();
    keyboardExample.repaint();
  }
 
  public static void main(String args[]) throws InterruptedException
  {
    JFrame frame = new JFrame("INDIANA JONES: RAIDERS OF THE LOST ARK (THE GAME)");
    Game keyboardExample = new Game();
    frame.add(keyboardExample);
    frame.setSize(550, 550);
    frame.setVisible(true);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    while (true)
    {
      keyboardExample.coll();
      keyboardExample.repaint();
      Thread.sleep(20);
    }
  }
  public void coll()
  {
   
      x2 = x2 + x2_Movement;
     
      x3 = x3 + x3_Movement;

      x14 = x14 + x14_Movement;

      x24 = x24 + x24_Movement;

      x26 = x26 + x26_Movement;

      x27 = x27 + x27_Movement;

      if(x20<=-25 && y20>=-20 && y20<=600)
    {
      x26 = -1000000000;
      y26 = 1000000000;
      x29 = 0;
      y29 = 0;
      x31 = 15;
      y31 = y31 - 1;

    }
      if(y31 <= -185)
      {
        y31 = -185;
      
      }
      if(x2 <= 310 && y2 >= 147 && y2 <= 187 || x2 <= 50)
      {
        x2 = 1000;
        y2 = 1000;
      }

      if(x4 >= 480)
      {
        x4 = 1000;
        y4 = 1000;
      }
     
      x4 = x4 + x4_Movement;

      if(x5 <= 310)
      {
        x5 = 424;
      }
      x5 = x5 + x5_Movement;

      if(x16 <= 95)
      {
        x16 = 214;
      }
      x16 = x16 + x16_Movement;

      if(x17 <= 310)
      {
        x17 = 424;
      }

      if(x20 == 9999 && y20 == -9999)
      {
        x20 = 9999;
        y20 = -9999;
      }

      x17 = x17 + x17_Movement;

      if(x18 <= 95)
      {
        x18 = 214;
      }
      x18 = x18 + x18_Movement;
      
   
      if(  (x > x2 && x < (x2 + image2.getWidth()) )
       ||  ((x+image.getWidth()) > x2 && (x+image.getWidth()) < (x2 + image2.getWidth())))
      {
        if((  y > y2 && y < (y2 + image2.getHeight()))
              ||  ((y+image.getHeight()) > y2 && (y+image2.getHeight()) < (y2 + image2.getHeight())) )
        {
          x = 10;
          y = 165;
          x2 = 1000;
          y2 = 1000;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x23 = 1000;
          y23 = 1000;
         
        }
      }
     if(  (x > x3 && x < (x3 + image3.getWidth()) )
           ||  ((x+image.getWidth()) > x3 && (x+image.getWidth()) < (x3 + image3.getWidth())))
      {
        if((  y > y3 && y < (y3 + image3.getHeight()))
              ||  ((y+image.getHeight()) > y3 && (y+image3.getHeight()) < (y3 + image3.getHeight())) )
        {
          x = 10;
          y = 165;
          x2 = 1000;
          y2 = 1000;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 1000;
          y10 = 1000;
          x23 = 1000;
          y23 = 1000;
          x24 = 1000;
          y24 = 1000;
          x25 = 1000;
          y25 = 1000;
         
        }
      }
      if(  (x > x4 && x < (x4 + image4.getWidth()) )
           ||  ((x+image.getWidth()) > x4 && (x+image.getWidth()) < (x4 + image4.getWidth())))
      {
        if((  y > y4 && y < (y4 + image4.getHeight()))
              ||  ((y+image.getHeight()) > y4 && (y+image4.getHeight()) < (y4 + image4.getHeight())) )
        {
          x = 10;
          y = 165;
          x4 = 1000;
          y4 = 1000;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 1000;
          y10 = 1000;
          x23 = 1000;
          y23 = 1000;
        }
      }
      if(  (x20 > x27 && x20 < (x27 + image27.getWidth()) )
           ||  ((x20+image20.getWidth()) > x27 && (x20+image20.getWidth()) < (x27 + image27.getWidth())))
      {
        if((  y20 > y27 && y20 < (y27 + image27.getHeight()))
              ||  ((y20+image20.getHeight()) > y27 && (y20+image27.getHeight()) < (y27 + image27.getHeight())) )
        {
          x10 = 1000;
          y10 = 1000;
          x11 = 200;
          y11 = 430;
          x13 = 370;
          y13 = 192;
          x19 = 310; 
          y19 = 167;
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x20 = 400;
          y20 = 168;
          x21 = 1000;
          y21 = 1000;
          x27 = 1000;
          y27 = 1000;
          x = 9999;
          y = 9999;
          x14 = 9999;
          y14 = 9999;
          x15 = 1000;
          y15 = 1000;
          x22 = 1000;
          y22 = 1000;
          x4_Movement = 4;
          x23 = 1000;
          y23 = 1000;
          x26 = 1000;
          y26 = 1000;
          x27 = 1000;
          y27 = 1000;
          x28 = 1000;
          y28 = 1000;
        }
      }
      if(  (x20 > x22 && x20 < (x22 + image22.getWidth()) )
           ||  ((x20+image20.getWidth()) > x22 && (x20+image20.getWidth()) < (x22 + image22.getWidth())))
      {
        if((  y20 > y22 && y20 < (y22 + image22.getHeight()))
              ||  ((y20+image20.getHeight()) > y22 && (y20+image22.getHeight()) < (y22 + image22.getHeight())) )
        {
          x2 = x20 + 100;
          y2 = y20 - 1;
          x22 = 1000;
          y22 = 1000;
        }
      }
      if(  (x20 > x4 && x < (x4 + image4.getWidth()) )
           ||  ((x20+image20.getWidth()) > x4 && (x20+image20.getWidth()) < (x4 + image4.getWidth())))
      {
        if((  y20 > y4 && y20 < (y4 + image4.getHeight()))
              ||  ((y20+image20.getHeight()) > y4 && (y20+image4.getHeight()) < (y4 + image4.getHeight())) )
        {
          x10 = 1000;
          y10 = 1000;
          x11 = 200;
          y11 = 430;
          x13 = 370;
          y13 = 192;
          x19 = 310; 
          y19 = 167;
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x20 = 400;
          y20 = 168;
          x21 = 1000;
          y21 = 1000;
          x4 = 1000;
          y4 = 1000;
          x = 9999;
          y = 9999;
          x14 = 9999;
          y14 = 9999;
          x15 = 1000;
          y15 = 1000;
          x22 = 1000;
          y22 = 1000;
          x4_Movement = 4;
          x23 = 1000;
          y23 = 1000;
        }
      }
      if(  (x20 > x26 && x < (x26 + image26.getWidth()) )
           ||  ((x20+image20.getWidth()) > x26 && (x20+image20.getWidth()) < (x26 + image26.getWidth())))
      {
        if((  y20 > y26 && y20 < (y26 + image26.getHeight()))
              ||  ((y20+image20.getHeight()) > y26 && (y20+image26.getHeight()) < (y26 + image26.getHeight())) )
        {
          x10 = 1000;
          y10 = 1000;
          x11 = 200;
          y11 = 430;
          x13 = 370;
          y13 = 192;
          x19 = 310; 
          y19 = 167;
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x20 = 400;
          y20 = 168;
          x21 = 1000;
          y21 = 1000;
          x26 = 1000;
          y26 = 1000;
          x = 9999;
          y = 9999;
          x14 = 9999;
          y14 = 9999;
          x15 = 1000;
          y15 = 1000;
          x22 = 1000;
          y22 = 1000;
          x26 = 1000;
          y26 = 1000;
          x27 = 1000;
          y27 = 1000;
          x28 = 1000;
          y28 = 1000;
          x4_Movement = 4;
        }
      }

      if(  (x20 > x2 && x < (x2 + image2.getWidth()) )
           ||  ((x20+image20.getWidth()) > x2 && (x20+image20.getWidth()) < (x2 + image2.getWidth())))
      {
        if((  y20 > y2 && y20 < (y2 + image2.getHeight()))
              ||  ((y20+image20.getHeight()) > y2 && (y20+image2.getHeight()) < (y2 + image2.getHeight())) )
        {
          x10 = 1000;
          y10 = 1000;
          x11 = 200;
          y11 = 430;
          x13 = 370;
          y13 = 192;
          x19 = 310; 
          y19 = 167;
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x20 = 400;
          y20 = 168;
          x21 = 1000;
          y21 = 1000;
          x2 = 1000;
          y2 = 1000;
          x = 9999;
          y = 9999;
          x14 = 9999;
          y14 = 9999;
          x15 = 1000;
          y15 = 1000;
          x22 = 1000;
          y22 = 1000;
          x4_Movement = 4;
          x23 = 1000;
          y23 = 1000;
        }
      }
      
      if(  (x4 > x14 && x < (x14 + image14.getWidth()) )
           ||  ((x4+image4.getWidth()) > x14 && (x4+image4.getWidth()) < (x14 + image14.getWidth())))
      {
        if((  y4 > y14 && y4 < (y14 + image14.getHeight()))
              ||  ((y4+image4.getHeight()) > y14 && (y4+image14.getHeight()) < (y14 + image14.getHeight())) )
        {
          x22 = x4;
          y22 = y4 + 24;
          x4 = 1000;
          y4 = 1000;
          x14 = 9999;
          y14 = 9999;
        }
      }
      if(  (x27 > x14 && x < (x14 + image14.getWidth()) )
           ||  ((x27+image27.getWidth()) > x14 && (x27+image27.getWidth()) < (x14 + image14.getWidth())))
      {
        if((  y27 > y14 && y27 < (y14 + image14.getHeight()))
              ||  ((y27+image27.getHeight()) > y14 && (y27+image14.getHeight()) < (y14 + image14.getHeight())) )
        {
          x28 = x27;
          y28 = y27 + 24;
          x27 = 1000;
          y27 = 1000;
          x14 = 9999;
          y14 = 9999;
        }
      }
      if((x > x5 && x < (x5 + image5.getWidth()) )
           ||  ((x+image.getWidth()) > x5 && (x+image.getWidth()) < (x5 + image5.getWidth())))
      {
        if((  y > y5 && y < (y5 + image5.getHeight()))
              ||  ((y+image.getHeight()) > y5 && (y+image5.getHeight()) < (y5 + image5.getHeight())) )
        {
          x = 10;
          y = 165;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 1000;
          y10 = 1000;
          x23 = 1000;
          y23 = 1000;
         
        }
     
    }
    if((x > x6 && x < (x6 + image6.getWidth()) )
           ||  ((x+image.getWidth()) > x6 && (x+image.getWidth()) < (x6 + image6.getWidth())))
      {
        if((  y > y6 && y < (y6 + image6.getHeight()))
              ||  ((y+image.getHeight()) > y6 && (y+image6.getHeight()) < (y6 + image6.getHeight())) )
        {
          x2 = 1000;
          y2 = 1000;
          x6 = 1000;
          y6 = 1000;
          x9 = 263;
          y9 = 70;
         
        }
     
    }
    if((x > x9 && x < (x9 + image9.getWidth()) )
           ||  ((x+image.getWidth()) > x9 && (x+image.getWidth()) < (x9 + image9.getWidth())))
      {
        if((  y > y9 && y < (y9 + image9.getHeight()))
              ||  ((y+image.getHeight()) > y9 && (y+image9.getHeight()) < (y9 + image9.getHeight())) )
        {
          x2 = 1000;
          y2 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 415;
          y10 = 181;
         
        }
     
    }
    if((x > x10 && x < (x10 + image10.getWidth()) )
           ||  ((x+image.getWidth()) > x10 && (x+image.getWidth()) < (x10 + image10.getWidth())))
      {
        if((  y > y10 && y < (y10 + image10.getHeight()))
              ||  ((y+image.getHeight()) > y10 && (y+image10.getHeight()) < (y10 + image10.getHeight())) )
        {
          x10 = 1000;
          y10 = 1000;
          x11 = 200;
          y11 = 430;
          x13 = 370;
          y13 = 192;
          x19 = 310; 
          y19 = 167;
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x20 = x;
          y20 = y;
          x = 9999;
          y = 9999;
                   
        }
     
    }
    if((x20 > x13 && x20 < (x13 + image13.getWidth()) )
           ||  ((x20+image20.getWidth()) > x13 && (x20+image20.getWidth()) < (x13 + image13.getWidth())))
      {
        if((  y20 > y13 && y20 < (y13 + image13.getHeight()))
              ||  ((y20+image20.getHeight()) > y13 && (y20+image13.getHeight()) < (y13 + image13.getHeight())) )
        {
          x4 = 310;
          y4 = 167;
          x10 = 1000;
          y10 = 1000;
          x21 = x20 - 12;
          y21 = y20 + 13;
          x15 = 260;
          y15 = 400;
          x19 = 1000; 
          y19 = 1000;
          x13 = 1000; 
          y13 = 1000;
          x2_Movement = -3;
         
        }
     
    }
    if((x > x16 && x < (x16 + image16.getWidth()) )
           ||  ((x+image.getWidth()) > x16 && (x+image.getWidth()) < (x16 + image16.getWidth())))
      {
        if((  y > y16 && y < (y16 + image16.getHeight()))
              ||  ((y+image.getHeight()) > y16 && (y+image16.getHeight()) < (y16 + image16.getHeight())) )
        {
          x = 10;
          y = 165;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 1000;
          y10 = 1000;
          x23 = 1000;
          y23 = 1000;
         
        }
     
    }
    if((x > x17 && x < (x17 + image17.getWidth()) )
           ||  ((x+image.getWidth()) > x17 && (x+image.getWidth()) < (x17 + image17.getWidth())))
      {
        if((  y > y17 && y < (y17 + image17.getHeight()))
              ||  ((y+image.getHeight()) > y17 && (y+image17.getHeight()) < (y17 + image17.getHeight())) )
        {
          x = 10;
          y = 165;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 1000;
          y10 = 1000;
          x23 = 1000;
          y23 = 1000;
        }
     
    }
    if((x > x18 && x < (x18 + image18.getWidth()) )
           ||  ((x+image.getWidth()) > x18 && (x+image.getWidth()) < (x18 + image18.getWidth())))
      {
        if((  y > y18 && y < (y18 + image18.getHeight()))
              ||  ((y+image.getHeight()) > y18 && (y+image18.getHeight()) < (y18 + image18.getHeight())) )
        {
          x = 10;
          y = 165;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x10 = 1000;
          y10 = 1000;
          x23 = 1000;
          y23 = 1000;
         
        }
     
    }
    if(  (x > x24 && x < (x24 + image24.getWidth()) )
       ||  ((x+image.getWidth()) > x24 && (x+image.getWidth()) < (x24 + image24.getWidth())))
      {
        if((  y > y24 && y < (y24 + image24.getHeight()))
              ||  ((y+image.getHeight()) > y24 && (y+image24.getHeight()) < (y24 + image24.getHeight())) )
        {
          x = 10;
          y = 165;
          x24 = 1000;
          y24 = 1000;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x23 = 1000;
          y23 = 1000;
          x25 = 1000;
          y25 = 1000;
         
        }
      }
      if(  (x20 > x24 && x < (x24 + image24.getWidth()) )
       ||  ((x20+image20.getWidth()) > x24 && (x20+image20.getWidth()) < (x24 + image24.getWidth())))
      {
        if((  y20 > y24 && y20 < (y24 + image24.getHeight()))
              ||  ((y20+image20.getHeight()) > y24 && (y+image24.getHeight()) < (y24 + image24.getHeight())) )
        {
          x = 10;
          y = 165;
          x20 = 5000000;
          y20 = 1650000;
          x24 = 1000;
          y24 = 1000;
          x3 = 1000;
          y3 = 1000;  
          x5 = 1000;
          y5 = 1000;
          x16 = 1000;
          y16 = 1000;  
          x17 = 1000;
          y17 = 1000;
          x18 = 1000;
          y18 = 1000;
          x6 = 263;
          y6 = 285;
          x8 = 1000;
          y8 = 1000;
          x9 = 1000;
          y9 = 1000;
          x23 = 1000;
          y23 = 1000;
          x25 = 1000;
          y25 = 1000;
         
        }
      }
    if((x > x23 && x < (x23 + image23.getWidth()) )
           ||  ((x+image.getWidth()) > x23 && (x+image.getWidth()) < (x23 + image23.getWidth())))
      {
        if((  y > y23 && y < (y23 + image23.getHeight()))
              ||  ((y+image.getHeight()) > y23 && (y+image23.getHeight()) < (y23 + image23.getHeight())) )
        {
          x23 = -9999;
          y23 = -9999;
          x24 = -20;
          y24 = 158;
          x25 = -20;
          y25 = 10;
        }
     
    }
    if((x20 > x23 && x20 < (x23 + image23.getWidth()) )
           ||  ((x20+image20.getWidth()) > x23 && (x20+image20.getWidth()) < (x23 + image23.getWidth())))
      {
        if((  y20 > y23 && y20 < (y23 + image23.getHeight()))
              ||  ((y20+image20.getHeight()) > y23 && (y20+image23.getHeight()) < (y23 + image23.getHeight())) )
        {
          x23 = -9999;
          y23 = -9999;
          x24 = -20;
          y24 = 158;
          x25 = -20;
          y25 = 10;
        }
     
    }
  }  




  public class MyKeyListener implements KeyListener
  {
    @Override
    public void keyTyped(KeyEvent e)
    {
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
      if (e.getKeyCode() == KeyEvent.VK_DOWN)
      {
        y = y + 4;
        y20 = y20 + 4;
        y21 = y21 + 4;
        repaint();




      }
      else if (e.getKeyCode() == KeyEvent.VK_UP)
      {
        y = y - 4;
        y20 = y20 - 4;
        y21 = y21 - 4;
        repaint();




      }
      else if (e.getKeyCode() == KeyEvent.VK_LEFT)
      {
        x = x - 5;
        x20 = x20 - 5;
        x21 = x21 - 5;
        repaint();
       
      }
      else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
      {
        x = x + 5;
        x20 = x20 + 5;
        x21 = x21 + 5;
        repaint();
      }
      else if (e.getKeyCode() == KeyEvent.VK_W)
      {
        y = y - 4;
        y20 = y20 - 4;
        y21 = y21 - 4;
       repaint();

      }
      else if (e.getKeyCode() == KeyEvent.VK_S)
      {
        y = y + 4;
        y20 = y20 + 4;
        y21 = y21 + 4;
        repaint();




      }
      else if (e.getKeyCode() == KeyEvent.VK_A)
      {
        x = x - 5;
        x20 = x20 - 5;
        x21 = x21 - 5;
        repaint();




      }
      else if (e.getKeyCode() == KeyEvent.VK_D)
      {
        x = x + 5;
        x20 = x20 + 5;
        x21 = x21 + 5;
        repaint();
      }
      else if (e.getKeyCode() == KeyEvent.VK_SPACE)
      {
        x14 = x21;
        y14 = y21;
        x29 = 999999999;
        y29 = 999999999;
        x30 = 999999999;
        y30 = 999999999;
        repaint();




      }
      else if (e.getKeyCode() == KeyEvent.VK_B)
      {
        x23 = 100;
        y23 = 180;
        x6 = 1000;
        y6 = 1000;
        x9 = 1000;
        y9 = 1000;
        x10 = 1000;
        y10 = 1000;
        x11 = 1000;
        y11 = 1000;
        repaint();




      }
 
      repaint();
      imagecolor();
 
    }
 
    @Override
    public void keyReleased(KeyEvent e)
    {
    }
  }
}