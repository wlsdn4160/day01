package day01;

public class SystemOut {
	public static void main(String[] args) {
		/*
		 * 메인이라고 적고 컨트롤+스페이스+엔터 치면 생성됩니다.
		 실행단축키는 crtl+F11
		 단축키 
		 	전체선택 ctrl + a
		 	주석 단축키 ctrl + /
		 	되돌리기 ctrl + z
		 	코드이동 alt + 방향키
		 	이름을 한번에 수정 alt+shift+r
		 */
		System.out.println("어서오세요");
		System.out.println();
		System.out.println("어서오세요2");
		System.out.print("1");
		System.out.println("asd");
		/* sysout 누르고 컨트롤+스페이스 누르면 자동출력문 생성됩니다.
		 * 개행을 포함하는 println()
		 * 개행을 포함하지 않는 print()
		 */
		//형식 지정 출력문 printf()
		//\t 탭 띄워쓰기
		//%d 는 숫자형식 입력 받는다
		//%s 문자열 형식 입력 받는다
		//%f 실수형식 입력 받는다
		System.out.printf("오늘은 %d년. %d월. %d일입니다.\n",2021, 8, 10);
		System.out.printf("원주율은 %f입니다", 3.141592);
		System.out.printf("\n제 이름은 %s입니다","박진우");
		

		
	}
	

}
