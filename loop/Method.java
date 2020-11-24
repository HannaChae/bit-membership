package loop;

public class Method {
    /*
     * 메쏘드
     * 메쏘드란, 자바에서 해당 클래스가 가지고 있는 기능을 뜻한다.
     * 어떤 특정한 작업을 반복적으로 다른데서도 하게 되면
     * 그 코드를 처음부터 끝가지 다시 써주는 것은 비효율적이고 귀찮은 노동이 된다.
     * 
     * 그래서 그렇게 특정 기능들을 다시 사용해야된다면, 즉 그 코드들을 다시 사용해야한다면
     * 기능으로 분리해서 메소드로 만들면, 우리가 그 메소드를 호출만 해주면
     * 해당 코드들이 불러와지기 때문에
     * 다시 안써줘도 된다.
     * 
     * 메쏘드는 선언과 구현으로 이루어져 있다.
     * 선언: 해당 메소드의 이름, 그리고 실행할 때 필요로 하는 외부의 값, 그리고 이 메소드가 종료되면서
     *      호출됐던 곳으로 보내줄 데이터의 타입을 적어주게 된다.
     *      
     * 구현: 해당 메소드의 기능을 우리가 직접 코드로 적어주게 된다.
     * 
     * 메소드의 선언과 구현
     * 리턴타입 메소드이름(파라미터){
     *    메소드의 기능 구현
     * }
     * 
     * 리턴 타입: 해당 메소드가 종료되면서 이 메소드를 호출한 곳으로 보내줄 값의
     *          데이터타입을 말한다.
     *          만약 아무런 데이터도 보내주지 않을 경우, 리턴 타입은 void가 된다.
     *          그 외의 경우에는 기능 구현 안에 반드시 return이라는 명령어를 통해서
     *          해당 데이터타입과 일치하는 데이터타입을 가진 무언가를 "돌려보내주어야" 한다.
     *          return은 어디에 있든 메소드에서 코드를 실행하다 return을 만나는 순간
     *          무조건 해당 메소드는 종료된다.   
     * 
     * 메소드 이름: 소문자로 시작하는 동사, 낙타등 표기법을 따른다.
     * 
     * 파라미터: 이 메소드를 실행하는데 필요로 하는 외부의 값.
     *         만약 해당 메소드를 실행하는데 필요로 하는 외부의 값이 여러개면 여러개의 파라미터가 들어간다.
     *         파라미터의 경우 우리가 변수를 '선언'하듯
     *             데이터타입 이름
     *         으로 하나씩 적어주면 된다.
     *         또한 파라미터는 해당 메소드 내부에선 변수처럼 취급되기 때문에 우리가
     *         "매개 변수"라고도 부른다.
     *         또한 파라미터는 해당 메소드 전체가 유효범위가 된다.
     *         그리고 외부에서 해당 메소드를 호출할 때에 값을 넘겨주어야 하는데
     *         이때는 파라미터와 이름이 일치할 필요는 없지만 해당 파라미터의 데이터타입과 순서가 일치해야 한다.
     * 
     * 메소드 오버로딩(overloading)
     * 메소드 오버로딩이란, 이름은 같지만 파라미터가 달라져서 같은 목적을 가진
     * 여러개의 메소드를 같은 이름으로 묶는 방법을 말한다.
     * 예를 들어, System.out.println()은 총 9가지 파라미터에 대해서
     * 오버로딩이 되어있다.        
     *         
     * 예를 들어 우리가 만든 EX08Calculator 클래스의 경우
     * add, subtract, multiply, divide 메소드들이
     * int 파라미터 2개에 대한 선언과 구현만 되어있다.
     * 그렇다면 add(1, 3.1) 혹은 add(3.0, 1.4) 같이
     * 더블이 파라미터로 포함되는 경우에는 어떻게 될까?
     * 당연히 에러가 난다. 왜냐하면, 우리가 해당 메소드들에 대해
     * "인트 데이터타입을 가진 값 2개에" 대해서만 선언과 구현해놨기 때문
     * 더불이 하나라도 들어오는 순간 해당 파라미터들을 가진 메소드는 존재하지 않기 때문에
     * 에러가 나게 된다.
     * 
     * 따라서 숫자 2개를 더한다 = add 니깐
     * 해당 이름을 가진 메소드들을 여러개 만들되
     * 호출할 때 구분이 가능하도록 파라미터가 달라져야만 한다.
     * 
     * 그렇다면 파라미터가 달라져야 한다는건 무슨 의미일까?
     * 
     * Q) 다음중 파라미터가 다른 메소드 하나는?
     * 1. void printInfo(String, String)
     * 2. void printInfo(String, int ) 
     * 3. void printInfo(int, String )
     * 4. void printInfo(int )
     * 
     * 답은 4번이다. 왜냐하면, 실제 우리가 메소드를 호출할 때 중요한건 파라미터의 이름이 아니라
     * 파라미터의 데이터타입 순서이기 때문
     * 만약 printInfo("서울대")라고 했을 때 1, 2, 3번 중 어떤게 호출되어야 하는가?
     * 정답은 컴퓨터가 정할 수 없다가 된다. 왜냐하면 1, 2, 3번 모두 다 파라미터로 "스트링"이기만 하면
     * 된다는 것이기 때문에 컴퓨터는 "서울대"가 사람이름이건, 학교이름이건, 주민등록번호이건 
     * 이런건 판단하지 않고 오로지 데이터타입만 생각하기 때문이다.
     * 
     * 따라서 파라미터가 다르다는 것은 
     * 해당 메소드의 파라미터 안의 데이터타입의 순서가 다르다라는 뜻이 된다.
     * 즉 파라미터가 다른지 같은지가 궁금하면, 이름은 무시하고
     * 파라미터의 데이터타입만 쭉 써보면, 같은지 다른지 알 수 있다.
     * 
     * 
     * 접근제한자(Access Modifier)
     * 접근제한자란 해당 메소드 혹은 우리가 나중에 배우게 될 필드가
     * 외부 클래스가 사용가능한지를 지정하는 그러한 키워드이다.
     * public, protected, default, private 키워드가 있으며
     * 각각 다음과 같은 범위에서 사용 가능하다.
     * public: 해당 메소드 혹은 필드를 어디서든 접근 가능(외부 패키지던 외부 클래스던)
     * protected: 해당 메소드 혹은 필드는 같은 패키지의 다른 클래스들은 자유롭게 접근 가능하지만
     *            다른 패키지일 경우에는 해당 클래스를 상속받는 다른 클래스들만 접근 가능하다.
     * default: 해당 메소드 혹은 필드는 같은 패키지의 다른 클래스들은 자유롭게 접근 가능하지만
     *          다른 패키지일 경우에는 모든 접근이 불가능하다.
     *          default 키워드는 기본적으로 switch에서 사용되기 때문에 우리가 아무런
     *          접근제한자도 안적어주면 기본적으로 default 접근제한자가 적용된다.
     *          또한, 같은 패키지에서만 접근 가능하기 때문에 "package 접근제한자"라고도 부른다.
     * private: 해당 메소드 혹은 필드는 모든 외부 클래스가 접근이 불가능하다.
     *          오직 해당 클래스 내부에서만 호출 가능하다.
     *          예전에는 정말정말 클래스 내부에서만 숨겨야하는 내용만 private으로 했지만
     *          이제는 외부가 정말정말 필요한 내용만 public으로 해두고 나머지는 모두 다
     *          private로 하는게 정석이다.         
     *                 
     * 
     * 
     */

}


























