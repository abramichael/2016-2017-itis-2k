import java.util.regex.*;

public class RegExExample {
	public static void main(String [] args) {
	
		Pattern p = Pattern.compile("[0-9]{4}");
		
		Matcher m1 = p.matcher("1234");
		System.out.println(m1.matches());
		Matcher m2 = p.matcher("124");
		System.out.println(m2.matches());
		
		// более быстрый способ, но ограниченный: 
		System.out.println("1234".matches("[0-9]{4}"));
		
	}
}