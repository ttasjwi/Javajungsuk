
import java.util.*;

public class StringTokenizerEx2 {

	/* Java의 정석 3판 p.515 예제 9-39 내용 확인 및 연습 : StringTokenizer 클래스의 생성자 - 구분자도 token으로 취급하는 방법
	 * 
	 * [StringTokenizer]
	 * 
	 * 문자열을 구분자를 기준으로 여러 개의 Token으로 잘라내여 활용하는 클래스
	 * 다른 방법과 달리 정규식을 사용하지 않고 사용하는 차별점이 있음
	 * 
	 * 다만, 구분자를 하나씩 인식한다는 점이 한계.
	 * 두 글자 이상의 복잡한 구분자로 나누거나 복잡한 형식에 맞춰 쪼갤 때는 정규식을 사용할 필요가 있다.
	 * (예를 들어 ",.#+"을 구분자로 지정하면 "," "." "#" "+" 각각의 문자들이 구분자로 취급됨.)
	 * 
	 *  1. 생성자
	 *  	StringTokenizer (String str, String delim) : 문자열 지정, 구분자 지정
	 *      StringTokenizer (String str, String delim, boolean returnDelims) : true일 때 구분자도 토큰으로 간주 
	 *      
	 *  2. 메서드
	 *  	int countTokens() : 전체 토큰의 수 반환
	 *  	boolean hasMoreTokens() : 토큰이 남아있는지를 boolean으로 반환 
	 * 		String nextToken() : 다음 토큰을 반환
	 * 
	 * [구분자로 문자열을 쪼개는 다른 방법]
	 * 
	 * String 객체.split(String regex) : 문자열을 regex로 쪼개서 배열로 반환
	 * Scanner 객체.useDelimiter(String pattern) : Scanner 객체의 내용을 pattern을 구분자로 한 Scanner 객체 반환
	 * 
	 */
	
	public static void main(String[] args) {
		
		String expression = "x=100*(200+300)/2"; // 원본 문자열
		System.out.println("expression : " + expression);
		
		String delim = "+-*/=()"; // 구분자 지정. 이때 구분자 + - * / = ( ) 는 각각 구분자로 취급된다.
		
		StringTokenizer st = new StringTokenizer(expression, delim, true);
		// 구분자도 token으로 취급.
		
		
		while (st.hasMoreTokens()) { // 토큰을 더 가지고 있니?
			System.out.println(st.nextToken());
		}
	}

}
