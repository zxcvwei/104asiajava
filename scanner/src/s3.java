import java.util.Scanner;

public class s3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J��Ϊ��W��");
        float a=scn.nextFloat();
        System.out.println("�п�J��Ϊ��U��");
        float b=scn.nextFloat();
        System.out.println("�п�J��Ϊ���");
        float h=scn.nextFloat();
        float c=a*b*h*1/2;
        System.out.print("���n="+c);
	}

}
