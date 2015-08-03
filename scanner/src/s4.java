import java.util.Scanner;

public class s4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入圓的半徑長");
        float r=scn.nextFloat();
        float area=(float)(3.14*r*r);
        System.out.print("面積="+area);
	}

}
