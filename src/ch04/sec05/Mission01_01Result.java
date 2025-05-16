package ch04.sec05;


import java.util.Scanner;

public class Mission01_01Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (종료:0)");
        boolean run = true;

        int sum = 0;
        while (run){
            System.out.print(">>");
            int num = scanner.nextInt();
            if(num == 0){
                run = false;
            } else {
                sum =sum + num;
                System.out.printf("현재 합계: %,d\n" , sum); // 천마다 점찍기
            }
        }


    }
}