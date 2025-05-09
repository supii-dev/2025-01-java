package ch02;

public class PrintVsPrintln {
    public static void main(String[] args) {
        // print 옆으로 붙어서 나옴
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.println();
        System.out.println("---------------------");


        // println print+개행(이스케이프 문자 \n)
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        System.out.print("안녕\n");
        System.out.print("안녕\\n");
        System.out.print("'안녕'\n");
        System.out.print("\"안녕\"\n");

        //printf
        int age = 22;
        String name = "홍길동";
        float height = 172.5f;
        // double height = 172.5; 더블 사용하면 f 안붙여도됨
        // age, name, height 변수를 활용하여 아래처럼 출력시켜주세요.
        // 제이름은 홍길동이고 나이는 22살이며 키는 175.5cm 입니다.

        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm 입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm 입니다.\n", name, age, height);
        // 저 위치에 왼쪽에 있는거 순서대로 넣겠다


    }
}
