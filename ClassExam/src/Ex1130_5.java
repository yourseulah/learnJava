import java.util.*; //외부 라이버리를 쓸때 
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList 클래스 활용
		ArrayList<Book> library = new ArrayList<Book>(); //제네릭 타입으로 생성

//		Book abc = new Book("태백산맥","조정래");
//		library.add(abc);
		//or
		library.add(new Book("태백산맥", "조정래")); //inline 객체생성
		library.add(new Book("데미안", "헤르만헤세")); 
		library.add(new Book("어떻게살것인가", "유시민"));
		
		System.out.println("===========================");
		for (int i = 0 ; i < library.size(); i++) { //메서드라면 반드시 괄호가 있어야 한다. 속성이면 괄호X
			//임시변수로 반환
			Book book = library.get(i); // 객체를 반환
			book.showBookInfo();
		}
		
		//향상된 for문
		System.out.println("==========향상된 for문 ===========");
		for (Book abc:library) {
			abc.showBookInfo();
		}
		
		  
	}

}
