
public class Ex1130_3 {

	public static void main(String[] args) {
		// 깊은 복사(일반적인 복사)
		
		//객체배열 처리
		Book[] bookArr1 = new Book[3]; // Book 객체를 저장할 배열변수 선언 
		Book[] bookArr2 = new Book[3]; // Book 객체를 저장할 배열변수 선언
		
		bookArr1[0] = new Book("태맥산맥", "조정래"); //생성
		bookArr1[1] = new Book("데미안", "헤르만헤세");
		bookArr1[2] = new Book("어떻게살것인가", "유시민");
		
		String[] strArr = {"자바", "안드로이드", "c", "자바스크립트", "파이썬"};
		
		for(int i = 0; i< bookArr2.length; i++) {
		bookArr2[i] = new Book(); // 일단 디폴트 생성자로 생성해둠
		}
		
		System.out.println("================원본===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================사본===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//깊은복사 - 독립적
		for(int i = 0; i < bookArr1.length; i++) { //원본 배열 길이만큼 배정 (저장)  객체를 쓸때는 Arraycopy를 쓰면 안된다.
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		System.out.println("================원본===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================사본===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//사본의 3번째 책을 수정
		bookArr2[2].setBookName("자바프로그래밍");
		bookArr2[2].setAuthor("홍길동");
		
		System.out.println("================원본===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================사본===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//원본의 2번째 책을 수정
		bookArr1[1].setBookName("자바");
		bookArr1[1].setAuthor("김삿갓");
		
		
		System.out.println("================원본===================");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}	
			
		System.out.println("================사본===================");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//위에 연습은 원본과 사본간의 영향을 안준다라는 걸 확인하려고 
		
		for (String lang: strArr) { //전통적이지 않은 방법
			System.out.print(lang + " ");
		}
		System.out.println();
		for(int i = 0; i< strArr.length; i++) {
			System.out.print(strArr[i] + " "); 
		}

	}
	}
