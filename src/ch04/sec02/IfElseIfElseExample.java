package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;
        // 두가지만 작성가넝

         int score = 93;

         if( score >= 90) {
             // 조건식 ,분기문  , >= 관계연산자 읽기임
             System.out.println("점수가 90보다 큽니다");
             System.out.println("등급은 A입니다.");
         } else if ( score >= 80) {
             System.out.println("점수가 80~89입니다.");
             System.out.println("등급은 B입니다.");
             //갯수제한없이 계속 추가가넝
         } else if ( score >= 70) {
             System.out.println("점수가 70~79입니다.");
             System.out.println("등급은 C입니다.");

         } else {
             System.out.println("점수가 70미만 입니다.");
             System.out.println("등급은 D입니다.");
             // 옵션이라 있어도 되고 없어도 되고
         }
        System.out.println("--끝--");
    }
}
// 가장빨리만나는 트루를 찾아서 이프문을 빠져나온다 그룹이기 때문에
