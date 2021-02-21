package JAVA_FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Clean_farm  extends farm{
    LoadingBar t = new LoadingBar();
    char[][] chars = new char[10][10];
    int a, b, c, d;
    String ad;
    int check = 0;
    Random random = new Random();
    public void Clean_farm() {

        time = 15 ;

        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        System.out.println("──────────────────── 농 장 입 성  ─────────────────────");

        if(cleanhouse>=4){
            System.out.println("아직 농장이 깨끗합니다. 농장이 더러울때 다시 오세요- ");
            t.run();
            farm();
        }else {
            System.out.println("농장에 도착했습니다....");
            System.out.println("미션 : 농장에 있는 숲벌레(ఈ)들을 15초동안 얼른 해치우세요!! ");
            String message_1 = "5!!!!!!!!!!! 4!!!!!!!!!! 3!!!!!!!!!! 2!!!!!!!!!! 1!!!!!!!!!!!";
            slowPrint(message_1, 50);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

                    while (time > 0) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        }

                        time--;
                    }
                }
            });

            thread.start();

            for (int i = 0; i < 5; i++) {
                a = random.nextInt(10);
                b = random.nextInt(10);

                chars[a][b] = 'ఈ';

            }

            while (true) {
                c = random.nextInt(10);
                d = random.nextInt(10);
                if (chars[c][d] == 'ఈ') {

                } else {
                    chars[c][d] = '☻';
                    break;
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (chars[i][j] == 'ఈ') {

                    } else if (chars[i][j] == '☻') {

                    } else {
                        chars[i][j] = '□';
                    }
                }
            }

            Scanner scan = new Scanner(System.in);

            while (true) {

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print(chars[i][j] + " ");
                    }
                    System.out.println("");

                }

                if (time <= 0) {
                    System.out.println("");
                    System.out.println("Game Over");
                    System.out.println("농장이 여전히 더럽습니다. 다시 오세요!");

                    break;

                }
                System.out.println("남은시간 : " + time);
                System.out.println("방향키를 알려줄 '문자'를 알려주세요.(a: → | w: ↑ | d: → | s: ↓ | □: 깨끗한 구역 | ఈ: 숲벌레 | ☻: 나)");
                ad = scan.next();
                for (int i = 0; i < 35; i++) {
                    System.out.println("");
                }

                chars[c][d] = '□';
                if (ad.equals("a")) {
                    d--;

                    if (d < 0) {
                        System.out.println("알맞지 않습니다. 원래 자리에 있겠습니다.");

                        d++;
                        chars[c][d] = '☻';

                    } else {
                        chars[c][d] = '☻';
                    }

                } else if (ad.equals("w")) {
                    c--;

                    if (c < 0) {
                        System.out.println("알맞지 않습니다. 원래 자리에 있겠습니다.");

                        c++;
                        chars[c][d] = '☻';

                    } else {
                        chars[c][d] = '☻';
                    }
                } else if (ad.equals("d")) {
                    d++;
                    if (d > 9) {
                        System.out.println("알맞지 않습니다. 원래 자리에 있겠습니다.");
                        d--;
                        chars[c][d] = '☻';

                    } else {
                        chars[c][d] = '☻';

                    }
                } else if (ad.equals("s")) {
                    c++;
                    if (c > 9) {
                        System.out.println("알맞지 않습니다. 원래 자리에 있겠습니다.");

                        c--;
                        chars[c][d] = '☻';

                    } else {
                        chars[c][d] = '☻';

                    }
                } else {
                    System.out.println("알맞는 문자를 쳐주세요. 원래 자리에 있겠습니다.");

                    chars[c][d] = '☻';
                }


                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (chars[i][j] == '□') {
                            check += 10;

                        } else if (chars[i][j] == '☻') {
                            check += 5;
                        }
                    }
                }

                if (check == 995) {
                    System.out.println("완성!");
                    System.out.println("농장이 다시 깨끗해졌습니다.");
                    cleanhouse = 5;
                    break;

                } else {
                    check = 0;
                }
            }

            String message_2 = "뒤로 다시 돌아가겠습니다.";
            slowPrint(message_2, 50);
            System.out.println("");
            t.run();
            farm();

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
