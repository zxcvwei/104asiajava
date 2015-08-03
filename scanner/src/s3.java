import java.util.Scanner;

public class s3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入梯形的上底");
        float a=scn.nextFloat();
        System.out.println("請輸入梯形的下底");
        float b=scn.nextFloat();
        System.out.println("請輸入梯形的高");
        float h=scn.nextFloat();
        float c=a*b*h*1/2;
        System.out.print("面積="+c);
	}

}
