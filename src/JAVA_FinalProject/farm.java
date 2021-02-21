package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class farm extends Start {
    String choose_animal;
    Music_sub introMusic_2 = new Music_sub("문자.mp3", false);

    public void farm() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println("──────────────────── 농 장 청 결 치 ─────────────────────");
        System.out.println("========================================================");
        Thread th1 = new Thread(new Runnable() {
            public void run() {

                while(cleanhouse>0){
                try {
                    Thread.sleep(150000);
                } catch (InterruptedException e) {
                }
                    cleanhouse --;

                    if(cleanhouse==0){
                        introMusic_2.start();
                        System.out.println("✉ 띠-링! 옆집 농장 주인 : 아니 글쎄 너네 농장이 너무 더러워서, 우리농장까지 악취가 번졌어,, 얼른가서 치워주길바랄게! 얼른 너네 농장으로 가봐!");
                        break;
                    }
                }




            }
        });
        th1.start();


        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {

                while(goose>0||sheep>0||dolphin>0){

                    try {
                        Thread.sleep(400000);
                    } catch (InterruptedException e) {
                    }


                    if(dolphin<=0||sheep<=0||goose<=0){
                        break;
                    }
                    goose_hungry ++;
                    sheep_hungry ++;
                    dolphin_hungry ++;

                    if(goose_hungry==10||sheep_hungry==10||dolphin_hungry==10){

                        System.out.println("ꂇ 건너편 농장 주인 : 당신네 동물들이 굶고 있다는 소문이돌던데,,, 얼른 가봐야할것같아. 조만간 죽을수도 있을걸세 ");
                    }else if(goose_hungry<10||sheep_hungry<10||dolphin_hungry<10){

                    }else if(goose_hungry>10&&goose>0){
                        goose_hungry --;
                        goose --;
                        System.out.println("ꂇ 건너편 농장 주인 : 우연히 당신네 거위 한마리가 굶어 죽어있는걸 발견했네... 얼른 남은 거위들이있다면 잘 좀 먹이를 주겠나.");
                    }else if(sheep_hungry>10&&sheep>0){
                        sheep_hungry --;
                        sheep --;

                        System.out.println("ꂇ 건너편 농장 주인 : 우연히 당신네 양 한마리가 굶어 죽어있는걸 발견했네... 얼른 남은 양 들이있다면 잘 좀 먹이를 주겠나.");
                    }else if(dolphin_hungry>10&&dolphin>0){
                        dolphin_hungry --;
                        dolphin --;

                        System.out.println("ꂇ 건너편 농장 주인 : 우연히 당신네 돌고래 한마리가 굶어 죽어있는걸 발견했네... 얼른 남은 돌고래들이있다면 잘 좀 먹이를 주겠나.");
                    }

                }



            }
        });

        th2.start();

        if(cleanhouse<=0) {
            System.out.println("                 □   □   □   □   □");
            System.out.println("                      O.M.G (0/5)");


        }else if(cleanhouse==1){
            System.out.println("                 □   □   □   □   ■");
            System.out.println("                     HUH.... (1/5)");
            goose_happy --;
            dolphin_power --;
            sheep_happy --;
        }else if(cleanhouse==2){
            System.out.println("                 □   □   □   ■   ■");
            System.out.println("                     REALLY.. (2/5)");

        }else if(cleanhouse==3){
            System.out.println("                 □   □   ■   ■   ■");
            System.out.println("                      NOT BAD (3/5)");

        }else if(cleanhouse==4){
            System.out.println("                 □   ■   ■   ■   ■");
            System.out.println("                    GOOD JOB! (4/5)");

        }else if(cleanhouse==5){
            System.out.println("                 ■   ■   ■   ■   ■");
            System.out.println("                   EXCELLENT!! (5/5)");

        }


        System.out.println("");

        System.out.println("────────────────────── 현 재 동 물 ──────────────────────");
        System.out.println("========================================================");
        System.out.println("                 (1) 거위   : " + goose + " 마리");
        System.out.println("                 (2) 돌고래 : " + dolphin + " 마리");
        System.out.println("                 (3) 양    : " + sheep + " 마리");
        System.out.println("========================================================");
        System.out.println("보살필 동물을 선택해주세요(농장 치우기 - 4, 뒤로가기 - 아무키) ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {

                Goose mystart = new Goose();
                mystart.Goose();

                break;

            } else if (choose_animal.equals("2")) {
                Dolphin mystart = new Dolphin();
                mystart.Dolphin();

                break;

            } else if (choose_animal.equals("3")) {
                Sheep mystart = new Sheep();
                mystart.Sheep();

                break;

            } else if (choose_animal.equals("4")) {
                Clean_farm mystart = new Clean_farm();
                mystart.Clean_farm();

                break;
            } else {
                money();


                break;
            }
        }
    }




    }
