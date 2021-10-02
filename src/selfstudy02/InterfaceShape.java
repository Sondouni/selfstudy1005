package day0110;

public class InterfaceShape {
	public static void main(String[] args) {

	}

}
class Shape{
		protected int x,y;
}
interface Drawable{
		void draw();
}
class REctangle extends Shape implements Drawable{
		int width, heigth;
		public void draw() {
			System.out.println("Rectangle Draw");
		}
	
}