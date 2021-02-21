package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Goose extends farm{

    public void Goose() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        Music_sub introMusic_duck = new Music_sub("거위.mp3", false);
        introMusic_duck.start();

        if(goose_hungry>10){
            goose_hungry = 10;
        }
        if(goose_happy<0){
            goose_happy = 0;
        }
        System.out.println("                                 ◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("                                          □ 목 표 금 액 : "+ money +" 치즈");
        System.out.println("                                          □ 현 재 금 액 : "+ presentmoney +" 치즈");
        System.out.println("                                          ■ 목  표  치  : "+ String.format("%.1f",percentage*100) +" %");
        System.out.println("                                          ■ 타 임 라 인 : D - "+ (10-bar)+" 일" );
        System.out.println("                               ──────────────────────────────────────────────────────");
        System.out.println("───────────────거위 농장───────────────────────────────기록 사항─────────────────────────────────────────────TIP────────────────────────────");
        System.out.println("                                 \n" +
                "         /yo.                 \n" +
                "       .:oo./o/.`             \n" +
                "       /y:/.``./+++/-`        \n" +
                "      :o+.`````````.:++.      \n" +
                "    `o/```````````````.o+`    \n" +
                "   `y-``````````````````:y`   \n" +
                "   s/````.-`````````-.```/o                ■ 거위        : " + goose + " 마리" + "               ① 배고픔 지수(숫자(최대 10)가 높을수록 배고파요. (건초, 오징어, 물을 주세요!)\n" +
                " `o/````...`````````..````+o`              ■ 알의 수     : " + goose_egg + " 알" + "                 ② 행복 지수(숫자(최대 10)가 높을수록 행복해요. (약 혹은 줄넘기와 공을 가지고 놀게 해주세요!)\n" +
                "`y:```.oy//````````/y+/.```/s`             ■ 배고픔 지수  : " + goose_hungry + "" + "                  ③ \033[21m배고픔 3 이하 와 행복 6 이상이 되면 알을 낳습니다.\033[0m\n" +
                "s/````:mdoh`.-::-.`dmsh:````++             ■ 행복 지수    : " + goose_happy + "\n" +
                "d`````.:/:.-/+//+/..//:.`````d\n" +
                "y-``./+:``-////////-``:+/.``.h\n" +
                ".s:``.```.+oo////oo+.```.``.s-\n" +
                " `:o+-````./+oooo+/.````-/++. \n" +
                "    `-/++:``..--..``/o+/:.    \n" +
                "         -/+++++++++-    ");

        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");

        System.out.println("=========================================================================================================================================");
        System.out.println("                                                (1) 사료(약)주기");
        System.out.println("                                                (2) 놀아주기");
        System.out.println("                                                (3) 알 확인하러가기");
        System.out.println("                                                (4) 알 팔러가기");
        System.out.println("=========================================================================================================================================");
        System.out.println("번호를 선택해주세요.(뒤로가기 0) ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                Goose_egg();

            } else if (choose_animal.equals("2")) {
                Goose_running();

            } else if (choose_animal.equals("3")) {
                Goose_checkegg();

            } else if (choose_animal.equals("4")) {
                Goose_sales();

            } else if (choose_animal.equals("0")) {
                farm();

            } else {

                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }


    }

    void Goose_egg() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        while (true) {
            System.out.println("========================거위의 상황========================");
            System.out.println("                ■ 배고픔 지수  : " + goose_hungry);
            System.out.println("                ■ 행복 지수    : " + goose_happy);
            System.out.println("==========================================================");
            System.out.println("─────────────────────────현재 창고─────────────────────────");
            System.out.println("               (1) 건초    - " + warehouse[0] + "개 (배고픔 지수 ↓)");
            System.out.println("               (2) 오징어  - " + warehouse[1] + "개 (배고픔 지수 ↓)");
            System.out.println("               (3) 물     - " + warehouse[2] + "보틀 (배고픔 지수 ↓)");
            System.out.println("               (4) 줄넘기  - " + warehouse[3] + "개 (행복 지수 ↑)");
            System.out.println("               (5) 공     - " + warehouse[4] + "개 (행복 지수 ↑)");
            System.out.println("               (6) 약     - " + warehouse[5] + "알 (행복 지수 ↑)");
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
                        System.out.println("거위" + goose + " 마리에게 건초 " + many + " 개 를 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) goose) * 10;
                        goose_hungry_2 = goose_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("거위들의 배고픔지수는 " + goose_hungry + " 에서 " + (int) goose_hungry_2 + " 로 내려갔습니다.");
                        goose_hungry = (int) goose_hungry_2;
                        System.out.println("========================================================");
                        break;

                    } else {
                        System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                        break;
                    }
                }


            } else if (choose_animal.equals("2")) {                                        //오징어

                while (true) {
                    System.out.println("오징어 몇개를 선택하시겠습니까?:");
                    int many = scan.nextInt();
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    if (many <= warehouse[1]) {
                        warehouse[1] = warehouse[1] - many;
                        System.out.println("거위 " + goose + " 마리에게 오징어 " + many + " 개 를 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) goose) * 10;
                        goose_hungry_2 = goose_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("거위들의 배고픔지수는 " + goose_hungry + " 에서 " + (int) goose_hungry_2 + " 로 내려갔습니다.");
                        goose_hungry = (int) goose_hungry_2;
                        System.out.println("========================================================");
                        break;

                    } else {
                        System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                        break;
                    }
                }

            } else if (choose_animal.equals("3")) {                                        //물

                while (true) {
                    System.out.println("물 몇보틀을 선택하시겠습니까?:");
                    int many = scan.nextInt();
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    if (many <= warehouse[2]) {
                        warehouse[2] = warehouse[2] - many;
                        System.out.println("거위 " + goose + " 마리에게 물을 " + many + " 보틀 를 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) goose) * 5;
                        goose_hungry_2 = goose_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("거위들의 배고픔지수는 " + goose_hungry + " 에서 " + (int) goose_hungry_2 + " 로 내려갔습니다.");
                        goose_hungry = (int) goose_hungry_2;
                        System.out.println("========================================================");
                        break;

                    } else {
                        System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                        break;
                    }
                }

            } else if (choose_animal.equals("6")) {
                if (goose_happy >= 10) {
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
                            System.out.println("거위 " + goose + " 마리에게 약 " + many + " 알 을 나누어주었습니다!");
                            goose_happy_2 = 0;
                            goose_happy_2 += ((float) many / (float) goose) * 5;
                            goose_happy_2 = goose_happy + goose_happy_2;
                            if (goose_happy_2 > 10) {
                                goose_happy_2 = 10;
                            }
                            System.out.println("거위들의 행복지수는 " + goose_happy + " 에서 " + (int) goose_happy_2 + " 로 올라갔습니다.");
                            goose_happy = (int) goose_happy_2;
                            System.out.println("========================================================");
                            break;

                        } else {
                            System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                            break;
                        }
                    }
                }
            } else if (choose_animal.equals("4") || choose_animal.equals("5")) {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                System.out.println("               줄넘기와 공은 먹는게 아닙니다!! 산책하기란에 선택해주세요.");

                continue;

            } else if (choose_animal.equals("0")) {
                Goose();
            } else {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }


    }

    void Goose_running() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        while (true) {
            System.out.println("========================거위의 상황========================");
            System.out.println("                ■ 배고픔 지수  : " + goose_hungry);
            System.out.println("                ■ 행복 지수    : " + goose_happy);
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
                    System.out.println("거위 " + goose + " 마리와 함께 줄넘기를 가지고 놀고있습니다..");
                    goose_happy_2 = 0;
                    goose_happy_2 = goose_happy + goose;

                    if (goose_happy_2 > 10) {
                        goose_happy_2 = 10;
                    }
                    System.out.println("거위들의 행복지수는 " + goose_happy + " 에서 " + goose_happy_2 + " 로 올라갔습니다.");
                    goose_happy = goose_happy_2;

                }
                warehouse[3]--;

            } else if (choose_animal.equals("2")) {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                if (warehouse[4] == 0) {
                    System.out.println("               함께할 공이 없어요!! 다시 선택해주세요 ");
                    continue;

                } else {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("거위 " + goose + " 마리와 함께 공을 가지고 놀고있습니다..");
                    goose_happy_2 = 0;
                    goose_happy_2 = goose_happy + goose;

                    if (goose_happy_2 > 10) {
                        goose_happy_2 = 10;
                    }
                    System.out.println("거위들의 행복지수는 " + goose_happy + " 에서 " + goose_happy_2 + " 로 올라갔습니다.");
                    goose_happy = goose_happy_2;

                }
                warehouse[4]--;

            } else if (choose_animal.equals("0")) {
                Goose();
            } else {
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }

        }
    }


    void Goose_checkegg() {
        int eggcount;

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        if (goose_hungry <= 3 && goose_happy >= 6) {
            System.out.println(" \n" +
                    "         ./ymNMMMmy+.         \n" +
                    "       :yNMMMMMMMNMMMh:       \n" +
                    "     -yNMMMMMmhyyyyhdmNd:     \n" +
                    "   `omNNMMMNysssyyyyyyydNy`   \n" +
                    "  .ymNNNMMMyoosssssssssshMd-  \n" +
                    " .ydmmNNMMMyooooossssssssdMm- \n" +
                    "`ydddmNNNMMNyooooooooooosmMMd`\n" +
                    "/hhysshmNNMMMmhssoooooshNMMMMo\n" +
                    "yh+:://+hNNNMMMMNNmmmNMMMMMMMm\n" +
                    "ds-:::://dNNNNNMMMMMMMMMMMMMNN\n" +
                    "ds---::::hmmNNNNNNNNNMNdysosdm\n" +
                    "sh/----:/hddmmmmNNNNds+//////s\n" +
                    ".hhs+/+oyhhhdddmmmdo/::::::::.\n" +
                    " -hddhhhhhhhhhdddh/:::::::-:. \n" +
                    "  `odddddhhhhhhhh/-------::`  \n" +
                    "    `+yddddddhhhh+---::/:`    \n" +
                    "       .:oyhdddddds+/:`     ");
            System.out.println("========================================================");

            Random random = new Random();
            eggcount = random.nextInt(3);
            eggcount ++;
            eggcount = eggcount * goose;


            System.out.println("               짝짝짝!!! 거위가 알을 낳았습니다.");
            System.out.println("               확인하시겠습니까?(예 - 1 , 돌아가기 - 아무키)");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();

            if (choose_animal.equals("1")) {
                System.out.println("               확인해보니 총" + eggcount + "개를 낳았습니다.");
                System.out.print("                 총" + goose_egg + "에서");
                goose_egg += eggcount;
                System.out.println(goose_egg + "개가 되었습니다");

                goose_hungry += 3;
                goose_happy -= 3;

                System.out.println("               알을 파시면 치즈로 바꿀수있습니다.");
                System.out.println("               어떻게 하시겠습니까?(팔러가기 - 1 , 돌아가기 - 아무키)");
                choose_animal = scan.nextLine();
                if (choose_animal.equals("1")) {
                    Goose_sales();
                }else{
                    Goose();
                }

            } else {
                Goose();
            }

        } else {
            System.out.println("               확인해보니, 거위들이 알을 안낳았습니다.");
            System.out.println("               돌아가시겠습니까?(팔러가기 - 1, 돌아가기 - 아무키)");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                Goose_sales();
            }else{
                Goose();

            }
        }


    }

    void Goose_sales() {

        int manyeggs;
        String chooseeggs;

        int real_sale_egg;
        int total_sale_egg;

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println("   ----:------::------:----             \n" +
                "            --`/-o-:  -::::-  :-o-/`--            \n" +
                "           .: ::-o-o  +-//-+  o-o-:: :.           \n" +
                "          .:  ---/-:  :-::-:  /-/---  :.          \n" +
                "          /::----.--------------.----::/          \n" +
                "           .-       ``````````       -.           \n" +
                "           .-     :-o.o-++-o.o-:     -.           \n" +
                "           .-    /`:.-.-..-.-.:`/    -.           \n" +
                "           .-   .:/:-:-:--:-:-:/:.   -.           \n" +
                "           .-    .:    `++`    :.    -.           \n" +
                "           .-    .-  `:+--+:`  -.    -.           \n" +
                "           .-    .-  :`    `:  -.    -.           \n" +
                "           .-    .-  `------`  :.    -.           \n" +
                "          ::/----:/------------/:----/::          \n" +
                "          +----------------------------+          ");
        System.out.println("───────────────────────도 축 장────────────────────────");

        Random random = new Random();


        manyeggs = random.nextInt(8);
        manyeggs+=1;

        System.out.println(" ┌────────────────────────────────────────────────────────┐");
        System.out.println(" │                                                        │");
        System.out.println(" │   오늘의 시세 :"+manyeggs+"치즈 (알하나당)"+"                            │");
        System.out.println(" │                   현재 가지고 있는 알의 수: "+goose_egg+" 알           │");
        System.out.println(" └────────────────────────────────────────────────────────┘");

        System.out.println("               어떻게 하시겠습니까? (팔기 - 1, 안팔고 되돌아가기 - 아무키)");
        Scanner scan = new Scanner(System.in);
        chooseeggs = scan.nextLine();

        if (chooseeggs.equals("1")) {
            while(true){
                System.out.println("               몇개를 파시겠습니까?(안팔고 되돌아가기 - 0)");

                real_sale_egg = scan.nextInt();

                if(real_sale_egg == 0){
                    Goose();

                }else {
                    if (real_sale_egg <= goose_egg) {
                        System.out.println("========================================================");
                        System.out.println("거위 알 "+"총 "+real_sale_egg+"알 을 "+" 하나당 "+manyeggs+"치즈로 팔았습니다!!");
                        total_sale_egg = real_sale_egg*manyeggs;

                        System.out.println("               총 "+total_sale_egg+"치즈의 수익금을 얻었습니다." );
                        goose_egg -= real_sale_egg;
                        presentmoney += total_sale_egg;
                        System.out.println("========================총 현재 자산 :"+presentmoney+"치즈========================");
                        continue;
                    } else {
                        System.out.println("               수가 맞지않습니다.");

                        continue;
                    }


                }
            }

        }
        else{
            Goose();

        }

    }
}
