package ch04;

public class Mission03Result03 {
    public static void main(String[] args) {
        int value = (int) (Math.random() * 100.0) + 1;
            System.out.printf("%d는(은) %s수입니다.\n"
                    , value, value % 2 == 0 ? "짝": "홀"); //삼항식 두가지선택지밖에 없을때 조건식에는 불린타입
        }
    }

