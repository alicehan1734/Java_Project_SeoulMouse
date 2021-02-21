package JAVA_FinalProject;
import MiniGame.*;
import java.util.Scanner;

public class Main_MiniGame{
    LoadingBar t = new LoadingBar();


    public void Main_MiniGame()
    {
        String enterancemoney;

        for(int i=0;i<40;i++){
            System.out.println("");
        }

        System.out.println("\n" +
                "                -::://////////////:-              \n" +
                "              -:``````       ``````/s`            \n" +
                "            .o-                     .s-           \n" +
                "           ++                         ++          \n" +
                "         -y-                           -s`        \n" +
                "       `so                              `s-       \n" +
                "      :y.                                 +:      \n" +
                "     yo.................---------:::::::://s/     \n" +
                "     .----d:------------...........`````d``       \n" +
                "          d                `-.--..--:`  d         \n" +
                "          d                :ss:+d/-oh-  d         \n" +
                "          d  +/oooooooo++  :o+:ooo/sh:  d         \n" +
                "          d  oo`       oo  -h/.:y+-/h:  d         \n" +
                "         `d  o/.       oo   +////////`  d         \n" +
                "         `d  o/-       oo               d         \n" +
                "         `h  o/-/:     oo               d         \n" +
                "         `h  +/-       o+`              d         \n" +
                "         .h  o+.       o/.              d         \n" +
                "         .h  o+`       +/:      ````````d         \n" +
                "         `+//o+////////+/+////////::::::-         ");
        System.out.println("호잇---! 도박장에 오신걸 환영합니다.");
        System.out.println("========================총 현재 자산 :" + Start.presentmoney + " 치즈========================");
        System.out.println("입장료는 20치즈 입니다. (들어가시겠습니까? - 아무키 , 1 - 돌아가기)");
        System.out.println("* 현재 자산이 입장료(20치즈)보다 적을경우 자동으로 돌아갑니다.");

        Scanner scan = new Scanner(System.in);
        enterancemoney = scan.next();
        t.run();

        if(enterancemoney.equals("1") || Start.presentmoney  <20 ){
            Start start = new Start();
            start.money();
        }else{
            Start.presentmoney  -=20;

        }


        for(int i=0;i<40;i++){
            System.out.println("");
        }

        System.out.println("─────────────────── 도 박 소 ───────────────────");
        System.out.println("           ");

        String message ="도박 두목 : 호잇---! 가짜도박장에 오신걸 환영한다네.\n도박 두목 : 우리 도박장에는 오직 한가지의 게임이 있어!\n도박 두목 : 게임은 40치즈의 입장료를 내고, 15초동안 당신이 무서워하는 고양이를 피해 치즈를 많이 가져가는거지.\n";
        slowPrint(message, 50);
        String message1 = "도박 두목 : 이미 20치즈의 입장료를 냈다고? 훗, 그건 당신 사정이지 않나^^\n도박 두목 : 우린 이기적인 놈들이라. 우린 우리밖에 몰라. 훗^^\n";
        slowPrint(message1, 50);
        System.out.println("─────────────────── 도박 상품 ───────────────────");
        System.out.println("                      (1)                    ");
        System.out.println("                 치즈를 회수하라!                    ");
        System.out.println("특징:       15초동안 치즈를 마음껏 가져올수있다.       ");
        System.out.println("주의사항:       추가 입장료: 40치즈                  ");
        System.out.println("────────────────────────────────────────────────");
        System.out.println("도박 두목 : 허허, 알겠다하면 '1'번을 선택해주게. (아무키 - 돌아가기) ");
        enterancemoney = scan.next();
        if(enterancemoney.equals("1")){
                t.run();
            MiniGame1_main mini = new MiniGame1_main();
            mini.MiniGame1_main();

        }else{
            Start start = new Start();
            start.money();
        }


        for(int i=0;i<40;i++){
            System.out.println("");
        }


    }
    public static void slowPrint(String message, long millisPerChar)
    {
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
    }

}





