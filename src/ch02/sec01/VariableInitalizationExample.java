package ch02.sec01;

public class VariableInitalizationExample {
    public static void main(String[] args){
        int value;
        value = 10;
        // 변수 선언(변수명 당 최초 한번), 선언을 할 때 데이터 타입 지정!(int는 정수 타입,오로지 정수만)
        // 변수 사용 방법 2가지: 읽기(read), 쓰기 (write)
        /*
        에러(예외) 종류 크게 2가지
        - 컴파일 에러: 실행을 할수없음. 컴파일이 자체가 불가능. 컴퓨터 언어인 0,1로 변경할수없다. 문법적 문제가 있거나 명확한 문제가 보이면...
        - 런타임 에러: 실행을 하는 도중에 에러가 발생
         */
        int result = value + 10;
        // 선언을 했다는건 공간확보를 했다는것
        //`=`은 대입연산자 얘 빼고는 읽기임
        // value 아래 빨간색 언더라인, 컴파일 에러임
        System.out.println(result);
    }
}
