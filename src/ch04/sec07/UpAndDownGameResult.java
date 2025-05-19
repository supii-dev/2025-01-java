package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGameResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100.0 ) +1;
        System.out.println("answer: " + answer);
        while(true) {
            System.out.print("1-100사이 숫자를 입력해주세요 >");
            int num = scanner.nextInt();
            if (num > answer) {
                System.out.println("up!");
            } else if (num < answer) {
                System.out.println("down!");
            } else {
                System.out.println("정답!");
                break; // break를 감싸고 있는 가장 가까운 반복문을 빠져나온다.
            }
        }
        System.out.println("--끝--");
    }
}
