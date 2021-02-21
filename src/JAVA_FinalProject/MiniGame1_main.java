package JAVA_FinalProject;
import MiniGame.MiniGame1;

import java.util.Scanner;

public class MiniGame1_main extends Main_MiniGame {

    Scanner scan = new Scanner(System.in);
    LoadingBar t = new LoadingBar();

    public void MiniGame1_main(){

        for(int i=0;i<40;i++){
            System.out.println("");
        }
        if(Start.presentmoney<40){
            System.out.println("40치즈가 없습니다. 자동으로 메인화면 이동하겠습니다.");
            t.run();
            Start start = new Start();
            start.money();

        }else {
            System.out.println("");
            System.out.println("1번을 선택하셨습니다. 사용자님의 현재 자본금을 확인한 결과, 40치즈 이상이시므로 추가 입장료는 자동으로 차감하였습니다. ");
            Start.presentmoney -= 40;
            System.out.println("========================총 현재 자산 :" + Start.presentmoney + " 치즈========================");
            System.out.println("");
            String msg = "게임은 자동으로 실행됩니다.(방향키 a: → | w: ↑ | d: → | s: ↓ )";
            String msg2 ="게임방법 : 방향키를 이용하여 고양이를 피해 치즈를 많이 가져가세요! (치즈 획득 : +30점, 고양이 접촉 : -10점)";
            slowPrint(msg,90);
            System.out.println("");

            slowPrint(msg2,90);
            System.out.println("");


            t.run();

        }

        new MiniGame1();


    }

    public void Final_section(int servemoney){

        String enterancemoney;
        System.out.println("");
        System.out.println("총 획득한 치즈 : "+ servemoney);
        System.out.println("도박 두목 : 역시 도박은 재미나지않나?? 훗훗^^");
        Start.presentmoney += servemoney;
        System.out.println("========================총 현재 자산 :" + Start.presentmoney + " 치즈========================");
        System.out.println("");
        System.out.println("─────────────────── 도박 상품 ───────────────────");
        System.out.println("                      (1)                    ");
        System.out.println("                 치즈를 회수하라!                    ");
        System.out.println("특징:       15초동안 치즈를 마음껏 가져올수있다.       ");
        System.out.println("주의사항:       추가 입장료: 40치즈                  ");
        System.out.println("* 현재자산이 추가 입장료(40치즈)보다 없다면, 자동으로 도박장에서 쫓겨납니다.");
        System.out.println("────────────────────────────────────────────────");
        System.out.println("도박 두목 : 허허, 또 도전해보실텐가? (도박장 나가기 - 1번 키를 제외한 아무키)");

        enterancemoney = scan.next();

        for(int i=0;i<40;i++){
            System.out.println("");
        }

        if(enterancemoney.equals("1")){
            MiniGame1_main();

        }else{
            Start start = new Start();
            start.money();
        }
    }
}