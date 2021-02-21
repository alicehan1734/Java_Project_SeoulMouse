package JAVA_FinalProject;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class realestate extends Start {



    public void realestate() {

        for(int i=0;i<40;i++){
            System.out.println("");
        }

        String sentence;

if(bar >= 11){

    System.out.println("게임이 종료되었습니다.");
    theend = false;
    System.out.println("████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗ \n" +
            "╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗\n" +
            "   ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║\n" +
            "   ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║\n" +
            "   ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝\n" +
            "   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
            "                                                       ");
    final_();
}else if ( presentmoney >= money ){


    String end1 = "시골쥐 : 저 아주머니..!! 저 돈 다 모았어요!! 여기요!";
    String end2 = "부동산 대가 : 아이고~~ 정말 맞네!! 바로 집 계약하자! 축하해 청년!!";
    String end3 = "시골쥐 : 드디어 꿈을이루었다니!!!! 서울라이프 ! 이제 꿈꾸는거야!!! ";
    slowPrint(end1, 70);
    slowPrint(end2, 70);
    slowPrint(end3, 70);
    final_();
    String end4 ="축하합니다!! 원하시는 집을 드디어 사게되었습니다.짝짝짝!!";
    String end5 = "게임이 종료되었습니다.";
    slowPrint(end4, 70);
    slowPrint(end5, 70);

            theend = false;
            System.out.println("████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗ \n" +
                    "╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗\n" +
                    "   ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║\n" +
                    "   ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║\n" +
                    "   ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝\n" +
                    "   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
                    "                                                       ");



} else{
    System.out.println("아직 목표금액을 채우지 못했습니다! 목표금액을 채우고 다시오세요!");
    System.out.println("(뒤로가기 아무키)");

    Scanner scan = new Scanner(System.in);
    sentence = scan.next();

        money();

}
}


    void final_() {
        JFrame frame = new JFrame("게임엔딩"); //1.최상위 컨테이너 생성
        frame.setSize(550, 550); //사이즈
        frame.setLayout(new FlowLayout());
        JPanel p = new JPanel(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon icon_1 = new ImageIcon("C:\\Users\\한희연\\IdeaProjects\\Java_4weeks_project - 복사본\\src\\music\\서울.jpg"); //이미지 아이콘 객체 생성
        Image im = icon_1.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
        Image im1 = im.getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(im1);

        JLabel img_1 = new JLabel(icon1);

        frame.add(img_1);


        frame.setLocation(525, 150);  //위치 지정


        frame.setVisible(true); //화면에 보이기
        frame.setAlwaysOnTop(true);



    }


}