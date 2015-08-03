import java.util.Scanner;
public class s1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("Who are you?");
		String name=scn.next();
		System.out.println("Hi,"+name+"nice to meet you.");
		System.out.println("Where are you going?");
		String place=scn.next();
		System.out.println("Great! There is so beautiful.");
		System.out.print("Be careful! Goodbye.");
	}

}
