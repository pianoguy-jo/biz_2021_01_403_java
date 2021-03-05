package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {// 인스턴스 변수 : 필요할때 사용하고 버린다.

	/*
	 * 클래스 영역에 변수를 선언하는 것은 핸재 클래스가 포함하고 있는 모든
	 * method들이 변수를 공유하여 코드를 수행하게 하려는 의도이다.
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에
	 * 선언되 클래스영역 변수를 " 인스턴스 변수"라고 한다.
	 * 인슨턴스 변수는 GC에 의해 메모리 관리가 자동으로 이루어진다.
	 * 
	 *  static method에서 필요한 변수들은 변수를 선언할때 static 키워드를
	 *  추가하여 static변수를 만든다.
	 *  
	 *  static 변수는 GC이 접근하지 못한다.
	 *  프로젝트가 시작될때 마들어지고, 계속 존재하는 상태이다.
	 *  프로젝트가 시작될때 클래스가 자동으로 만들어지고,
	 *  이때 static 변수들도 자동으로생성된다.
	 *  클래스가 생성될때 같이 만들어진다는 의미로
	 *  static 키워드가 부착된 변수를 "클래스변수"라고 한다.
	 *  
	 *  static 변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	 *  
	 *  다만, static 생성자를 마들어 변도로 생성을 하는 경우도 있다.
	 *  
	 */
	private static String numsFile ; // statci{} 없는 경우 private static String numsFile= "src/com/callor/shop/files/nums.txt";
	private static List<Integer> intList;
	
	static {// static 생성자 필요한 경우 외에 잘 사용하지 않는 변수 
		numsFile = "src/com/callor/shop/files/nums.txt";
		intList = new ArrayList<Integer>();
		
	} //클래스 변수와 인스턴스 변수의 차이점 static있냐 없냐
	// 클래스 변수는 static가 붙어 있다. 프로젝트가 시작될때 클래스가 자동으로 만들어지고, 이때 static 변수들도 자동으로생성된다.
	// 인스턴스 변수는 클래스를 객체로 선언하고 생성자에 의해서 객체가 생성될때 내가 필요할때 사용하고 GC로 관리된다
	
	
	
	
	/*
	 *  main() method와 같은 클래스내에 있는 다른 method를 호출하여
	 *  코드를 수행할 경우 main() method 호출을 받는 method들은
	 *  모두 static으로 선언되어야 한다.
	 *  
	 *  main() method와 static으로 선언된method들이 클래스 영역에서
	 *  선언된 변수를 공유하려면 클래스 영역에 선언된 변수들도 무도
	 *  static로 선언되어야 한다.
	 */

	public static void main(String args[]) {
		
		/*
		 * static 으로 선언된 method 내에서는
		 * 같은 클래스의 다른 method를
		 * this.method() 형식으로 호출하지 못한다.
		 */
		
		//makeNums();

		

	}// end main()

	// 메인 변수에 선언된 변수들은
	
	

	public static void makeNums() {
		
		
		Random rnd = new Random();
		int[] nums = new int[100];

		// 리스느를 만들어서 Random 수를 저장하기
		for (int i = 0; i < 100; i++) {
			// 1번 코드
			Integer num = rnd.nextInt(1000) + 1;

			// 2번코드
			intList.add(rnd.nextInt(1000) + 1);// 리스트에 저장하는 메소드 .add()
		}

	}

	public static void seveFileNums() {
		int[] nums = new int[100];
		FileWriter fileWrite = null;
		PrintWriter printer = null;

		try {
			fileWrite = new FileWriter(numsFile);
			printer = new PrintWriter(fileWrite);// 파일을 열려있는 상태이므로 최대한 코드를 줄여한 한다. 오류 발생 가능

			// nums 배열에 담긴 전체리스트를 향상된 for로 반복하면서 파일에 출력
			for (Integer n : nums) {
				printer.print(n);
			}

			// 표준형 for로 반복하면서 파일에 출력
			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {

				Integer n = intList.get(i);
				printer.println(n);
			}

			printer.close();
			fileWrite.close();

			System.out.println("Mission Complete!!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
