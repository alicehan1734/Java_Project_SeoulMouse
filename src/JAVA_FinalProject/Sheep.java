package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Sheep  extends farm{

    public void Sheep(){

        Music_sub introMusic_sheep = new Music_sub("양.mp3", false);
        introMusic_sheep.start();

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        if(sheep_hungry>10){
            sheep_hungry = 10;
        }
        if(sheep_happy<0){
            sheep_happy = 0;
        }

        System.out.println("                                 ◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("                                          □ 목 표 금 액 : "+ money +" 치즈");
        System.out.println("                                          □ 현 재 금 액 : "+ presentmoney +" 치즈");
        System.out.println("                                          ■ 목  표  치  : "+ String.format("%.1f",percentage*100) +" %");
        System.out.println("                                          ■ 타 임 라 인 : D - "+ (10-bar)+" 일" );
        System.out.println("                               ──────────────────────────────────────────────────────");
        System.out.println("───────────────양 목장───────────────────────────────기록 사항─────────────────────────────────────────────TIP────────────────────────────");
        System.out.println(
                "\n" +
                        "            `..` `.....  ``             \n" +
                        "         `..`  `..    `-.` ..-          \n" +
                        "        `-                   :.`        \n" +
                        "       ..-                     -`       \n" +
                        "      :                       `-`       \n" +
                        "      -.`.                     .-       \n" +
                        " `...../-                       :.....`        ■ 양            : " + sheep + " 마리" + "         ① 배고픔 지수(숫자(최대 10)가 높을수록 배고파요. (건초 혹은 물을 주세요!)\n"+
                        "-`     :        -:      :`     ..     `-       ■ 배고픔 지수     : " + sheep_hungry + "             ② 행복(숫자(최대 10)이 높을수록 행복해요. (약 혹은 산책해주세요!) \n" +
                        "-.```..:.   ....  :`  `-``...-:-..````.-       ■ 행복 지수      : " + sheep_happy + "             ③ \033[21m배고픔 5 이하 와 행복 5 이상이 되면 양털이 자라서 깎을 수 있습니다.\033[0m\n" +
                        "  ```:   .        `..`      -`  `-```  \n" +
                        "      -.  :   o.        -/   :  `:      \n" +
                        "       :` -` ./`        .:` ..   :      \n" +
                        "       :   :       `.       :    :      \n" +
                        "       -...`-      ``     `-  -..`      \n" +
                        "          `-.:-`        ..-...          \n" +
                        "             ` `........          ");


        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");

        System.out.println("=========================================================================================================================================");
        System.out.println("                                                (1) 사료(약)주기");
        System.out.println("                                                (2) 산책하기");
        System.out.println("                                                (3) 양털깎기");
        System.out.println("=========================================================================================================================================");
        System.out.println("번호를 선택해주세요.(뒤로가기 0) ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                Sheep_feed();

            } else if (choose_animal.equals("2")) {
                Sheep_power();

            } else if (choose_animal.equals("3")) {
                Sheep_Shave();

            } else if (choose_animal.equals("0")) {
                farm();

            } else {

                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }




    }

    void Sheep_feed() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        while (true) {
            System.out.println("========================양의 상황========================");
            System.out.println("                ■ 배고픔 지수  : " + sheep_hungry);
            System.out.println("                ■ 행복 지수    : " + sheep_happy);
            System.out.println("==========================================================");
            System.out.println("─────────────────────────현재 창고─────────────────────────");
            System.out.println("               (1) 건초    - " + warehouse[0] + "개 (배고픔 지수 ↓)");
            System.out.println("               (2) 물     - " + warehouse[2] + "보틀 (배고픔 지수 ↓)");
            System.out.println("               (3) 줄넘기  - " + warehouse[3] + "개 (행복 지수 ↑)");
            System.out.println("               (4) 공     - " + warehouse[4] + "개 (행복 지수 ↑)");
            System.out.println("               (5) 약     - " + warehouse[5] + "알 (행복 지수 ↑)");
            System.out.println("─────────────────────────────────────────────────────────");
            System.out.println("               번호를 선택해주세요.(뒤로가기 0) ");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();

            if (choose_animal.equals("1")) {                                        //건초

                while (true) {
                    System.out.println("건초 몇개를 선택하시겠습니까?:");
                    int many = scan.nextInt();
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    if (many <= warehouse[0]) {
                        warehouse[0] = warehouse[0] - many;
                        System.out.println("양 " + sheep + " 마리에게 건초 " + many + " 개 를 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) sheep) * 10;
                        goose_hungry_2 = sheep_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("양들의 배고픔지수는 " + sheep_hungry + " 에서 " + (int) goose_hungry_2 + " 로 내려갔습니다.");
                        sheep_hungry = (int) goose_hungry_2;
                        System.out.println("========================================================");
                        break;

                    } else {
                        System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                        break;
                    }
                }


            }else if (choose_animal.equals("2")) {                                        //물

                while (true) {

                    System.out.println("물 몇보틀을 선택하시겠습니까?:");
                    int many = scan.nextInt();
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    if (many <= warehouse[2]) {
                        warehouse[2] = warehouse[2] - many;
                        System.out.println("양 " + sheep + " 마리에게 물 " + many + " 보틀 을 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) sheep) * 5;
                        goose_hungry_2 = sheep_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("양들의 배고픔지수는 " + sheep_hungry + " 에서 " + (int) goose_hungry_2 + " 로 내려갔습니다.");
                        sheep_hungry = (int) goose_hungry_2;
                        System.out.println("========================================================");
                        break;

                    } else {
                        System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                        break;
                    }
                }

            }

            else if (choose_animal.equals("5")) {
                if (sheep_happy >= 10) {
                    System.out.println("약이 필요하지 않습니다. 행복지수가 최대치입니다.");
                    continue;
                } else {
                    while (true) {
                        System.out.println("약 몇알을 선택하시겠습니까?:");
                        int many = scan.nextInt();
                        for (int i = 0; i < 40; i++) {
                            System.out.println("");
                        }
                        if (many <= warehouse[5]) {
                            warehouse[5] = warehouse[5] - many;
                            System.out.println("양 " + sheep + " 마리에게 약 " + many + " 알 을 나누어주었습니다!");
                            goose_happy_2 = 0;
                            goose_happy_2 += ((float) many / (float) sheep) * 5;
                            goose_happy_2 = sheep_happy + goose_happy_2;
                            if (goose_happy_2 > 10) {
                                goose_happy_2 = 10;
                            }
                            System.out.println("양들의 행복지수는 " + sheep_happy + " 에서 " + (int) goose_happy_2 + " 로 올라갔습니다.");
                            sheep_happy = (int) goose_happy_2;
                            System.out.println("========================================================");
                            break;

                        } else {
                            System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                            break;
                        }
                    }
                }
            } else if (choose_animal.equals("3") || choose_animal.equals("4")) {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                System.out.println("               줄넘기와 공은 먹는게 아닙니다!! 산책하기란에 선택해주세요.");

                continue;

            } else if (choose_animal.equals("0")) {
                Sheep();
            } else {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }


    }


    void Sheep_power() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        while (true) {
            System.out.println("========================양의 상황========================");
            System.out.println("                ■ 배고픔 지수  : " + sheep_hungry);
            System.out.println("                ■ 행복 지수    : " + sheep_happy);
            System.out.println("==========================================================");
            System.out.println("────────────────────────────────────────────────────────");
            System.out.println("               (1) 줄넘기  - " + warehouse[3] + "개 (행복 지수 ↑)");
            System.out.println("               (2) 공     - " + warehouse[4] + "개 (행복 지수 ↑)");
            System.out.println("────────────────────────────────────────────────────────");
            System.out.println("               어떤걸 가지고 노시겠습니까? 번호를 선택해주세요.(뒤로가기 0) ");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                if (warehouse[3] == 0) {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("               함께할 줄넘기가 없어요!! 다시 선택해주세요 ");
                    continue;

                } else {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("양" + sheep + "마리와 함께 줄넘기를 가지고 놀고있습니다..");
                    goose_happy_2 = 0;
                    goose_happy_2 = sheep_happy + sheep;

                    if (goose_happy_2 > 10) {
                        goose_happy_2 = 10;
                    }
                    System.out.println("양들의 행복지수는 " + sheep_happy + " 에서 " + goose_happy_2 + " 로 올라갔습니다.");
                    sheep_happy = goose_happy_2;

                }
                warehouse[3]--;

            } else if (choose_animal.equals("2")) {
                if (warehouse[4] == 0) {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("               함께할 공이 없어요!! 다시 선택해주세요 ");
                    continue;

                } else {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("양 v" + sheep + " 마리와 함께 줄넘기를 가지고 놀고있습니다..");
                    goose_happy_2 = 0;
                    goose_happy_2 = sheep_happy + sheep;

                    if (goose_happy_2 > 10) {
                        goose_happy_2 = 10;
                    }
                    System.out.println("양들의 행복지수는 " + sheep_happy + " 에서 " + goose_happy_2 + " 로 올라갔습니다.");
                    sheep_happy = goose_happy_2;

                }
                warehouse[4]--;

            } else if (choose_animal.equals("0")) {
                Sheep();
            } else {
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }

        }
    }

    void Sheep_Shave() {
        int show_money_sheep;
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println("\n" +
                "                                        \n" +
                "                                        \n" +
                "                                        \n" +
                "          `-:/o-``    `./+/-.           \n" +
                "        -oo/--yhso+++ooyd/-:+o/`        \n" +
                "      .oo-    `/oo+++oo+-    `/s/`      \n" +
                "     :y:          ````         .oo.     \n" +
                "    :h:  `+.                ::  `ss`    \n" +
                "    `:o+:.y/               `h/-/o+.     \n" +
                "       .:+yh`              +do/-`       \n" +
                "          `h:             `h:           \n" +
                "           s+             .h.           \n" +
                "          `y:             `h-           \n" +
                "          -h`              +s           \n" +
                "          oo               .d.          \n" +
                "          y/               `h:          \n" +
                "          y/               `y/          \n" +
                "          so:-...``````...-:h:          \n" +
                "          `-::///++++++///:-.           \n" +
                "                                        \n" +
                "                                 ");
        System.out.println("───────────────────────양 모 수 입 점────────────────────────");
        if(sheep_hungry <= 5 && sheep_happy >=5){
            System.out.println("짝짝짝!! 양들의 배고픔지수가 5 이하, 체력지수 5 이상이 되었기에 털을 깎아 팔수있습니다!");
            System.out.println("양털을 깎으시겠습니까? (1 - 예, 아무키 - 돌아가기)");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                Random random = new Random();
                show_money_sheep = random.nextInt(7);

                show_money_sheep +=1;

                if(show_money_sheep>5){
                    System.out.println("양들의 털을 깎았습니다. 양모의 가격이 올라, 양 한마리당 " + show_money_sheep + " 치즈를 받았습니다.");

                }else if (show_money_sheep >= 0 && show_money_sheep<=4){
                    System.out.println("양들의 털을 깎았습니다. 양모의 가격이 평균보다 낮은, 양 한마리당 " + show_money_sheep + " 치즈를 받았습니다.");

                }

                show_money_sheep = show_money_sheep * sheep;

                System.out.println("오늘 양털을 깎아 판 수익금은 총 " + show_money_sheep + " 치즈 입니다.");
                presentmoney += show_money_sheep;
                System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");

                sheep_happy -= 4;
                sheep_hungry +=4;
                System.out.println("               아무키나 눌러주시면 뒤로 갑니다.");
                choose_animal = scan.nextLine();
                Sheep();

            }  else{
                Sheep();    }



        }else{
            System.out.println("아쉽게, 배고픔지수가 5이하, 행복지수 5이상이 안되었기에 털을 깎아 팔 수 없게 되었습니다.. ");
            System.out.println("               아무키나 눌러주시면 뒤로 갑니다.");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            Sheep();
        }















    }














}
