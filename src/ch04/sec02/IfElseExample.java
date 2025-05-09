package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;
        // 두가지만 작성가넝

         int score = 93;

         if( score >= 90) {
             // 조건식 ,분기문  , >= 관계연산자 읽기임
             System.out.println("점수가 90보다 큽니다");
             System.out.println("등급은 A입니다.");
         } else {
             System.out.println("점수가 90보다 작습니다.");
             System.out.println("등급은 B입니다.");
             // 하나의 그룹, 둘다 실행될순없음 둘중에 하나만 실행됨.
         }
    }
}
