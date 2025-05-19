package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;



        while (run){
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            int Num = scanner.nextInt();
            switch (Num){
                case 1:
                    System.out.print("예금액 >");
                    int in = scanner.nextInt();
                    money += in;
                    System.out.printf("현재 잔고 : %d\n " , money);
                    break;
                case 2:
                    System.out.print("출금액 >");
                    in = scanner.nextInt();
                    money -= in;
                    System.out.printf("현재 잔고 : %d\n " , money);
                    break;
                case 3:
                    System.out.println("현재 잔고 : " + money);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("--끝--");
    }
}


/*
(프린트 반복 실행)
---------------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
---------------------------------
선택 >


(실행 예시)
선택 > 1 (엔터)
예금액 > 10000 (엔터)

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