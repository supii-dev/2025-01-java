//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
/*
MultiLine Comment
 */

// 주석입니당 왠만하면 비어있는 라인에

// Class 네임은 Pascal Case로 시작

/*
my name is hong
Pascal Case: MyNameIsHong
Cammel Case: myNameIsHong
 */

// 자바는 대소문자 가립니다

/*
 클래스라는 그릇을 만들어야함
 그릇에는 코드가 작성된다 ( 메소드 , 변수 등등)
 클래스 이름은 뭘해도 상관없지만 파일명과 같아야함
 메소드는 함수라고 보면 된다
 메인 메소드는 굉장히 중요한 메소드이다 프로그램의 시작점
 메소드를 만드는 것은 "메소드 정의" 이라고 표현.
 메소드를 사용하는것은 "메소드 호출" 이라고 표현.
 메소드가 호출되면 메소드 내용이 한줄씩 한줄씩 실행이 된다.
 소괄호로 메소드랑 함수를 구분가능
 */

public class Main {
    public static void main(String[] args) {
        //메소드 (Method), 엄청 중요한 메인 메소드, 프로그램시작점
        // 걍 똑같이 적으세요, 바뀔경우 메인 메소드의 역할이 사라짐 args 는 바꿀수있으나 안건드리면 더좋음
/*
TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
*/
        System.out.printf("Hello and welcome!");
        // 콘솔에 내용을 출력하라. 컨트롤 + 쉬프트 + F10번 단축키

        for (int i = 1; i <= 5; i++) {
            // 반목문, for- loop
/*
TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
 */

            System.out.println("i = " + i);
        }
    }
}
