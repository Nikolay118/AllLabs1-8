import java.util.Scanner;
public class Lab1 extends Point3d {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		Point3d a = new Point3d();
		Point3d b = new Point3d();
		Point3d c = new Point3d();
		System.out.println("������� �������� X ������� �������");
		a.setX2(scn.nextDouble());
		System.out.println("������� �������� Y ������� �������");
		a.setY2(scn.nextDouble());
		System.out.println("������� �������� Z ������� �������");
		a.setZ2(scn.nextDouble());
		System.out.println("������� �������� X ������� �������");
		b.setX2(scn.nextDouble());
		System.out.println("������� �������� Y ������� �������");
		b.setY2(scn.nextDouble());
		System.out.println("������� �������� Z ������� �������");
		b.setZ2(scn.nextDouble());
		System.out.println("������� �������� X �������� �������");
		c.setX2(scn.nextDouble());
		System.out.println("������� �������� Y �������� �������");
		c.setY2(scn.nextDouble());
		System.out.println("������� �������� Z �������� �������");
		c.setZ2(scn.nextDouble());
		scn.close();
		System.out.println(String.format("%.2f", distanseTo(a,b)));
		if (sravneniye2(a,b) == false)
			System.out.println(computeArea(a,b,c));
		else
			System.out.println("�� ����� ��� ���������� �����");


	}
	
	public static double computeArea(Point3d a,Point3d b,Point3d c)
	{
		double ABx = b.getX2() - a.getX2();
		double ABy = b.getY2() - a.getY2();
		double ABz = b.getZ2() - a.getZ2();
		double ACx = c.getX2() - a.getX2();
		double ACy = c.getY2() - a.getY2();
		double ACz = c.getZ2() - a.getZ2();
		double forDeti = ABy * ACz - ABz * ACy;
		double forDetj = ABz * ACx - ABx * ACz; 
		double forDetk = ABx * ACy - ACx * ABy;
		double modulC = Math.sqrt(Math.pow(forDeti,2) + Math.pow(forDetj,2) + Math.pow(forDetk,2));
		double answer = 1.0/2 * modulC;
		return answer;
	}
}
