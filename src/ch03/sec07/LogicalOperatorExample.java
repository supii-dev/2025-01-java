package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;

        System.out.printf(" %d > %d : %b\n", num1, num2, num1 > num2);
        System.out.printf(" 5 > 0 && 5 > 2 : %b\n" , 5 > 0 && 5 > 2);
        System.out.printf(" 5 > 0 && 5 < 2 : %b\n" , 5 > 0 && 5 < 2);
        System.out.printf(" 5 > 0 && 5 < 2 && 10 > 2 : %b\n" , 5 > 0 && 5 < 2);
        // && 앤드연산자 ture && true = true   false && true = false 하나라도 펄스면 펄스
        System.out.println();
        System.out.printf("5 > 0 || 5 < 2 : %b\n", 5 > 0 || 5 < 2);
        System.out.printf("5 < 0 || 5 < 2 : %b\n", 5 < 0 || 5 < 2);
        // || OR 연산자는 전부 펄스여야 펄스 하나라도 트루면 트루
        System.out.println();
        System.out.printf("!(5 < 0 || 5 < 2) : %b\n", !(5 < 0 || 5 < 2 ));
        System.out.printf("!false : %b\n", !false);
    }
}
