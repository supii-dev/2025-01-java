package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; //더한값들의 모임
        int num = 0; // 사용자가 입력하는값
        boolean run = true;
        System.out.println("합계를 구할 숫자를 입력 하세요 (종료:0)");
        while (run) {
            System.out.print(">>");
            num = scanner.nextInt();
            sum += num;
            if (num == 0 ) {
                run = false;
                System.out.println(sum);
            }

        }


        /*
        합계를 구할 숫자를 입력 하세요 (종료:0)
        >> 100
        >> 200
        >> 300
        >> 400
        >> 0
        합계 : 1000
        */
            }
        }

