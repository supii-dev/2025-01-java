package ch04;

public class Mission01 {
    public static void main(String[] args) {
        //응용력 테스트
        // 5~10 사이 랜덤값 나올수 있도록 해주세요

        for(int i = 0; i < 1000; i++) {
            int result = (int)(Math.random() * 6.0) + 5;

            if(result < 5 || result > 10) {
                System.out.println("틀렸음!");
                break;
            }
        }
        System.out.println("-- 끝 --");
    }
}