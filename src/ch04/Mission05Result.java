package ch04;

public class Mission05Result {
    public static void main(String[] args) {
        int starCount = (int) (Math.random() * 100.0) + 1; // (1)2~7사이 랜덤값
        System.out.printf("starCount: %d\n", starCount );
        for(int i = 0 ; i < 1; i++){
            System.out.print("*");

        }
    }
}

//System.out.print("안녕");     // 줄바꿈 없이 출력
//System.out.println("안녕");  // 출력 후 줄바꿈
//System.out.printf("이름: %s, 나이: %d\n", "철수", 20);  // 형식 지정 출력