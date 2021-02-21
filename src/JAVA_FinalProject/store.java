package JAVA_FinalProject;

import java.util.Scanner;

public class store extends Emart{

    public void store() {

        int storecheck;
        int storemany;

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }


        warehouse_price[0] = 2;
        warehouse_price[1] = 3;
        warehouse_price[2] = 1;
        warehouse_price[3] = 3;
        warehouse_price[4] = 4;
        warehouse_price[5] = 4;
        warehouse_price[6] = 3;
        warehouse_price[7] = 2;


        System.out.println("──────────────────── 상 점 가 격 표 (1개당) ────────────────────");
        System.out.println("               (1) 건초             - " + warehouse_price[0] + " 치즈");
        System.out.println("               (2) 오징어            - " + warehouse_price[1] + " 치즈");
        System.out.println("               (3) 물               - " + warehouse_price[2] + " 치즈");
        System.out.println("               (4) 줄넘기            - " + warehouse_price[3] + " 치즈");
        System.out.println("               (5) 공               - " + warehouse_price[4] + " 치즈");
        System.out.println("               (6) 약               - " + warehouse_price[5] + " 치즈");
        System.out.println("               (7) 물고기            - " + warehouse_price[6] + " 치즈");
        System.out.println("               (8) 훌라후프          - " + warehouse_price[7] + " 치즈");
        System.out.println("──────────────────────── 나 의 창 고 ────────────────────────");
        System.out.println("               (1) 건초             - " + warehouse[0] + "개");
        System.out.println("               (2) 오징어            - " + warehouse[1] + "개");
        System.out.println("               (3) 물               - " + warehouse[2] + "보틀");
        System.out.println("               (4) 줄넘기            - " + warehouse[3] + "개");
        System.out.println("               (5) 공               - " + warehouse[4] + "개");
        System.out.println("               (6) 약               - " + warehouse[5] + "알");
        System.out.println("               (7) 물고기            - " + warehouse[6] + "개");
        System.out.println("               (8) 훌라후프          - " + warehouse[7] + "개");
        System.out.println("────────────────────────────────────────────────────────────");
        System.out.println("========================총 현재 자산 :" + presentmoney + "치즈========================");

        while (true) {
            System.out.println("필요하신 물건을 선택해주세요.(돌아가기 0)");
            Scanner scan = new Scanner(System.in);
            storecheck = scan.nextInt();
            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }
            if (storecheck > 8) {
                System.out.println("해당 번호가 없습니다. 다시 선택해주세요.");
                continue;

            } else if (storecheck <= 8 && storecheck >= 1) {
                System.out.println(storecheck + "번을 선택하셨습니다. 몇 개를 구입하시겠습니까?");
                storemany = scan.nextInt();

                storecheck--;
                int i = warehouse_price[storecheck];
                int z = storemany;

                if (i * z > presentmoney) {
                    System.out.println("현재있는 돈은 " + presentmoney + " 치즈 이며, 사시려고 하는 금액은 " + i * z + " 치즈 이므로 초과됩니다.");
                    continue;
                } else if (i * z <= presentmoney) {
                    System.out.println("띠링--! 구입되었습니다. 가격은 " + i + " 치즈, " + z + " 개를 구입하여, 총 " + i * z + " 치즈가 나왔습니다.");

                    warehouse[storecheck] = warehouse[storecheck] + z;
                    presentmoney = presentmoney - (i * z);

                    System.out.println("──────────────────── 업데이트된 나 의 창 고 ────────────────────");
                    System.out.println("               (1) 건초             - " + warehouse[0] + "개 (" + warehouse_price[0] + " 치즈)");
                    System.out.println("               (2) 오징어            - " + warehouse[1] + "개 (" + warehouse_price[1] + " 치즈)");
                    System.out.println("               (3) 물               - " + warehouse[2] + "보틀 (" + warehouse_price[2] + " 치즈)");
                    System.out.println("               (4) 줄넘기            - " + warehouse[3] + "개 (" + warehouse_price[3] + " 치즈)");
                    System.out.println("               (5) 공               - " + warehouse[4] + "개 (" + warehouse_price[4] + " 치즈)");
                    System.out.println("               (6) 약               - " + warehouse[5] + "알 (" + warehouse_price[5] + " 치즈)");
                    System.out.println("               (7) 물고기            - " + warehouse[6] + "개 (" + warehouse_price[6] + " 치즈)");
                    System.out.println("               (8) 훌라후프          - " + warehouse[7] + "개 (" + warehouse_price[7] + " 치즈)");
                    System.out.println("────────────────────────────────────────────────────────────");
                    System.out.println("========================총 현재 자산 :" + presentmoney + "치즈========================");
                    continue;

                }

            } else if (storecheck == 0) {
                Emart();
            }
        }
    }}
