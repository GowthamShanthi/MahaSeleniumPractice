package SeleniumJavaLearning;

import java.security.DomainCombiner;

public class StaticVariable {
	int x=0;
	static int y=0;
	void counter() {
	x++;
	y++;
	System.out.println("non-static =>" +x+ "static =>" +y);
	}
	public static void main(String[]args) {
StaticVariable sv= new StaticVariable();
sv.counter();

}
}	
