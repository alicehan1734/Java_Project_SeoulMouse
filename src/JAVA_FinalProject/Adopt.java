package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Adopt extends Start{

    public void Adopt() {
        int changenumber;
        int totalamount;
        int animalmany;

        String picktheanimal;
        String backtohome;

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
        System.out.println("─────────────────────────입 양 소──────────────────────────");
        System.out.println(" ┌───────────────────── 분 양 비 용 ───────────────────────┐");
        System.out.println("             1) 거 위            ( 책 임 비 : 25 치즈 )      ");
        System.out.println("             2) 돌 고 래          ( 책 임 비 : 70 치즈 )     ");
        System.out.println("             3) 양               ( 책 임 비 : 50 치즈 )     ");
        System.out.println(" └────────────────────────────────────────────────────────┘");
        System.out.println("──────────────────────── 나 의 동 물 ────────────────────────");
        System.out.println(" ┌────────────────────────────────────────────────────────┐");
        System.out.println("             1) 거 위                   "+goose+" 마리");
        System.out.println("             2) 돌 고 래                 "+dolphin+" 마리");
        System.out.println("             3) 양                      "+sheep+" 마리");
        System.out.println(" └────────────────────────────────────────────────────────┘");
        System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
        System.out.println("");


        while(true){
            System.out.println("함께 할 입양동물을 선택해주세요.(뒤로가기 0) ");
            Scanner scan = new Scanner(System.in);
            picktheanimal = scan.next();

            if(picktheanimal.equals("1") || picktheanimal.equals("2") || picktheanimal.equals("3")){

                System.out.println("몇 마리를 함께 하고 싶으신가요? ");
                animalmany = scan.nextInt();

                changenumber = Integer.parseInt(picktheanimal);
                for (int i = 0; i < 40; i++) {
                    System.out.println("");
                }
                if(changenumber == 1){
                    totalamount = animalmany * 25;
                    if(totalamount <= presentmoney){
                        goose = goose + animalmany;

                        break;

                    }else{
                        System.out.println("               돈이 부족합니다. 다시 선택해주세요.");
                        continue;

                    }

                }
                else if(changenumber ==2){
                    totalamount = animalmany * 70;
                    if(totalamount <= presentmoney){
                        dolphin = dolphin + animalmany;
                        break;

                    }else{
                        System.out.println("               돈이 부족합니다. 다시 선택해주세요.");
                        continue;


                    }
                }
                else if(changenumber ==3){
                    totalamount = animalmany * 50;
                    if(totalamount <= presentmoney){
                        sheep = sheep + animalmany;

                        break;

                    }else{
                        System.out.println("               돈이 부족합니다. 다시 선택해주세요.");
                        continue;


                    }
                }
            }else if(picktheanimal.equals("0")){
                money();
            }
            else {
                System.out.println("               숫자만 입력해주세요.");
                continue;

            }



        }

        presentmoney = presentmoney - totalamount;

        System.out.println(animalmany + " 마리를 입양하셨습니다.");
        System.out.println("총 책임비는 "+ totalamount + " 치즈 입니다.");
        System.out.println("─────────────────────업데이트된 나 의 동 물 ─────────────────────");
        System.out.println(" ┌────────────────────────────────────────────────────────┐");
        System.out.println("             1) 거 위                   "+goose+" 마리");
        System.out.println("             2) 돌 고 래                 "+dolphin+" 마리");
        System.out.println("             3) 양                      "+sheep+" 마리");
        System.out.println(" └────────────────────────────────────────────────────────┘");
        System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
        System.out.println("(뒤로가기 아무키)");

        Scanner scan = new Scanner(System.in);
        backtohome = scan.nextLine();
        if(backtohome.equals("1")){
            money();
        }
        else{
            money();

        }


        }
    }
