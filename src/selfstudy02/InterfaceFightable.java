package day0110;

public class InterfaceFightable {

	public static void main(String[] args) {

	}
/*
 * �������̽� ���� �������̽��� ��Ӱ���(��������)
 * fightable ��ü���� ���ǵ� ����� �ϳ��� ������ ���� �������̽��κ��� ��ӹ��� �ΰ��� �߻�޼���
 * void move(int x,int y);�� void attack(unit u)�� ����� �����Եȴ�.
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