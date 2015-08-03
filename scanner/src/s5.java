import java.util.Scanner;
public class s5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入平方公尺");
		float a=scn.nextFloat();
		System.out.println("請輸入一坪的價錢");
		float b=scn.nextFloat();
		float c=(float)(a*0.3025*b);
		System.out.print("價格總共是"+c);

	}

}
