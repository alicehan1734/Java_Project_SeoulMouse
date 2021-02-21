package JAVA_FinalProject;

import java.util.Scanner;

public class Bank extends Start{
    public static  int bar_day;
    public static  int bar_day_2;
    public static  int money;
    public static  int day;
    public static  int percentage;

    public void Bank() {
        String checkstatus;

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println("      88     888888b.         d8888 888b    888 888    d8P  \n" +
                " .d88888b.  888  \"88b       d88888 8888b   888 888   d8P   \n" +
                "d88P 88\"88b 888  .88P      d88P888 88888b  888 888  d8P    \n" +
                "Y88b.88     8888888K.     d88P 888 888Y88b 888 888d88K     \n" +
                " \"Y88888b.  888  \"Y88b   d88P  888 888 Y88b888 8888888b    \n" +
                "     88\"88b 888    888  d88P   888 888  Y88888 888  Y88b   \n" +
                "Y88b 88.88P 888   d88P d8888888888 888   Y8888 888   Y88b  \n" +
                " \"Y88888P\"  8888888P\" d88P     888 888    Y888 888    Y88b \n" +
                "     88                                                    \n" +
                "                                                           \n" +
                "                                                           ");
        System.out.println("직원 : 어서오세요. 고객님 ^^ 낭낭은행입니다. 무엇을 도와드릴까요?");
        System.out.println("1. 적금 상담 2. 적금 만기 신청 / 뒤로가기 '0번'");
        Scanner scan = new Scanner(System.in);
        checkstatus = scan.nextLine();

        if(checkstatus.equals("1")){      //적금
            Savings saving = new Savings();
            saving.Savings();
        }else if(checkstatus.equals("2")){      //적금 또는 투자 상품 해지 신청

        Expiration_service expire = new Expiration_service();
        expire.Expiration_service();

        }
        else if(checkstatus.equals("0")){      //뒤로가기
        Start start = new Start();
        start.money();

        }else{
            Bank();
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

    class Savings extends Bank {

        int day_money;
        String saving;
        LoadingBar t = new LoadingBar();



        public void Savings(){
            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }

        String message = "직원 : 네, 고객님께서 현 자산상태를 확인하기위해 개인 정보를 확인하도록 하겠습니다. 동의 하시겠습니까? \n나 : 네!! 확인해주세요!\n직원 : 네 고객님, 현재 고객님께서 저희 은행에서 이용하실 수 있는 적금상품은 이와같습니다.\n";

        slowPrint(message, 50);
        System.out.println("───────────────────────────────────── 적 금 상 품 ─────────────────────────────────────                                 ◈◈◈◈◈◈◈◈◈◈◈◈ 나 의 상 황 ◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("               (1)                (2)                (3)                                                                              □ 현 재 금 액 : "+ Start.presentmoney +" 치즈");
        System.out.println("             빵빵 적금           힘내자 적금          일꾼 적금  ");
        System.out.println(" 가입기간 :     3일                 5일                2일                                                                              ■ 목  표  치  : "+ String.format("%.1f",Start.percentage*100) +" %");
        System.out.println(" 가입금액 :  일 200치즈(최대)    일 100치즈(최대)     일 300치즈(최대)");
        System.out.println(" 금리 :        30%                 50%                 70%  ");
        System.out.println(" 조건 :     누구나 신청가능      목표치: 50%이상      목표치: 20% 이하                                                                     ■ 타 임 라 인 : D - "+ (10-Start.bar)+" 일" );
        System.out.println("");
        String message_1 = " ※ 가입기간,가입금액은 자동(계산 및 이체)되며, 이 사항을 지키지 않을시 해당 금리혜택은\n   무효가 됨을 알려드립니다. \n ※ 모든 적금 상품의 공통조건은 현 자금이 선택하신 최대 가입금액이상 있으셔야 가입 가능합니다.  \n ※ 해당 조건의 목표치는 현시점을 얘기합니다.\n ※ 적금은 동시에 두개 이상 가입이 안됩니다. \n";
        slowPrint(message_1, 50);
            System.out.println("");
        System.out.println("──────────────────────────────────────────────────────────────────────────────────────                                 ──────────────────────────────────────────────────────");

        System.out.println("직원 : 고객님~ 조건들을 잘 확인해주시고 선택하신 상품 번호를 알려주세요 ^^ (뒤로가기 0)");
        Scanner scan = new Scanner(System.in);
        saving = scan.nextLine();

        if(saving.equals("1")){
            System.out.println("직원 : 네- 1번 빵빵 적금을 선택하셨군요 ! 해당 조건을 확인하겠습니다. 잠시만 기다려주세요.");

            t.run();

            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }
            if(Start.presentmoney>=200){
                System.out.println("해당 조건이 맞습니다. 가입금액은 일 몇 치즈로 할 예정인가요?(최대 200치즈)");
                day_money = scan.nextInt();
                if(day_money<=200){
                    method(day_money,3,30);

                }else{

                    System.out.println("해당조건이 맞지 않습니다. 자동으로 돌아가겠습니다.");

                    t.run();
                    Savings();
                }

            }else{
                System.out.println("해당조건이 맞지 않습니다. 자동으로 돌아가겠습니다.");

                t.run();
                Savings();
            }


        }else if(saving.equals("2")){
            System.out.println("직원 : 네- 2번 힘내자 적금을 선택하셨군요 ! 해당 조건을 확인하겠습니다. 잠시만 기다려주세요.");
            LoadingBar t = new LoadingBar();
            t.run();

            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }
            if(Start.presentmoney>=100 && Start.percentage*100>=50){
                System.out.println("해당 조건이 맞습니다. 가입금액은 일 몇 치즈로 할 예정인가요?(최대 100치즈)");
                day_money = scan.nextInt();
                if(day_money<=100){
                    method(day_money,5,50);

                }else{
                    System.out.println("해당조건이 맞지 않습니다. 자동으로 돌아가겠습니다.");

                    t.run();
                    Savings();
                }

            }else{
                System.out.println("해당조건이 맞지 않습니다. 자동으로 돌아가겠습니다.");

                t.run();
                Savings();
            }
        }else if(saving.equals("3")){
            System.out.println("직원 : 네- 3번 일꾼 적금을 선택하셨군요 ! 해당 조건을 확인하겠습니다. 잠시만 기다려주세요.");
            LoadingBar t = new LoadingBar();
            t.run();

            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }
            if(Start.presentmoney>=300 && Start.percentage*100>=70){
                System.out.println("해당 조건이 맞습니다. 가입금액은 일 몇 치즈로 할 예정인가요?(최대 100치즈)");
                day_money = scan.nextInt();
                if(day_money<=300){
                    method(day_money,2,70);

                }else{
                    System.out.println("해당조건이 맞지 않습니다. 자동으로 돌아가겠습니다.");

                    t.run();
                    Savings();
                }

            }else{
                System.out.println("해당조건이 맞지 않습니다. 자동으로 돌아가겠습니다.");

                t.run();
                Savings();
            }

        }
        else if(saving.equals("0")){      //뒤로가기

            Start start = new Start();
            start.money();

        }else{
            Bank();
        }


    }
        void method(int money,int day, int percentage){        //적금 계산
            System.out.println("직원 : 총 확인결과, 고객님께서는 "+money+"치즈를 총 "+day+" 일 동안 넣기로 하셨습니다. 총 금리는 "+percentage+" % 를 선택하셨습니다.");
            System.out.println("───────────────────────────── 최종 적금 확인서 ─────────────────────────────");
            System.out.println("");
            System.out.println("                     총 가입기간 : "+day+" 일");
            System.out.println("                        적금금액 : 일 "+money+" 치즈");
            System.out.println("                 총 적금 예정금액 : "+day+" 일 x "+money+" 치즈");
            System.out.println("                               =  총 "+day*money+" 치즈");
            System.out.println("        총 혜택 금액 + 금리("+percentage+"%) : "+(day*money)*(100+percentage)/100+" 치즈");
            System.out.println("");
            System.out.println("──────────────────────────────────────────────────────────────────────────");
            System.out.println("동의 하신다면 아무키를 눌러주세요. (돌아가기 0)");

            Scanner scan = new Scanner(System.in);
            saving = scan.nextLine();

            Music_sub introMusic_good = new Music_sub("박수&굿잡.mp3", false);
            introMusic_good.start();

            if(saving.equals("0")){      //뒤로가기
                Start start = new Start();
                start.money();

            }

            else {

                System.out.println("직원 : 정상적으로 적금 가입되었습니다. 금액은 선택하신 기간동안 자동출금되며, 기간 종료시 은행 - '3. 적금 만기 신청'란을 방문해주세요.");
                System.out.println("오늘기준으로 "+Start.bar+"일째 이므로 "+ day+" 일 뒤인 "+(day+Start.bar) +"일에 방문해주시면 됩니다.");
                System.out.println("* 자동출금완료 및 적금만기안내 문자는 자동으로 메세지를 통해 알려드립니다.");

                System.out.println("감사합니다.");
                System.out.println("확인완료 되셨다면, 아무키를 눌러주세요. (메인화면으로 갑니다.)");
                saving = scan.nextLine();

                t.run();
                bar_day = 1;
                bar_day_2 = 2+day;
                this.money = money;
                this.day = day;
                this.percentage = percentage;
                Start start = new Start();
                start.money();

            }

        }

    }

class Expiration_service extends Savings{

    public static boolean service;

    void Expiration_service(){

        if(service == false){
            System.out.println("직원 : 아직 만기가 안되셨습니다. 다시 오시면 감사하겠습니다.");
            t.run();
            Bank();

        }else{
            System.out.println("직원 : 어서오세요^^ 적금 만기되셔서 찾으러 오셨군요!! 잠시만 기다리세요!!");
            t.run();
            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }
            System.out.println("직원 : 네 확인결과 적금 만기 확정되셨습니다. 총 "+(day*money)*(100+percentage)/100+" 치즈 입금해드렸습니다.");


            Music_sub introMusic_yeah = new Music_sub("예.mp3", false);
            introMusic_yeah.start();

            System.out.println("직원 : 감사합니다. 다음에 또 오세요 ^^");
            Start.presentmoney = Start.presentmoney +  (day*money)*(100+percentage)/100;

            System.out.println("========================총 현재 자산 :" + Start.presentmoney + " 치즈========================");

            System.out.println("확인완료되시면, 아무키를 눌러주세요. (메인화면으로 갑니다.)");
            Scanner scan = new Scanner(System.in);
            saving = scan.nextLine();

            t.run();
            for (int i = 0; i < 40; i++) {
                System.out.println("");
            }
            Start start = new Start();
            start.money();
        }

    }

    }



