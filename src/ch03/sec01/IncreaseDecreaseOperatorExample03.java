package ch03.sec01;

public class IncreaseDecreaseOperatorExample03 {
    public static void main(String[] args) {
        int i1 = 5;

        System.out.printf("i1: %d\n", i1++); //읽기, 쓰기
        System.out.printf("i1: %d\n", i1);

        System.out.println("----------");

        int i2 = 5;
        System.out.printf("i2: %d\n", ++i2); //쓰기, 읽기
        System.out.printf("i2: %d\n", i2);
    }
}