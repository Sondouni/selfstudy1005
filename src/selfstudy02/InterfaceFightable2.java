package day0110;

public class InterfaceFightable2 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�");
		}
		if(f instanceof FightAble) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�");
		}
		if(f instanceof MoveAble) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�");
		}
		if(f instanceof AttackAble) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�");
		}
		if(f instanceof Object) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�");
		}
	}
}
class Fighter extends Unit implements FightAble,MoveAble{
	@Override
	public void attack(Unit u) {
	}
	@Override
	public void move(int x, int y) {
	}
}