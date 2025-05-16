package ch04;

public class Mission08 {
    public static void main(String[] args) {
//        int sum = 0;
//        sum = sum + 1; // 0 + 1 = 1
//        sum = sum + 2; // 1 + 2 = 3

//        System.out.println("sum: " + sum); //3

        // 1~100 모두더한값 출력하세요
        int sum = 0;
        for (int i = 1 ; i < 101; i++ ) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}