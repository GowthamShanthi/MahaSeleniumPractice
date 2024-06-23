package SeleniumJavaLearning;

public class LocalandInstanceVariable {
int c;//instance(global) variable
		void addTwoNumbers(int a,int b) {
int c=20; //local variable
System.out.println(c);
System.out.println(a+b+c);
	}
public static void main(String[] args) {
	LocalandInstanceVariable liv= new LocalandInstanceVariable();
	liv.addTwoNumbers(10,5);
}
}
