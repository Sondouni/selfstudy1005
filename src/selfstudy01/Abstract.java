package day20210928;

public class Abstract {
	public static void main(String[] args) {

	}

}
abstract class Shape{
	private int x,y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw();
}
class Rectangle extends Shape{
	private int width, height;
	public void draw() {
		System.out.println("사각형 그리기");
	}
}
class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("원 그리기");
	}
}