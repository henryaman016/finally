package finally_block;

public class B {
public static void main(String[] args) {
	try {
		int x=10/0;
		System.out.println(x);
		
	}finally {
		System.out.println("finally");
	}System.out.println("Welcome");
}
}
