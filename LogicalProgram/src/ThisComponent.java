import java.util.Arrays;
import java.util.List;

public class ThisComponent {

	public static void main(String[] args) {
		String[] arr = { "Subham", "Vikash" };
		List l = Arrays.asList(arr);
		l.add("abhi");
		System.out.println(l);
	}
}