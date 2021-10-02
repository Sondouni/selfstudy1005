package day20210928;
//생성자의 접근제어자
public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
class Singleton{
	private static Singleton instance;//private 이므로 접은은 할수없다.
	private Singleton() {//생성자의 접근제어자를 private로 지정하면, 외부에서 생성자에 접근할수 없어서 인스턴스를 생성할수 없다.
		
		
	}
	//인스턴스를 생성하지 않고도 호출할수 있어야하게 때문에 static이여만 한다.
	public static Singleton getInstance() {//인스턴스를 반환//static메서드 안에는 클래스 멤버변수를 쓸수있고, 인스턴스변수는 사용할수ㅡ 없다. 
		if(instance == null)//생성된 인스턴스가 없으면 인스턴스를 생성하자
			instance = new Singleton();//생성된 인스턴스가 있으면 새로만들지 말고 기존의 인스턴스를 리턴
		return instance;//공동의 업무로직을 이용할때는 static메서드를 이용
	}
}
//제어자의 조합
//클래스가 사용할수있는 제어자 모든 접근제어자,final,static,abstrict
//메서드가 접근할수있는 제어자	 모든 접근제어자, inal.,static,abstrict	

//모든 멤버변수가 사용할수있는 제어자
//모든접근 제어자,final
	