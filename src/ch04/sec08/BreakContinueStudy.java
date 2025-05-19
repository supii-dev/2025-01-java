package ch04.sec08;

public class BreakContinueStudy {
    public static void main(String[] args) {
        // 열번 반복하는 for 문 2개 작성해 주세요

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("----------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
