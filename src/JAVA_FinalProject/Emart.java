package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Emart extends Start{
String whichone;

    public void Emart() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println("────────────────────1) 병 원────────────────────────");
        System.out.println("────────────────────2) 상 점────────────────────────");
        System.out.println("상가에 있는 병원 과 상점 중 어디를 가시겠습니까?(돌아가기 0) ");

        while (true) {
            Scanner scan = new Scanner(System.in);
            whichone = scan.nextLine();

            if (whichone.equals("1")) {
                hospital start = new hospital();
                start.hospital();

            } else if (whichone.equals("2")) {
                store start = new store();
                start.store();

            } else if (whichone.equals("0")) {
                money();

            } else {
                System.out.println("               숫자만 입력해주세요.");

                continue;
            }
        }
    }




}
