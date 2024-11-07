package core;

public class ResizeableCircle extends Circle implements Resizable{
	
	public ResizeableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		this.radius=this.radius*percent;
		System.out.println(radius);
	}
	
	

}
