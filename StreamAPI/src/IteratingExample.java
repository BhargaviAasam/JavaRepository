import java.util.stream.Stream;

public class IteratingExample {
	public static void main(String[] args) {
		  
		Stream.iterate(10,element->element+5).filter(element->element%5==0).limit(15).forEach(System.out::println);
		
		
		
		
		
		
	}

}
