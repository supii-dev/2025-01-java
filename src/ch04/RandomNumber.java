package ch04;

public class RandomNumber {
    public static void main(String [] args) {
        //API, Math.random() double 타입 리턴, 0.0000000 ~ 0.99999999, 절대 1이 안 나온다.
        System.out.println(Math.random());
        double value = 0.99999;
        double result = value * 10.0d; //9.9999
                       // 더블타입
        System.out.println("result: " + result);

        int intResult = (int)result; // 강제 형변환, 명시적 형변환
        System.out.println("intResult: " + intResult );
        // 정수는 실수를 저장할수없기때문에 강제 형변환을 해서 집어넣으면 9로 변환된다

        double value2 = 0.00002;
        System.out.println("value2: " + (int)(value2 * 10.0));
        // 최솟값은 언제나 0 최대값은 내가 곱한값의 -1
        System.out.println((int)(Math.random() * 10.0) ); // 0 ~ 9


    }
}

// println(소괄호); 메소드
// double V = Math.random();
// System.out.println(V);
