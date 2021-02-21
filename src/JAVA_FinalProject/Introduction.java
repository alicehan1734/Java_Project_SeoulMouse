package JAVA_FinalProject;

import java.util.Scanner;


public class Introduction {
    public static void main(String[] args) {




        String firstQnA;
           System.out.println("                                    ███████╗███████╗ ██████╗ ██╗   ██╗██╗         ███╗   ███╗ ██████╗ ██╗   ██╗███████╗███████╗\n" +
                   "                                    ██╔════╝██╔════╝██╔═══██╗██║   ██║██║         ████╗ ████║██╔═══██╗██║   ██║██╔════╝██╔════╝\n" +
                   "                                    ███████╗█████╗  ██║   ██║██║   ██║██║         ██╔████╔██║██║   ██║██║   ██║███████╗█████╗  \n" +
                   "                                    ╚════██║██╔══╝  ██║   ██║██║   ██║██║         ██║╚██╔╝██║██║   ██║██║   ██║╚════██║██╔══╝  \n" +
                   "                                    ███████║███████╗╚██████╔╝╚██████╔╝███████╗    ██║ ╚═╝ ██║╚██████╔╝╚██████╔╝███████║███████╗\n" +
                   "                                    ╚══════╝╚══════╝ ╚═════╝  ╚═════╝ ╚══════╝    ╚═╝     ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝");

            System.out.println("                                                                시작 하려면 1번을 눌러주세요.(2번 종료) ");



                Scanner sc = new Scanner(System.in);
                firstQnA = sc.nextLine();

                LoadingBar t = new LoadingBar();
                t.run();

                if (firstQnA.equals("1")) {


                 Start mystart = new Start();
                 mystart.start_introduction();


                } else if (firstQnA.equals("2")) {
                    System.out.println("게임이 종료되었습니다.");
                    return;
                }
            }



}





