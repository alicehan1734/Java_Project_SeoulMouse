package JAVA_FinalProject;

import java.util.Scanner;

public class hospital extends Emart {

    public void hospital(){
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.println("\n" +
                "                                        \n" +
                "              `::::::::::`              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "  .+++++++++++ohhhhhhhhhho+++++++++++`  \n" +
                "  -hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh`  \n" +
                "  -hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh`  \n" +
                "  -hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh`  \n" +
                "  -hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh`  \n" +
                "  `///////////+hhhhhhhhhh+///////////`  \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              .hhhhhhhhhh.              \n" +
                "              `----------`              \n" +
                "                                   ");
        System.out.println("────────────────────────────TIP────────────────────────────");
        System.out.println("① 병원에 진찰받는 동물(들)은 배고픔 = 0 / 행복,체력 = 10 이 됩니다. ");
        System.out.println("");
        System.out.println("────────────────────────────병 원────────────────────────────");
        System.out.println("1) 거 위 / "+goose+"마리 / 배고픔 : "+goose_hungry+" / 행복 : "+goose_happy);
        System.out.println("2) 돌고래 / "+dolphin+"마리 / 배고픔 : "+dolphin_hungry+" / 체력 : "+dolphin_power);
        System.out.println("3)   양  / "+sheep+"마리 / 배고픔 : "+sheep_hungry+" / 체력 : "+sheep_happy);
        System.out.println("");
        System.out.println("==진찰 비용 - 동물 한마리당 15 치즈 소요 ( 마리수에 관계없이 선택한 종류의 모든 동물수가 치료를 받습니다.)==");
        System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");


        System.out.println("");
        System.out.println("진찰보낼 동물을 선택해주세요(뒤로가기 0) ");


        while (true) {
            Scanner scan = new Scanner(System.in);
            whichone = scan.nextLine();
            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }

            if (whichone.equals("1")) {

                if(goose*15>presentmoney){
                    System.out.println("               돈이 부족합니다.(뒤로가기 아무키)");
                    whichone = scan.nextLine();
                    hospital();
                }else {
                    System.out.println("치료가 정상적으로 되었습니다.");

                    goose_hungry = 0;
                    goose_happy = 10;
                    System.out.println("거위 "+goose+"마리를 치료하였기에 한마리당 15치즈로, 요금은 총 "+goose*15+" 치즈가 나왔습니다");
                    presentmoney = presentmoney - 15*goose;
                    System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                    System.out.println("결과) 거 위 / "+goose+"마리 / 배고픔 : "+goose_hungry+" / 행복 : "+goose_happy);
                    System.out.println("(뒤로가기 아무키)");
                    whichone = scan.nextLine();
                    hospital();

                }


            } else if (whichone.equals("2")) {
                if(dolphin*15>presentmoney){
                    System.out.println("               돈이 부족합니다.(뒤로가기 아무키)");
                    whichone = scan.nextLine();
                    hospital();
                }else {
                    System.out.println("치료가 정상적으로 되었습니다.");

                    dolphin_hungry = 0;
                    dolphin_power = 10;
                    System.out.println("돌고래 "+dolphin+"마리를 치료하였기에 한마리당 15치즈로, 요금은 총 "+dolphin*15+" 치즈가 나왔습니다");
                    presentmoney = presentmoney - 15*dolphin;
                    System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                    System.out.println("결과) 돌고래 / "+dolphin+"마리 / 배고픔 : "+dolphin_hungry+" / 체력 : "+dolphin_power);
                    System.out.println("(뒤로가기 아무키)");
                    whichone = scan.nextLine();
                    hospital();

                }
            } else if (whichone.equals("3")) {
                if(sheep*15>presentmoney){
                    System.out.println("               돈이 부족합니다.(뒤로가기 아무키)");
                    whichone = scan.nextLine();
                    hospital();
                }else {
                    System.out.println("치료가 정상적으로 되었습니다.");

                    sheep_hungry = 0;
                    sheep_happy = 10;
                    System.out.println("양 "+sheep+"마리를 치료하였기에 한마리당 15치즈로, 요금은 총 "+sheep*15+" 치즈가 나왔습니다");
                    presentmoney = presentmoney - 15*sheep;
                    System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                    System.out.println("결과)   양  / "+sheep+"마리 / 배고픔 : "+sheep_hungry+" / 체력 : "+sheep_happy);
                    System.out.println("(뒤로가기 아무키)");
                    whichone = scan.nextLine();
                    hospital();

                }
            } else if (whichone.equals("0")) {
                Emart();

            } else {
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }



    }

}
