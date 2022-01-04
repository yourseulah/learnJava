
public class Ex1130_1 {

	public static void main(String[] args) {
		// 배열 복사
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println(); // println 줄바꿈 있는거 (구구단 했을때 이걸로씀) print 줄바꿈 없는거 
		//기본타입의 복사는 독립적 (int, double, float, char )이라서
		System.arraycopy(array1, 0, array2, 1, 4);
		// 원본과 대상은 각각 유지됨
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		array1[2] = 300; //배열1 수정
		//배열1 확인 (수정됨)
		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		//배열2 리스트하면 변화없음 - 기본타입의 복사는 독립적 (int, double, float, char )이라서
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		///------------------------------------------
		//객체배열 처리
		Book[] bookArr1 = new Book[3]; // Book 객체를 저장할 배열변수 선언 
		Book[] bookArr2 = new Book[3]; // Book 객체를 저장할 배열변수 선언
	
		Book aaa;//선언
		aaa = new Book("aaa", "bbb"); //생성
		// Book aaa = new Book("aaa", "bbb"); 선언과 동시에 생성

		bookArr1[0] = new Book("태맥산맥", "조정래"); //생성
		bookArr1[1] = new Book("데미안", "헤르만헤세");
		bookArr1[2] = new Book("어떻게살것인가", "유시민");
	
		System.out.println("================원본===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);  // Arraycopy 얕은복사 
		
		System.out.println("================사본===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//원본수정
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");
				
		System.out.println("================원본===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}

		System.out.println("================사본===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		
		
		
		
		
		
	}

	
}

