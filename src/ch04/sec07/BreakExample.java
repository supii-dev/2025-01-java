package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while (true){
            //int num = ?? ;//1~6 사이 랜덤값
            //0.0000-0.99999
            //0.0000 - 6.7878487
            //0 - 6
            //1 - 7
            int num = (int) (Math.random() * 6.0 ) + 1;
            System.out.println(num);
            if(num == 6){
                break;
            }
            System.out.println(("--끝--"));

        }
    }
}
