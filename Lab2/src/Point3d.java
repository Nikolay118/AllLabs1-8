
public class Point3d extends Point2d {
	private double x2Coord;
	private double y2Coord;
	private double z2Coord;
	public Point3d(double x,double y,double z)
	{
		x2Coord = x;
		y2Coord = y;
		z2Coord = z;
	}
	public Point3d()
	{
		this(0.0,0.0,0.0);
	}
	
	public void setX2(double val){
		x2Coord = val;
	}
	
	public void setY2(double val){
		y2Coord = val;
	}

	public void setZ2(double val){
		z2Coord = val;
	}
	
	public double getX2()
	{
		return x2Coord;
	}
	
	public double getY2()
	{
		return y2Coord;
	}
	
	public double getZ2()
	{
		return z2Coord;
	}
	
	public static boolean sravneniye2(Point3d a,Point3d b)
	{
		if ((a.getX2() == b.getX2()) && (a.getY2() == b.getY2()) && (a.getZ2() == b.getZ2()))
			return true;
		else 
			return false;
	}
	
	public static double distanseTo(Point3d a,Point3d b)
	{
		double ABx = b.getX2() - a.getX2();
		double ABy = b.getY2() - a.getY2();
		double ABz = b.getZ2() - a.getZ2();
		double answer = Math.sqrt(Math.pow(ABx, 2) + Math.pow(ABy, 2) + Math.pow(ABz, 2));
		return answer;
	}
	
	
}
