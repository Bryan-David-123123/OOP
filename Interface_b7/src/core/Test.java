package core;

public class Test {
	public static void main(String[] args) {
		try {
			ResizeableCircle hihi=new ResizeableCircle(1.0);
			hihi.nhap();
			System.out.println(hihi.radius);
			System.out.println(hihi.getPerimeter());
			System.out.println(hihi.getArea());
		}
		catch(Exception a){
			a.printStackTrace();
		}
		finally {
			System.out.println("DONE!");
		}
		
		
}
}
