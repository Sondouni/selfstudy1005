package selfstudy04;
/*�������̽�
 * -�߻�Ŭ������ �κ������θ� �ϼ��� �̿ϼ� Ŭ�������
 * �������̽��� �����Ȱ��� �ƹ��͵� ���� �ر׸��� �׷����ִ� �⺻ ���赵�̴�
 * �߻�޼���� ������� �ɹ��� �������ִ�(�߿�!) �ֱٿ��� �����޼���� defualt �޼��嵵 ��밡�� (1.8����)
 * 
 */
/*
 * �������̽� �ۼ�
 * ��� ��������� public static final�̾�� �ϸ�, �̸� ������ ���ִ�.
 * ��� �޼���� public abstract�̾�� �ϸ�, �̸� ������ �� �ִ�.
 * interface �������̽� �̸�{
 * 			public static final Ÿ�� ����̸� = ��;
 * 			public abstract �޼����̸�(�Ű��������);
 */
public class InterfaceFightable3 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
//		Fightable f1 = (Fightable)new Fighter(); //(Fightable)��������-> �ڽ��� �θ𿡰� �ִ´�.
		if(f instanceof Unit) { //f�� unitŸ������ ����ȯ�� �����Ѱ�?
//			Unit u = (Unit)f;
			System.out.println("f�� UnitŬ������ �ڼ�");
		}
		if(f instanceof Fightable) { 
//			Fightable = (Fightable)f;
			System.out.println("f�� Fightable�������̽��� ����");
		}
		if(f instanceof Movable) { 
//			Movable m = (Movable)f;
			System.out.println("f�� Movable�������̽��� ����");
		
		}
		if(f instanceof Attackable) { 
//			Attackable a = (Attackable)f;
			System.out.println("f�� Movable�������̽��� ����");
		}
		if(f instanceof Object) { 
//			Object obj = (Object)f;
			System.out.println("f�� Object�� �ڼ�");
		}
		Attackable.print("asdsd");
		f.defualtTest();
	}

}
class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {/*�������*/} // ������ public�̹Ƿ� public �̾���Ѵ�
	public void attack(Unit u) {/*�������*/} 
	/*
	 * move�޼���� attack�޼��带 �������̵��ߴ�.
	 * �������̵� �Ҷ����� ������ �޼��庸��
	 * ���������� ���������ڸ� �����ؾ��Ѵ�
	 */
}
class Unit{
	int currentHP; //������ ü��
	int x,y; //������ ��ġ(x,y��ǥ)
}
interface Fightable extends Movable,Attackable{}//�������̽��� ���߻���� �����ϴ�.
interface Movable {
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);//�߻�޼��� �̹Ƿ� ���� �����ݷ�(;)����
	static void print(String str) {//�ֱٿ� �������̽����� ���� �޼��嵵 ����� ��������
		System.out.println("JAVA8");
	}
	default void defualtTest() {
		System.out.println("default");//�����޼���� �Բ� default�޼��嵵 ����� �����ؠ���.
	}
	
}
