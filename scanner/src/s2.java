import java.util.Scanner;


public class s2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入三角形的底");
        float a=scn.nextFloat();
        System.out.println("請輸入三角形的高");
        float b=scn.nextFloat();
        float c=a*b*1/2;
        System.out.print("面積="+c);
	}

}
