package ch04;

public class Mission05 {
    public static void main(String[] args) {
        int starCount = (int) (Math.random() * 6.0) + 2; // (1)2~7사이 랜덤값
        System.out.printf("starCount: %d\n", starCount );
        for(int i = 0 ; i < starCount; i++){
            System.out.print("*");
        }
        //starCount = 3;
        //***

        //starCount = 7;
        //*******

        //starCount = 2;
        //**



    }
}

//System.out.print("안녕");     // 줄바꿈 없이 출력
//System.out.println("안녕");  // 출력 후 줄바꿈
//System.out.printf("이름: %s, 나이: %d\n", "철수", 20);  // 형식 지정 출력