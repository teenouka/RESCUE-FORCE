package javaapplication7;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playstate1 extends JPanel implements ActionListener {

    private final ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("JBD-73-02-1199x599.jpg"));
    private final ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("background_for_flash_game_by_pykodelbi-d4ly9hx.jpg"));
    private final ImageIcon win = new ImageIcon(this.getClass().getResource("—Pngtree—blue purple gradient astronaut joy_1178483.jpg"));
    private final ImageIcon pause = new ImageIcon(this.getClass().getResource("puse.png"));
    private final ImageIcon back = new ImageIcon(this.getClass().getResource("back.png"));
    rocket m = new rocket();

    homegames hg = new homegames();
    ImageIcon feildover = new ImageIcon(this.getClass().getResource("a_cartoon_forest_election_by_88srenaissance88-d4zim5f.jpg"));
    ImageIcon exitover = new ImageIcon(this.getClass().getResource("exit.jpg"));
    ImageIcon restart = new ImageIcon(this.getClass().getResource("Start.jpg"));
    JButton BStartover = new JButton(restart);
    JButton BExitover = new JButton(exitover);

    private JLabel score = new JLabel();
    public JButton BPause = new JButton(pause);
    public JButton BExithome = new JButton(back);
    public ArrayList<Fireball> fireball = new ArrayList<Fireball>();
    public ArrayList<ball1> ba1 = new ArrayList<ball1>();
    public ArrayList<ball2> ba2 = new ArrayList<ball2>();
    public ArrayList<ball5> ba5 = new ArrayList<ball5>();

    public int times;
    public int HP = 3;
    public int s1 = 1;
    public int s2 = 2;
    boolean timestart = true;
    boolean startball = false;

    public int scor = 0;

    Thread time = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }

                if (timestart == false) {
                    repaint();
                }
            }
        }
    });

    Thread actor = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                repaint();
            }
        }
    });
    Thread tballs1 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startball == false) {
                    int ran = (int) (Math.random() * 4);
                    if (ran == 1) {
                        ba1.add(new ball1(0, 350, 1));
                    } else if (ran == 2) {
                        ba2.add(new ball2(0, 350, 1));
                    } else if (ran == 3) {
                        ba5.add(new ball5(0, 350, 1));
                    }
                }
            }
        }
    });
    Thread tballs2 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startball == false) {
                    int ran = (int) (Math.random() * 4);
                    if (ran == 1) {
                        ba1.add(new ball1(0, 150, 2));
                    } else if (ran == 2) {
                        ba2.add(new ball2(0, 150, 2));
                    } else if (ran == 3) {
                        ba5.add(new ball5(0, 150, 2));
                    }
                }
            }
        }
    });

    Thread tballs3 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startball == false) {
                    int ran = (int) (Math.random() * 4);
                    if (ran == 1) {
                        ba1.add(new ball1(250, 0, 3));
                    } else if (ran == 2) {
                        ba2.add(new ball2(250, 0, 3));
                    } else if (ran == 3) {
                        ba5.add(new ball5(250, 0, 3));
                    }
                }
            }
        }
    });

    Thread tballs4 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startball == false) {
                    int ran = (int) (Math.random() * 4);
                    if (ran == 1) {
                        ba1.add(new ball1(700, 0, 4));
                    } else if (ran == 2) {
                        ba2.add(new ball2(700, 0, 4));
                    } else if (ran == 3) {
                        ba5.add(new ball5(700, 0, 4));
                    }
                }
            }
        }
    });

    Thread tballs5 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startball == false) {
                    int ran = (int) (Math.random() * 4);
                    if (ran == 1) {
                        ba1.add(new ball1(1000, 150, 5));
                    } else if (ran == 2) {
                        ba2.add(new ball2(1000, 150, 5));
                    } else if (ran == 3) {
                        ba5.add(new ball5(1000, 150, 5));
                    }
                }
            }
        }
    });

    Thread tballs6 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startball == false) {
                    int ran = (int) (Math.random() * 4);
                    if (ran == 1) {
                        ba1.add(new ball1(1100, 350, 6));
                    } else if (ran == 2) {
                        ba2.add(new ball2(1000, 350, 6));
                    } else if (ran == 3) {
                        ba5.add(new ball5(1000, 350, 6));
                    }
                }
            }
        }
    });

    Thread t = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestart == false) {
                    times = (times - 1);

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    });

    playstate1() {
        this.setFocusable(true);
        this.setLayout(null);
        BPause.setBounds(850, 100, 40, 40);
        BExithome.setBounds(850, 30, 40, 40);
        BPause.addActionListener(this);
        BExithome.addActionListener(this);
        BExithome.addActionListener(this);
        this.add(BPause);
        this.add(BExithome);
        this.add(score);

        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int a = e.getKeyCode();

                if (a == KeyEvent.VK_A && m.count > 1) {
                    m.count--;
                } else if (a == KeyEvent.VK_D && m.count < 7) {
                    m.count++;
                }
                if (a == KeyEvent.VK_SPACE ) {
                    fireball.add(new Fireball(m.x, 550, m.count));
                }

            }

        });

        m.x = 450;
        time.start();
        actor.start();
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (times <= 0 || HP <= 0) {
            if (HP == 0) {
                BPause.setBounds(850, 650, 50, 50);
                BExithome.setBounds(750, 650, 50, 50);
                this.setLayout(null);
                g.drawImage(feildover.getImage(), 0, 0, 1000, 800, this);
                g.setColor(Color.RED);
                g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 40));
                g.drawString("SCORE   " + scor, 380, 450);
                g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 70));
                g.drawString("FAIL!", 400, 400);
            } else if (times <= 0) {
                BPause.setBounds(850, 650, 50, 50);
                BExithome.setBounds(750, 650, 50, 50);
                this.setLayout(null);
                g.drawImage(win.getImage(), 0, 0, 1000, 800, this);
                g.setColor(Color.ORANGE);
                g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 40));
                g.drawString("SCORE   " + scor, 380, 450);
                g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 70));
                g.drawString("SUCCESS", 350, 400);

            }

        } else if (times <= 60) {                                                 //state 2
            g.drawImage(imgstate2.getImage(), 0, 0, 1000, 800, this);

            g.drawImage(m.im[m.count - 1].getImage(), m.x, 550, 110, 160, this);

            for (int i = 0; i < fireball.size(); i++) {
                Fireball ba = fireball.get(i);
                g.drawImage(ba.imfire[ba.count % 2].getImage(), ba.x, ba.y, 50, 50, null);
                ba.move();
                ba.count++;
                if (ba.y < 0) {
                    fireball.remove(i);
                }
            }
            //===========ball1================
            for (int i = 0; i < ba1.size(); i++) {
                g.drawImage(ba1.get(i).getImage(), ba1.get(i).getX(), ba1.get(i).getY(), 100, 100, this);
                ba1.get(i).yy = 1;
                if (ba1.get(i).y >= 550 && ba1.get(i).x < 600) {
                    HP--;
                    ba1.remove(i);
                }
            }
            for (int i = 0; i < fireball.size(); i++) {
                for (int j = 0; j < ba1.size(); j++) {
                    if (Intersect(fireball.get(i).getbound(), ba1.get(j).getbound()) && j - 1 < ba1.size() && i - 1 < fireball.size()) {

                        ba1.remove(j);
                        fireball.remove(i);
                        scor += 100;

                    }
                }
            }
            //===========ball2================
            for (int i = 0; i < ba2.size(); i++) {
                g.drawImage(ba2.get(i).getImage(), ba2.get(i).x, ba2.get(i).y, 100, 100, this);
                if (ba2.get(i).y >= 550 && ba2.get(i).x < 600) {
                    HP--;
                    ba2.remove(i);
                }
            }
            for (int i = 0; i < fireball.size(); i++) {
                for (int j = 0; j < ba2.size(); j++) {
                    if (Intersect(fireball.get(i).getbound(), ba2.get(j).getbound()) && j < ba2.size() && i < fireball.size()) {

                        fireball.remove(i);
                        ba2.get(j).hp--;
                        if (ba2.get(j).hp <= 0) {
                            ba2.remove(j);
                            scor += 200;

                        }


                    }
                }
            }
            //===========ball5================
            for (int i = 0; i < ba5.size(); i++) {
                g.drawImage(ba5.get(i).getImage(), ba5.get(i).x, ba5.get(i).y, 100, 100, this);
                if (ba5.get(i).y >= 700) {
                    ba5.remove(i);
                }
            }
            for (int i = 0; i < fireball.size(); i++) {
                for (int j = 0; j < ba5.size(); j++) {
                    if (Intersect(fireball.get(i).getbound(), ba5.get(j).getbound()) && j < ba5.size() && i < fireball.size()) {
                        ba5.remove(j);
                        fireball.remove(i);
                        scor -= 150;
                        g.drawString("-150", m.x + 100, 650);
                    }
                }
            }

            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.setColor(Color.WHITE);
            g.drawString("SCORE =  " + scor, 150, 750);
            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.drawString("STATE " + s2, 400, 80);
            g.drawString("Time " + times, 800, 750);
            g.setColor(Color.RED);
            g.drawString("HP  " + HP, 50, 750);

        } else {                                                                //state1
            g.drawImage(imgstate1.getImage(), 0, 0, 1000, 800, this);
            g.drawImage(m.im[m.count - 1].getImage(), m.x, 550, 110, 160, this);

            for (int i = 0; i < fireball.size(); i++) {
                Fireball ba = fireball.get(i);
                g.drawImage(ba.imfire[ba.count % 2].getImage(), ba.x, ba.y, 50, 50, null);
                ba.move();
                ba.count++;
                if (ba.y < 0) {
                    fireball.remove(i);
                }
            }

            //========================================ball1================= 
            for (int i = 0; i < ba1.size(); i++) {
                g.drawImage(ba1.get(i).getImage(), ba1.get(i).getX(), ba1.get(i).getY(), 100, 100, this);
                ba1.get(i).yy = 0;          //ba1.get(i).yy=2;     //  old code
                if (ba1.get(i).y >= 550 && ba1.get(i).x < 600) {
                    HP--;
                    ba1.remove(i);
                }
                if (times % 3 == 1) {
                    ba1.get(i).y--;
                }                     // zig zac state1
            }
            for (int i = 0; i < fireball.size(); i++) {
                for (int j = 0; j < ba1.size(); j++) {
                    if (Intersect(fireball.get(i).getbound(), ba1.get(j).getbound()) && j < ba1.size() && i < fireball.size()) {
                        ba1.remove(j);
                        fireball.remove(i);
                        scor += 50;
                    }
                }
            }
            //========================ball2=========================
            for (int i = 0; i < ba2.size(); i++) {

                ba2.remove(i);
            }
            //=================================ball5=============
            for (int i = 0; i < ba5.size(); i++) {
                g.drawImage(ba5.get(i).getImage(), ba5.get(i).x, ba5.get(i).y, 100, 100, this);
                if (ba5.get(i).y >= 700) {
                    ba5.remove(i);
                }

            }
            for (int i = 0; i < fireball.size(); i++) {
                for (int j = 0; j < ba5.size(); j++) {
                    if (Intersect(fireball.get(i).getbound(), ba5.get(j).getbound()) && j < ba5.size() && i < fireball.size()) {
                        ba5.remove(j);
                        fireball.remove(i);
                        scor -= 50;
                        g.drawString("-50", m.x + 100, 580);
                    }
                }
            }

            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.setColor(Color.BLACK);
            g.drawString("SCORE =  " + scor, 150, 750);
            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.drawString("STATE " + s1, 400, 80);
            g.drawString("Time " + times, 800, 750);
            g.setColor(Color.RED);
            g.drawString("HP  " + HP, 50, 750);

        }

    }

    public boolean Intersect(Rectangle2D a, Rectangle2D b) {
        return (a.intersects(b));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BStartover) {
            this.setSize(1000, 800);
            this.add(hg);
            this.setLocation(null);
            timestart = true;
            startball = true;
        } else if (e.getSource() == BExitover) {
            System.exit(0);
        }
    }
}
