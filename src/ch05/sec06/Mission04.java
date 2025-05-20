package ch05.sec06;

public class Mission04 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum += arr[i]; // sum = sum + arr[i];
        }
        System.out.print("sum: " + sum);



    }
}
