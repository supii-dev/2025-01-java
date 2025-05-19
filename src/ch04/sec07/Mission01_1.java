package ch04.sec07;

import java.util.Scanner;

public class Mission01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int dep = 0;
        while(true) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택 > ");
            value = scanner.nextInt();
            if(value == 1) {
                System.out.print("예금액 > ");
                dep += scanner.nextInt();
            } else if( value == 2) {
                System.out.print("출금액 > ");
                int wit = scanner.nextInt();
                if (wit > dep) {
                    System.out.println("잔액이 부족합니다.");

                } else { dep -= wit;
                    System.out.println(dep);}
            } else if( value == 3) {
                System.out.println("잔고: " + dep);
            } else if( value == 4) {
                System.out.println("종료합니다.");
                break;
            }else{
                System.out.println("올바른 번호를 입력해주세요.");

            }


        /*
        (프린트 반복 실행)
        ------------------------------
        1.예금 | 2.출금 | 3.잔고 | 4.종료
        ------------------------------
       선택 >


       (실행예시)
       선택 > 1 (엔터)
       예금액 10000 (엔터)

       [[ 프린트 ]]

       선택 > 2 (엔터)
       출금액 > 2000 (엔터)

       [[ 프린트 ]]

       선택 > 3 (엔터)
       잔고 > 8,000원

       [[ 프린트 ]]

       선택 > 4 (엔터)
      프로그램 종료
         */
        }
    }}