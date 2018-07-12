import java.util.ArrayList;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>() ;
		al.add(10);
		al.add(5);
		al.add(4);
		al.add(2);
		al.add(7);
		System.out.println(al);
		ArrayList<Integer> a2=(ArrayList<Integer>) al.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(a2);
		ArrayList<Integer> a3=(ArrayList<Integer>) al.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(a3);
		
	}

}
