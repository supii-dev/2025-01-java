package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;
        // 두가지만 작성가넝

         int score = 93;

         if( score >= 90) {
             // 조건식 ,분기문  , >= 관계연산자 읽기임
             System.out.println("점수가 90보다 큽니다");
             System.out.println("등급은 A입니다.");
         }
         if ( score < 90) {
             System.out.println("점수가 90보다 작습니다.");
             System.out.println("등급은 B입니다.");
             // 별개임 서로 영향안미침 서로중복되면 둘다나올수도 안나올수도
             //이프문은 중첩가넝
         }
    }
}
