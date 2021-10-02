package day0110;

public class InterfaceFightable {

	public static void main(String[] args) {

	}
/*
 * 인터페이스 또한 인터페이스를 상속가능(다중으로)
 * fightable 자체에는 정의된 멤버가 하나도 없지만 조상 인터페이스로부터 상속받은 두개의 추상메서드
 * void move(int x,int y);와 void attack(unit u)를 멤버로 가지게된다.
 */
}
interface FightAble extends MoveAble, AttackAble{}
	
interface MoveAble{
	void move(int x,int y);
}
interface AttackAble{
	void attack(Unit u );
}
class Unit{
	int hp;
	int x,y;
}