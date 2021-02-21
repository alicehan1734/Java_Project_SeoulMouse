package MiniGame;
import JAVA_FinalProject.*;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


public class MiniGame1 extends JFrame  {

    private Image bufferImage;
    private Graphics screenGraphic;

    private Clip clip;

    private Image backgroundImage = new ImageIcon("C:\\Users\\한희연\\IdeaProjects\\thread study\\src\\image\\들판.png").getImage();
    private Image player = new ImageIcon("C:\\Users\\한희연\\IdeaProjects\\thread study\\src\\image\\제리.png").getImage();
    private Image coin = new ImageIcon("C:\\Users\\한희연\\IdeaProjects\\thread study\\src\\image\\치즈.png").getImage();
    private Image cat = new ImageIcon("C:\\Users\\한희연\\IdeaProjects\\thread study\\src\\image\\톰.png").getImage();
    private Image cat_1 = new ImageIcon("C:\\Users\\한희연\\IdeaProjects\\thread study\\src\\image\\톰_1.png").getImage();


    private int playerX,playerY;
    private int playerWidth = player.getWidth(null);
    private int playerHeight = player.getHeight(null);
    private int a;
    private int b;


    private int catX,catY;
    private int catWidth = cat.getWidth(null);
    private int catHeight = cat.getHeight(null);

    private int coinX,coinY;
    private int coinWidth = coin.getWidth(null);
    private int coinHeight = coin.getHeight(null);

    public static int score;
    public static int time;

    private boolean up, down, left, right;


    public MiniGame1(){
        setTitle("미니게임 1. 치즈를 회수하라!");
        setSize(800,472);
        setResizable(false);
        setLocationRelativeTo(null);  //정중앙에 뜨도록
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);


        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {

                    case KeyEvent.VK_W:
                        up = true;
                        break;

                    case KeyEvent.VK_S:
                        down = true;
                        break;

                    case KeyEvent.VK_A:
                        left = true;

                        break;

                    case KeyEvent.VK_D:
                        right = true;
                        break;

                }

            }
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {

                    case KeyEvent.VK_W:
                        up = false;
                        break;

                    case KeyEvent.VK_S:
                        down = false;
                        break;

                    case KeyEvent.VK_A:
                        left = false;

                        break;

                    case KeyEvent.VK_D:
                        right = false;
                        break;

                }

            }

        });
        Init();

        Runnable task = new Time();
        Thread thread = new Thread(task);
        thread.start();

        draw();

        while(true){

            try{
              Thread.sleep(10);
            }catch(Exception e){
              e.printStackTrace();
            }

            if(time>=0 && time<=15) {
                keyProcess();
                crashCheck();
            }

        }




    }


   public void draw(){

        a = 10;
        b = 10;

        new Thread(){
            public void run(){
                while(true){

                    catX+=a;
                    catY+=b;

                    if(catX<-400 || catX+catWidth>1300){
                        a=-a;
                    }
                    if(catY<-400|| catY+catHeight>800){
                        b=-b;
                    }


                    try{
                      Thread.sleep(50);

                    }catch(Exception e){
                      e.printStackTrace();
                    }


                }

            }


        }.start();
    }


    public void Init(){


        score = 0;

        playerX = (800 - playerWidth)/2;
        playerY = (472 - playerHeight)/2;

        catX = (800 - catWidth)/3;
        catY = (472 - catHeight)/3;

        coinX = (int)(Math.random()*(801-playerWidth));
        coinY = (int)(Math.random()*(473-playerHeight-30))+30;
    }

    public void keyProcess() {
        if(up && playerY-3 > 30) playerY-=3;
        if(down && playerY +playerHeight +3 < 472) playerY +=3;
        if(left && playerX - 3 >0) playerX -=3;
        if(right && playerX + playerWidth + 3 < 800) playerX+=3;
    }

    public void crashCheck(){
        if (playerX+playerWidth > coinX && coinX + coinWidth > playerX && playerY +playerHeight > coinY && coinY+coinHeight > playerY){
            score += 30;
            coinX = (int)(Math.random()*(801-playerWidth));
            coinY = (int)(Math.random()*(473-playerHeight-30))+30;
            playSound("C:\\Users\\한희연\\IdeaProjects\\Java_4weeks_project - 복사본\\src\\music\\띠링.wav",false);
        }

        if(playerX+playerWidth > catX && catX + catWidth > playerX && playerY +playerHeight > catY && catY+catHeight > playerY){
            score -= 10;
            catX = (int)(Math.random()*(801-playerWidth));
            catY = (int)(Math.random()*(473-playerHeight));
            playSound("C:\\Users\\한희연\\IdeaProjects\\Java_4weeks_project - 복사본\\src\\music\\뿅.wav",false);


        }
    }

        public void playSound(String pathName, boolean isLoop){
            try{
              clip = AudioSystem.getClip();
              File audioFile = new File(pathName);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                clip.open(audioStream);
                clip.start();
                if (isLoop)
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
            }catch (LineUnavailableException e){
                e.printStackTrace();
            }catch (UnsupportedAudioFileException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            };

        }
        public void paint(Graphics g){
    bufferImage = createImage(800,472);
    screenGraphic = bufferImage.getGraphics();
    screenDraw(screenGraphic);
    g.drawImage(bufferImage, 0,0,null);

    }

    public void screenDraw(Graphics g){
        g.drawImage(backgroundImage,0,0,null);
        g.drawImage(coin,coinX,coinY,null);
        g.drawImage(player,playerX,playerY,null);
        g.drawImage(cat,catX,catY,null);
        g.drawImage(coin,325,35,null);
        g.drawImage(coin,600,35,null);
        g.drawImage(cat_1,600,80,null);


        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD,30));
        g.drawString(":  "+score, 390,70);
        g.drawString(" : + 30 ", 650,70);
        g.drawString(" : - 10 ", 650,115);


        g.setColor(Color.BLUE);

        if(time<0) {
            g.drawString("Game Start! " + time, 20, 70);
        }
        else{
            g.drawString("TIME(15 sec) : " + time, 20, 70);
        }
        this.repaint();
    }


}

class Time implements Runnable {
    int a;
    public void run(){
        MiniGame1.time = -3;

            while(MiniGame1.time<15) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MiniGame1.time++;
            }

            a=MiniGame1.score;
        JOptionPane.showMessageDialog(null, "시간이 지났습니다. 창을 꺼주세요!!\n 획득한 치즈 수: " + MiniGame1.score+" 치즈", "미니게임 종료", JOptionPane.WARNING_MESSAGE);
        MiniGame1.time = -3;
        MiniGame1_main mini = new MiniGame1_main();
        mini.Final_section(a);

    }


    }

