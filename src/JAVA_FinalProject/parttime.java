package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class parttime extends Start {

    public void parttime(){
        for(int i=0;i<40;i++){
            System.out.println("");
        }
        String parttime;

        System.out.println("──────────────────────일자리 사무소에 왔습니다.──────────────────────");
        System.out.println("               (1)                (2)                (3)          ");
        System.out.println(" 이름 :        원 숭 이           코 끼 리            야 옹 이 ");
        System.out.println(" 일처리능력 :  ■■□□□          ■■■■□           ■■■□□   ");
        System.out.println(" 전문적능력 :  ■■□□□          ■■■□□           ■■■■■");
        System.out.println(" 비용(치즈) :    50                 65                 75  ");
        System.out.println(" 특징 :      거위들의 알을       동물들의 산책을       모든 동물들의 ");
        System.out.println("               잘 팜             잘 시킴          케어 경력 20년차");
        System.out.println("");
        System.out.println(" ※ 모든 동물들은 한순간에 일을 때려치울 수 있음. 신중히 선택하세요. ");
        System.out.println("");
        System.out.println("────────────────────────────────────────────────────────────────");
        System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
        System.out.println("");
        System.out.println("마음에 드는 직원을 선택해주세요.(뒤로가기 0)");

        while (true) {
            Scanner scan = new Scanner(System.in);
            parttime = scan.nextLine();
            if (presentmoney >= 50 && parttime.equals("1")) {

                presentmoney = presentmoney - 50;

                Runnable r = new Monkey();
                Thread t = new Thread(r);
                t.start();
                System.out.println("☺ 원숭이 < 안녕하세요! 주인님! 저 일처리 깔꼼말꼼하게 하겠습니다!!ㅎㅎ");
                System.out.println("원숭이를 고용했습니다.");


                break;

            } else if (presentmoney >= 65 && parttime.equals("2")) {

                presentmoney = presentmoney - 65;

                Runnable a = new Elephant();
                Thread b = new Thread(a);
                b.start();

                System.out.println("☺ 코끼리 < 제가 확실하게 동물들의 산책들을 시키고 완벽하게 하겠습니다!!ㅎㅎ");
                System.out.println("코끼리를 고용했습니다.");
                break;

            } else if (presentmoney >= 75 && parttime.equals("3")) {

                presentmoney = presentmoney - 75;
                Runnable c = new Cat();
                Thread e = new Thread(c);
                e.start();

                System.out.println("☺ 야옹이 < 모든일에 최선을 다겠냐옹! 고맙냐옹~!!");
                System.out.println("야옹이를 고용했습니다.");

                break;

            } else if (parttime.equals("0")) {
                money();
            } else {
                System.out.println("본인의 조건이 충족되었는지 다시 확인해주세요.");

                continue;
            }
        }

        System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
        System.out.println("아무키나 눌러주시면 뒤로 갑니다.");
        Scanner scan = new Scanner(System.in);
        parttime = scan.nextLine();
        money();

    }
}

class Monkey extends parttime implements Runnable{
    int qty;
    int qty_money;

    @Override
    public void run(){
        try {

            while(true) {


                Thread.sleep(150000);
                Random random = new Random();
                qty= random.nextInt(8);
                qty +=1;
                qty_money= random.nextInt(5);
                qty_money +=1;

                if(qty<=12 && qty>=5) {

                    System.out.println("☺ 원숭이 < 주인님!! 거위 알 "+qty+" 개를 팔아, 총 " + qty_money*qty+" 치즈의 돈을 벌었어요!!! ");

                }else if(qty<=4 && qty>=2){
                    System.out.println("☺ 원숭이 < 헤헷!! 양들의 "+qty+" 개의 양뭉치를 팔아, 총 " + qty_money*qty+" 치즈의 만큼 돈을 벌었습죵!!>3<");

                }else{
                    System.out.println("☺ 원숭이 < 앙! 몇 안되는 돌고래들의 공연을 성공적으로 "+qty+" 번 만큼 공연을 해, 총 " + qty_money*qty+" 치즈의 돈을 벌었어용!!");

                }
                presentmoney = presentmoney + (qty_money*qty);
                System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                total_qty_parttime_monkey = total_qty_parttime_monkey + qty;

                if(total_qty_parttime_monkey > 60){
                    System.out.println("☺ 원숭이 < 어휴 내가 여기에서 돈 번게 얼만데.. 돈도 안주고!! 이제 때려치울래!! 저 그만 둘게용 ㅡ3ㅡ");
                    System.out.println("직원의 갑작스러운 퇴사로 직원 한명이 나가게 되었습니다..");

                    break;
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}

class Elephant extends parttime implements Runnable{
    int qty;
    int qty_money;

    @Override
    public void run(){

        try {

            while(true) {


                Thread.sleep(150000);
                Random random = new Random();
                qty= random.nextInt(12);
                qty +=1;
                qty_money= random.nextInt(7);
                qty_money +=1;

                if(qty<=12 && qty>=6) {

                    System.out.println("☺ 코끼리 < 호오오욋!! 거위 알 "+qty+" 개를 팔아, 총 " + qty_money*qty+" 치즈 만큼 돈을 벌었어요!!! ");

                }else if(qty<=5 && qty>=3){
                    System.out.println("☺ 코끼리 < 히이이잉~~ "+qty+" 개의 양뭉치들을 팔아, 총 " + qty_money*qty+" 치즈 만큼 돈을 벌었습죵!!>3<");

                }else{
                    System.out.println("☺ 코끼리 < 하욧!! 나와 함께 돌고래들이 같이 공연을 해 "+qty+" 번의 공연을 해, 총 " + qty_money*qty+" 치즈 만큼 돈을 벌었어용!!");

                }
                presentmoney = presentmoney + (qty_money*qty);
                System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                total_qty_parttime_elephant = total_qty_parttime_elephant + qty;

                if(total_qty_parttime_elephant > 70){
                    System.out.println("☺ 코끼리 < 나 일을 너무 했더니,, 몸이 안좋아졌엉,,, ㅠㅠ 그만 둘게요,, ㅠㅠ");
                    System.out.println("직원의 갑작스러운 퇴사로 직원 한명이 나가게 되었습니다..");

                    break;
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
class Cat extends parttime implements Runnable{
    int qty;
    int qty_money;

    @Override
    public void run(){

        try {

            while(true) {

                Thread.sleep(20000);
                Random random = new Random();
                qty= random.nextInt(12);
                qty +=1;
                qty_money= random.nextInt(7);
                qty_money +=1;

                if(qty<=12 && qty>=6) {

                    System.out.println("☺ 야옹이 < 야아아옹! 거위 알 "+qty+" 개를 팔아, 총 " + qty_money*qty+" 치즈 만큼 돈을 벌었냥;;");

                }else if(qty<=5 && qty>=3){
                    System.out.println("☺ 야옹이 < 냥냥! "+qty+" 개의 양뭉치들을 팔아, 총 " + qty_money*qty+"치즈 만큼 돈을!!");

                }else{
                    System.out.println("☺ 야옹이 < >3< 돌고래들의 공연을 도와 "+qty+" 번의 공연을 해, 총 " + qty_money*qty+"치즈 만큼 돈을 벌었다냥!");

                }
                presentmoney = presentmoney + (qty_money*qty);
                System.out.println("========================총 현재 자산 :" + presentmoney + " 치즈========================");
                total_qty_parttime_cat = total_qty_parttime_cat + qty;

                if(total_qty_parttime_cat > 100){
                    System.out.println("☺ 야옹이 < 나 다른 회사에서 더 좋은 복지로 일하게 됐다냥,, 반가웠다냥,, ㅎㅎ ");
                    System.out.println("직원의 갑작스러운 퇴사로 직원 한명이 나가게 되었습니다..");

                    break;
                }


            }
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
