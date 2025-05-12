package ch04;

public class Mission04 {
    public static void main(String[] args) {
       // 0~200 사이의 랜덤값
        //만약 score 값이 100 ~ 90 점 사이면 A 학점
        //만약 score 값이 80 ~ 89 점 사이면 B 학점
        //만약 score 값이 70 ~ 79 점 사이면 C 학점
        //만약 score 값이 70점 미만이면 D 학점
        //만약 score 값이 100점을 넘기거나 0점 아래면 측정불가
        int score = (int) (Math.random() * 201.0);
        if(score > 100  || score < 0 ) {
            System.out.println("측정불가");}
        else if ( score >= 90 ) {
        System.out.println("A 학점");}
        else if ( score >= 80 ) {
        System.out.println("B 학점"); }
        else if ( score >= 70 ) {
            System.out.println("C 학점"); }
        else {
            System.out.println("D 학점"); }
        System.out.println("-- 끝 --");
    }
}
