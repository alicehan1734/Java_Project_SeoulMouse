package JAVA_FinalProject;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Start extends Introduction{
    Music introMusic_Main = new Music("경쾌한음악.mp3", true);

    public static  int total_qty_parttime_monkey;
    public static  int total_qty_parttime_elephant;
    public static  int total_qty_parttime_cat;
    public static  int bar;
    public static boolean theend;
    public static int cleanhouse;
    public static int time = 15;

    public static int money;
    public static int presentmoney;
    public static float percentage;

    String firstQnA;

    public static int goose;
    public static int goose_hungry;
    public static float goose_hungry_2;

    public static int goose_egg;
    public static int goose_happy;
    public static int goose_happy_2;
    public static int warehouse[] = new int[10];
    public static int warehouse_price[] = new int[10];



    public static int dolphin;
    public static int dolphin_power;
    public static int dolphin_hungry;

    public static int sheep;
    public static int sheep_hungry;
    public static int sheep_happy;

    public static void slowPrint(String message, long millisPerChar)
    {

        System.out.print("                                              ");

        for(int i=0; i<message.length();i++){
            System.out.print(message.charAt(i));

            try{
                {
                    Thread.sleep(millisPerChar);
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }

        System.out.println("");
        System.out.println("");

    }

    public static void slowPrint_short(String message, long millisPerChar)
    {

        System.out.print("                           ");

        for(int i=0; i<message.length();i++){
            System.out.print(message.charAt(i));

            try{
                {
                    Thread.sleep(millisPerChar);
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }

        System.out.println("");
        System.out.println("");

    }

    public void start_introduction() {
        theend = true;

        Music introMusic = new Music("Upbeat Ukulele Background Music.mp3", true);
        introMusic.start();

        cleanhouse = 5;
        goose_hungry=8;
        goose_happy=5;
        dolphin_power = 7;
        dolphin_hungry = 3;
        sheep_hungry = 5;
        sheep_happy =5;
String scan_2;
        theend = false;

        for(int i = 0; i < 5;i++){
            warehouse[i] = 1;
        }

        for(int i=0;i<10;i++){
            System.out.println("");
        }
        String msg = "(이솝 우화 '서울쥐 시골쥐' 중,,)";
        String msg1 = "시골의 음식들이 너무 입맛에 맞지않는 서울쥐는 시골쥐를 초대합니다.";
        String msg2 = "시끌벅적 서울에 시골쥐는 그만 매료되었고, 서울에서 평생 살기로 마음을 새깁니다.";
        String msg3 = "시골쥐 : 그래----!!!! 다짐했엇!!! 한번 사는 인생 한국의 수도인 서울에서 살아보는거얏!!!! >__<";
        String msg4 = "시골쥐 : 우선 살려면 부동산을 가야겠지,, ? ";

        slowPrint(msg, 70);
        slowPrint(msg1, 70);
        slowPrint(msg2, 70);
        slowPrint(msg3, 70);
        slowPrint(msg4, 70);


System.out.println("                                           ┌──────────────────────────────────────────────────────────────────────────────────┐\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
        "\n" +
                "\n" +
                "                                           └──────────────────────────────────────────────────────────────────────────────────┘                                                                                           \n");

        Music_sub introMusic2 = new Music_sub("초인종 소리.mp3", false);
        introMusic2.start();

       String msg5 = "시골쥐 : 엇,,, 아 안녕하세요..!!! 저 서울에서 살려고하는데, 새로나온 매물이 있을까요? ";
       String msg6 = "부동산 대가 : 아이고- 요즘 경기가 다들 안좋은지 매물이 시원치 않아. 그나마 매물이 있다면 이것이여~~";
        slowPrint(msg5, 70);
        slowPrint(msg6, 70);
        introMusic2.stop();

        System.out.println("                                           ┌──────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("                                                       1. 낡고 허름한 집 (고양이 거주) ( 가격 : 3,000 치즈 ) - 초급     ");
        System.out.println("                                                       2. 다양한 동물들이 사는 아파트  ( 가격 : 5,000 치즈 ) - 중급     ");
        System.out.println("                                                       3. 뛰놀수있는 마당집           ( 가격 : 10,000 치즈 ) - 고급  ");
        System.out.println("                                           └──────────────────────────────────────────────────────────────────────────────────┘");
       String msg7 = "시골쥐 : 흠.. 그나마 절 홀리는 매물은 이거네요!!";
        slowPrint(msg7, 70);

        System.out.println("                                           당신을 홀리는 집매물은 무엇인가요? (부동산 사진을 다시 보고싶으시면 0 번을 입력하세요.)");
        seethehome();

        while(true) {
            Scanner scan = new Scanner(System.in);
            firstQnA = scan.nextLine();

            if (firstQnA.equals("1")) {
                money = 3000;
                goose =1;
                dolphin=1;
                sheep=1;
                presentmoney = 100;
                break;

            } else if (firstQnA.equals("2")) {
                money = 5000;
                goose =2;
                dolphin=2;
                sheep=2;
                presentmoney = 200;

                break;

            } else if (firstQnA.equals("3")) {
                money = 10000;
                goose =3;
                dolphin=3;
                sheep=3;
                presentmoney = 300;

                break;

            }else if (firstQnA.equals("0")){
             seethehome();
                start_introduction();
            }
            else{
                System.out.println("숫자만 입력해주세요.");
                continue;
            }
        }

        String where;
        String msg8 ="부동산 대가 : 하이고 어떡하면 좋아.. 하필 그 집주인이 10일후까지 매매가 안되면 다시 산다고 하네??  ";
        String msg9 ="부동산 대가 : 매매금은 10일까지 마련해주면 좋겠네,, 다른집들은 기한이 3일까지야! 10일이면 긴거 알지??";
        slowPrint(msg8, 70);
        slowPrint(msg9, 70);
        System.out.println("                          ████████████████████████████████████████ 미션!! 10일간동안 선택하신 집의 자금을 확보하세요!! ████████████████████████████████████████");
        System.out.println("                                           아무키를 누르면, 게임이 시작됩니다.");

        Scanner scan = new Scanner(System.in);
        scan_2 = scan.nextLine();
        LoadingBar t = new LoadingBar();
        t.run();

        Music_sub introMusic_1 = new Music_sub("키보드.mp3", true);
        introMusic_1.start();


        for(int i=0;i<10;i++){
            System.out.println("");
        }
        String msg10 =" 게임방법도 모르고 어떻게 게임을 시작하냐구요 ?? 그럴줄 알고 게임방법을 소개해드릴려고 했죠!!";
        slowPrint(msg10, 70);


        System.out.println("                        ┌─────────────────────────────────────────────────────────── 가 이 드 라 인 ───────────────────────────────────────────────────────────┐");

        String msg11 ="치즈를 얻는 방법            :  ① 마우스농장에 있는 거위, 돌고래, 양을 키우세요! 거위의 알, 돌고래의 공연, 양털을 통해 치즈를 얻을 수 있습니다.   ";
        String msg12 ="동물들의 알,공연,양털을 얻는법 :  ① 동물들 마다 각각의 선호하는 (배고픔, 행복, 체력 수치)의 기준이 있습니다. 기준에 도달하면 얻을 수 있어요!   ";
        String msg13 ="배고픔, 행복, 체력 수치 키우는 법 : ① 산책과 사료를 줌으로써 수치를 만들어갈 수 있어요.   ② 병원을 데리고 가면 수치를 풀로 채울 수 있어요!";
        String msg14 ="치즈를 다 모으면 어떻게 하나요 :  ① '(7) 부동산가기' 에 들어가 집을 사세요! (* 목표금액을 채우지 못하면 집을 살 수 없습니다.)";
        slowPrint_short(msg11, 70);
        slowPrint_short(msg12, 70);
        slowPrint_short(msg13, 70);
        slowPrint_short(msg14, 70);

        System.out.println("                        └───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘");
        String msg15 =" 에이~~ 이게 다냐구요?? 기본적인 가이드는 그만하고!! 그 다음화면에 각종 치즈를 모으는 방법들이 다양하게 있단 말씀!!!! ";
        String msg16 =" 이제 본격적으로 시작해볼까요?? (아무키를 누르면 정말 시작됩니다!)";
        slowPrint(msg15, 70);
        slowPrint(msg16, 70);
        introMusic_1.close();
        scan_2 = scan.nextLine();

        t.run();
        introMusic.close();
        introMusic_Main.start();

        money();
    }
    public void money(){
        String where;

        for(int i=0;i<40;i++){
            System.out.println("");
        }
        Runnable task = new timecheck();
        Thread thread = new Thread(task);
        thread.start();


        System.out.println("──────────────────────────────────────────────────────────────────────────────────── 타 임 라 인 ────────────────────────────────────────────────────────────────────────────────────                                                                                                                                                            ");

        System.out.println("            10일째            9일째            8일째           7일째            6일째            5일째            4일째            3일째            2일째            1일째                                                                                                                                                                ");

        if(bar==0) {
            System.out.println(" \033[32m  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\033[0m");
        }else if(bar==1){
            System.out.println(" \033[33m  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□\033[0m");

        }else if(bar==2){
            System.out.println("  \033[34m ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==3){
            System.out.println("  \033[35m ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==4){
            System.out.println(" \033[36m  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==5){
            System.out.println(" \033[32m  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==6){
            System.out.println(" \033[33m  ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==7){
            System.out.println("  \033[31m ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==8){
            System.out.println("\033[31m  ■■■■■■■■■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==9){
            System.out.println("\033[31m ■■■■■■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==10){
            System.out.println("\033[31m ■■■■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }else if(bar==11){
            System.out.println("\033[31m □□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\033[0m");

        }


            System.out.println("");

            System.out.println("                        ┌────────────────────────────────────────────────────────────── T I P  ─────────────────────────────────────────────────────────────┐");
            System.out.println("");
            System.out.println("                           치즈를 더! 얻는 방법        :  ① 소정의 책임비가 있는 동물들을 입양소에서 입양해보세요!     ② 5)미니게임을 통해 치즈를 얻고 잃을 수 있습니다.");
            System.out.println("                                                       ③ 3)은행에 있는 적금혜택을 이용해보세요! 금리가 아주 높아요.  ④ 6)직원을 구하면 치즈는 자연스럽게~ 내손에!");
        System.out.println("");
        System.out.println("                           동물들의 간식을 사는법       :  ① 상가에 가면 모든게 다 있어요!   ");
            System.out.println("");
            System.out.println("                        └───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘");

        System.out.println("");
        System.out.println("                     \033[31m** 주의 사항 **\033[0m   :  농장은 주기적으로 청소해주세요! (더러우면 동물들의 행복지수가 낮아집니다.) / 하루에 한번씩은 먹이를 주세요! (배고프면 동물들의 배고픔지수가 높아집니다.)   ");

        System.out.println("");

        percentage = (float)presentmoney/(float)money;

        System.out.println("                           ◈◈◈◈◈◈◈◈◈◈◈◈ 메 인 화 면 ◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("                                          □ 목 표 금 액 : "+ money +" 치즈");
        System.out.println("                                          □ 현 재 금 액 : "+ presentmoney +" 치즈");
        System.out.println("                                          ■ 목  표  치  : "+ String.format("%.1f",percentage*100) +" %");
        System.out.println("                                          ■ 타 임 라 인 : D - "+ (10-bar)+" 일" );
        System.out.println("                           ──────────────────────────────────────────────────────");

        if(percentage*100 >= 100){
        System.out.println("\033[31m ♩ ♪ ♫ ♬ 목표치를 이루었습니다! 얼른 '(7) 부동산가기' 를 들어가, 집을 사세요!! ♩ ♪ ♫ ♬\033[0m");
        }


        System.out.println("                                                                                                    ◆◇◆◇◆◇◆◇◆◇◆◇◆◇ 목 록 ◆◇◆◇◆◇◆◇◆◇◆◇◆◇    ");
        System.out.println("");
        System.out.println("                                                                                                                        1) 농장 가기");
        System.out.println("                                                                                                                        2) 상가 가기 (병원, 상점)");
        System.out.println("                                                                                                                        3) 은행 가기 (적금)");
        System.out.println("                                                                                                                        4) 입양소 가기");
        System.out.println("                                                                                                                        5) 미니 게임 (도박소)");
        System.out.println("                                                                                                                        6) 직원 구하기");
        System.out.println("                                                                                                                        7) 부동산 가기");
        System.out.println("");
        System.out.println("                                                                                                    ────────────────────────────────────────────────────────");

        System.out.println("               번호를 선택해주세요.");

            Scanner scan = new Scanner(System.in);
            where = scan.nextLine();


        if (where.equals("1")) {

                farm mystart = new farm();
                mystart.farm();

            } else if (where.equals("2")) {
                Emart mystart = new Emart();
                mystart.Emart();


            } else if(where.equals("3")){

            Bank bank = new Bank();
            bank.Bank();
             } else if (where.equals("4")) {
                Adopt mystart = new Adopt();
                mystart.Adopt();

            } else if (where.equals("5")) {
            Main_MiniGame Main_MiniGame = new Main_MiniGame();
            Main_MiniGame.Main_MiniGame();

        }   else if (where.equals("6")) {
                parttime mystart = new parttime();
                mystart.parttime();


            }else if (where.equals("7")) {
            realestate mystart = new realestate();
                mystart.realestate();


            }else if (where.equals("i want money")) {
                presentmoney = money;
                money();

            }else if (where.equals("hard job")) {
                total_qty_parttime_monkey = 300;
                total_qty_parttime_elephant= 300;
                total_qty_parttime_cat= 300;
                money();
            }else if (where.equals("turn off the music")) {
            introMusic_Main.close();
            money();


        }else {
                System.out.println("               숫자만 입력해주세요.");
                money();

            }



    }
void seethehome() {

        JFrame frame = new JFrame("부동산 사진"); //1.최상위 컨테이너 생성
        frame.setSize(650, 250); //사이즈
        frame.setLayout(new FlowLayout());
        JPanel p = new JPanel(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        ImageIcon icon_1 = new ImageIcon("C:\\Users\\1번집.png"); //이미지 아이콘 객체 생성
        ImageIcon icon_2 = new ImageIcon("C:\\Users\\2번집.png"); //이미지 아이콘 객체 생성
        ImageIcon icon_3 = new ImageIcon("C:\\Users\\3번집.png"); //이미지 아이콘 객체 생성

        Image im = icon_1.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
        Image im_2 = icon_2.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
        Image im_3 = icon_3.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!

        Image im1 = im.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        Image im2 = im_2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        Image im3 = im_3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        ImageIcon icon1 = new ImageIcon(im1);
        ImageIcon icon2 = new ImageIcon(im2);
        ImageIcon icon3 = new ImageIcon(im3);

        JLabel img_1 = new JLabel(icon1);
        JLabel img_2 = new JLabel(icon2);
        JLabel img_3 = new JLabel(icon3);

        frame.add(img_1);
        frame.add(img_2);
        frame.add(img_3);

        frame.setLocation(525, 350);  //위치 지정


        frame.setVisible(true); //화면에 보이기
        frame.setAlwaysOnTop(true);



    }
}

class timecheck extends Start implements Runnable{

    @Override
    public void run(){

            while(true) {

                try {
                    Thread.sleep(250000);
                } catch (InterruptedException e) {
                }

                bar +=1;


                if(Bank.bar_day >= 1){
                        if(Bank.bar_day + 1 == Bank.bar_day_2){
                        System.out.println("✉ 띠-링! 은행 : 적금만기 되었습니다. 은행을 들러 적금을 찾아가세요. ");
                            Bank.bar_day = 0 ;
                            Expiration_service.service = true;
                    }
                        else if(Bank.bar_day <= Bank.bar_day_2){
                        if(presentmoney < Bank.money){
                            System.out.println("✉ 띠-링! 은행 : 적금 출금 금액 초과입니다. 적금 해지되었습니다. 감사합니다.("+Bank.money+" 치즈 출금 불가능)");
                            presentmoney = presentmoney + (Bank.money*(Bank.bar_day-1));
                            System.out.println("✉ 띠-링! 은행 : 적금 출금되었던 금액 모두 상환합니다. 감사합니다.("+Bank.money*(Bank.bar_day-1)+" 치즈 입금 완료, 현재 나의 금액 : "+presentmoney+" 치즈)");
                            Bank.bar_day = 0;
                        }
                        else{
                            presentmoney = presentmoney - Bank.money;
                            System.out.println("✉ 띠-링! 은행 : 매일 적금 금액이 자동으로 이체 되었습니다.("+Bank.money+" 치즈 출금 완료, 현재 나의 금액 : "+presentmoney+" 치즈)");
                            Bank.bar_day ++;
                        }


                    }
                    Music_sub introMusic_2 = new Music_sub("문자.mp3", false);
                    introMusic_2.start();
                }


                if(bar == 11){
                    System.out.println("██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n" +
                            "██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" +
                            "██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n" +
                            "██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" +
                            "╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" +
                            " ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝\n" +
                            "                                                                          \n" +
                            "                                                                          \n" +
                            "                                                                          \n" +
                            "                                                                          ");
                    bar=11;
                    System.out.println("숫자 7번을 눌러 부동산을 가시면 게임이 완전히 종료됩니다.");

                    break;
                }
            }



    }
}