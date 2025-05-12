package ch04;

import java.util.Scanner;

public class Mission04Result02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요:");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);

        if (score < 0 || score > 100) { // 0미만 혹은 100초과인 경우
            System.out.println("측정불가");
        } else {
            String result = "D";
            if (score >= 90) {
                result = "A";
            } else if (score >= 90) { // 90~ 100사이
                result = "A";
                // 0 ~ 89
            } else if (score >= 80) { // 80 ~ 89사이
                result = "B";
                // 0 ~ 79
            } else if (score >= 70) { // 70 ~ 79사이
                result = "C";
            }
            System.out.printf("당신은 %학점\n", result);
            System.out.println("-- 끝 --");
        }
    }
}