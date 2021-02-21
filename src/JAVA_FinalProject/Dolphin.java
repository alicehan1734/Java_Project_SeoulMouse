package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Dolphin extends farm{



    public void Dolphin() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        if(dolphin_hungry>10){
            dolphin_hungry = 10;
        }
        if(dolphin_power<0){
            dolphin_power = 0;
        }
        System.out.println("                                 ◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("                                          □ 목 표 금 액 : "+ money +" 치즈");
        System.out.println("                                          □ 현 재 금 액 : "+ presentmoney +" 치즈");
        System.out.println("                                          ■ 목  표  치  : "+ String.format("%.1f",percentage*100) +" %");
        System.out.println("                                          ■ 타 임 라 인 : D - "+ (10-bar)+" 일" );
        System.out.println("                               ──────────────────────────────────────────────────────");
        System.out.println("───────────────돌고래 수족관───────────────────────────────기록 사항─────────────────────────────────────────────TIP────────────────────────────");
        System.out.println(
                "\n                    `.-://::--`         \n" +
                        "        ::`       ./////////////-       \n" +
                        "       .///     `/////////////////.     \n" +
                        "       ///+     //////////////////+`    \n" +
                        "      -///+    ://////////////oo////          ■ 돌고래         : " + dolphin + " 마리" +"               ① 배고픔 지수(숫자(최대 10)가 높을수록 배고파요. (물고기, 오징어를 주세요!)\n" +
                        "     -////+-  -//////////////hmdd///          ■ 배고픔 지수     : " + dolphin_hungry + "                   ② 체력(숫자(최대 10)이 높을수록 튼튼해요. (약 혹은 훌라후프와 공을 가지고 체력을 키우게 해주세요!)\n" +
                        "   .///////////////////////:-:++///+          ■ 체력 지수      : " + dolphin_power + "                    ③ \033[21m배고픔 4 이하 와 체력 7 이상이 되면 공연을 할 수 있습니다.\033[0m\n" +
                        "  ://///:-:////////////////:-`  `-/-     \n" +
                        " -+/:-.    `-//:///+//////:    `--      \n" +
                        "              `...--+////+```...        \n" +
                        "                    `::::...`         ");

        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("=========================================================================================================================================");
        System.out.println("                                                (1) 사료(약)주기");
        System.out.println("                                                (2) 체력 키우기 및 공연연습 하기");
        System.out.println("                                                (3) 공연 하러가기");
        System.out.println("=========================================================================================================================================");
        System.out.println("번호를 선택해주세요.(뒤로가기 0) ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                Dolphin_feed();

            } else if (choose_animal.equals("2")) {
                Dolphin_power();

            } else if (choose_animal.equals("3")) {
                Dolphin_show();

            } else if (choose_animal.equals("0")) {
                farm();

            } else {

                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }


    }

    void Dolphin_feed(){
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }


        while (true) {
            System.out.println("========================돌고래의 상황========================");
            System.out.println("                ■ 배고픔 지수  : " + dolphin_hungry);
            System.out.println("                ■ 체력 지수    : " + dolphin_power);
            System.out.println("==========================================================");
            System.out.println("─────────────────────────현재 창고─────────────────────────");
            System.out.println("               (1) 물고기    - " + warehouse[6] + "개 (배고픔 지수 ↓)");
            System.out.println("               (2) 오징어  - " + warehouse[1] + "개 (배고픔 지수 ↓)");
            System.out.println("               (3) 훌라후프  - " + warehouse[7] + "개 (체력 지수 ↑)");
            System.out.println("               (4) 공     - " + warehouse[4] + "개 (체력 지수 ↑)");
            System.out.println("               (5) 약     - " + warehouse[5] + "알 (체력 지수 ↑)");
            System.out.println("─────────────────────────────────────────────────────────");

            System.out.println("               번호를 선택해주세요.(뒤로가기 0) ");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();


            if (choose_animal.equals("1")) {                                        //건초

                while (true) {
                    System.out.println("물고기 몇개를 선택하시겠습니까?:");
                    int many = scan.nextInt();
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    if (many <= warehouse[6]) {
                        warehouse[6] = warehouse[6] - many;
                        System.out.println("돌고래" + dolphin + "마리에게 물고기" + many + "개 를 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) dolphin) * 10;
                        goose_hungry_2 = dolphin_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("돌고래들의 배고픔지수는" + dolphin_hungry + "에서" + (int) goose_hungry_2 + "로 내려갔습니다.");
                        dolphin_hungry = (int) goose_hungry_2;
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
                        System.out.println("돌고래" + dolphin + "마리에게 오징어" + many + "개 를 나누어주었습니다!");
                        goose_hungry_2 = 0;
                        goose_hungry_2 += ((float) many / (float) dolphin) * 10;
                        goose_hungry_2 = dolphin_hungry - goose_hungry_2;
                        if (goose_hungry_2 < 0) {
                            goose_hungry_2 = 0;
                        }
                        System.out.println("돌고래들의 배고픔지수는" + dolphin_hungry + "에서" + (int) goose_hungry_2 + "로 내려갔습니다.");
                        dolphin_hungry = (int) goose_hungry_2;
                        System.out.println("========================================================");
                        break;

                    } else {
                        System.out.println("수가 맞지않습니다. 다시 선택해주세요");
                        break;
                    }
                }

            } else if (choose_animal.equals("5")) {
                if (dolphin_power >= 10) {
                    System.out.println("약이 필요하지 않습니다. 체력지수가 최대치입니다.");

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
                            System.out.println("돌고래" + dolphin + "마리에게 약" + many + "알 을 나누어주었습니다!");
                            goose_happy_2 = 0;
                            goose_happy_2 += ((float) many / (float) dolphin) * 5;
                            goose_happy_2 = dolphin_power + goose_happy_2;
                            if (goose_happy_2 > 10) {
                                goose_happy_2 = 10;
                            }
                            System.out.println("돌고래들의 체력지수는" + dolphin_power + "에서" + (int) goose_happy_2 + "로 올라갔습니다.");
                            dolphin_power = (int) goose_happy_2;
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
                System.out.println("               훌라후프와 공은 먹는게 아닙니다!! 체력 키우기 및 공연연습 하기 란에 선택해주세요.");

                continue;

            } else if (choose_animal.equals("0")) {
                Dolphin();
            } else {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }


    }

    void Dolphin_power(){
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        while (true) {
            System.out.println("========================돌고래의 상황========================");
            System.out.println("                ■ 배고픔 지수  : " + dolphin_hungry);
            System.out.println("                ■ 체력 지수    : " + dolphin_power);
            System.out.println("==========================================================");
            System.out.println("────────────────────────────────────────────────────────");
            System.out.println("               (1) 훌라후프  - " + warehouse[7] + "개 (체력 지수 ↑)");
            System.out.println("               (2) 공     - " + warehouse[4] + "개 (체력 지수 ↑)");
            System.out.println("────────────────────────────────────────────────────────");

            System.out.println("               어떤걸 가지고 노시겠습니까? 번호를 선택해주세요.(뒤로가기 0) ");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {
                if (warehouse[7] == 0) {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("               함께할 훌라후프가 없어요!! 다시 선택해주세요 ");
                    continue;

                } else {
                    for (int i = 0; i < 40; i++) {
                        System.out.println("");
                    }
                    System.out.println("돌고래" + dolphin + "마리와 함께 훌라후프를 가지고 공연 연습을 하고 있습니다..");
                    goose_happy_2 = 0;
                    goose_happy_2 = dolphin_power + dolphin;

                    if (goose_happy_2 > 10) {
                        goose_happy_2 = 10;
                    }
                    System.out.println("돌고래들의 체력지수는" + dolphin_power + "에서" + goose_happy_2 + "로 올라갔습니다.");
                    dolphin_power = goose_happy_2;

                }
                warehouse[7]--;

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
                    System.out.println("돌고래" + dolphin + "마리와 함께 공을 가지고 공연 연습을 하고 있습니다..");
                    goose_happy_2 = 0;
                    goose_happy_2 = dolphin_power + dolphin;

                    if (goose_happy_2 > 10) {
                        goose_happy_2 = 10;
                    }
                    System.out.println("돌고래들의 체력지수는" + dolphin_power + "에서" + goose_happy_2 + "로 올라갔습니다.");
                    dolphin_power = goose_happy_2;

                }
                warehouse[4]--;

            } else if (choose_animal.equals("0")) {
                Dolphin();
            } else {
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }

        }

    }

    void Dolphin_show(){

        int show_money;
        int dolphin_power_2;

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println(" \n" +
                "              ```     ``                \n" +
                "             ```........``              \n" +
                "       .+yhdmNNNNNNNNNNNNNNmdyo:        \n" +
                "       /NMMMMMMMNNNNNNNMMMMMMMMh`       \n" +
                "        yMMMMMMMMMNNNMMMMMMMMMN-       `\n" +
                "        -NMMMMNNNNNNNNNNNNMMMMy        `\n" +
                "        `hMMMNNNNNNNNNNNNNMMMM:         \n" +
                "         oMMMMMMMMMNNMMMMMMMMm`         \n" +
                "         /MMMMMMMMMMMMMMMMMMMd          \n" +
                "         -mNNMMMMMMMMMMMMMMNNy          \n" +
                "         -+++osssyyyyyyssoo++/          \n" +
                "   ./oyhhmmhyysssoooosssssyhdmdhys+:`   \n" +
                "  sMMMMMMMMMMMMMMMNNNMMMMMMMMMMMMMMMm.  \n" +
                "  -hNMMMMMNNNNMNNNNNNNNMMNNNNMMMMMMmo`  \n" +
                "    `:oydNNMMMNNNNNNNNNNNNNMNNmhs     \n" +
                "          `-:/+ooooooooo+/:-.`          \n" +
                "              ````   `````             ");
        System.out.println("───────────────────────서 커 스 장────────────────────────");

        if (dolphin_hungry <= 4 && dolphin_power >= 7){
            System.out.println("짝짝짝!! 돌고래들의 배고픔지수가 4이하, 체력지수 7이상이 되었기에 공연을 할 수 있습니다!");
            System.out.println("공연을 하시겠습니까? (1 - 예, 아무키 - 돌아가기)");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            if (choose_animal.equals("1")) {

                Random random = new Random();
                show_money = random.nextInt(18);
                dolphin_power_2 = show_money * dolphin;

                if (show_money > 15) {
                    System.out.println("대단해요!! 돌고래들이 완벽한 합동 공연을 한 결과 돌고래 한 마리당 " + show_money + " 치즈를 받았어요.");


                }
                else if (show_money >= 10 && show_money<=15) {
                    System.out.println("평소대로한 공연으로 돌고래 한 마리당 " + show_money + " 치즈를 받았어요.");

                } else if (show_money == 0) {
                    System.out.println("돌고래들의 잦은 실수공연으로 손님들의 환불요청이 심해 오늘의 수익금은 없습니다.. ");

                } else if (show_money>=1 && show_money <10){
                    System.out.println("오늘 돌고래들의 컨디션이 안좋은가 보네요,, 예상보다 적은 수익금 입니다. 돌고래 한 마리당 " + show_money + " 치즈를 받았어요.");

                }
                System.out.println("오늘 공연 수익금은 " + dolphin_power_2 + " 치즈 입니다.");
                presentmoney += dolphin_power_2;
                System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                dolphin_hungry += 4;
                dolphin_power -= 4;
                System.out.println("               아무키나 눌러주시면 뒤로 갑니다.");
                choose_animal = scan.nextLine();
                Dolphin();


            }
            else{
                Dolphin();
            }


        }else{
            System.out.println("아쉽게, 배고픔지수가 4이하, 체력지수 7이상이 안되었기에 공연을 할 수가 없게되었습니다.. ");
            System.out.println("               아무키나 눌러주시면 뒤로 갑니다.");
            Scanner scan = new Scanner(System.in);
            choose_animal = scan.nextLine();
            Dolphin();
        }


    }

}
