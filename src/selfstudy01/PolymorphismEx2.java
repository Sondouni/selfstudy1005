package selfstudy01;
/*
 * ������ ǥ������ �ɹ��� ���� ���ٱ�����
 * �θ� Ŭ������ �������ִ� ��� �ɹ��� ���ٰ���
 * �� �ڽ�Ŭ�������� �������̵��� �ߴٸ� �������̵��� �� �ڽĿ��� �����̵ȴ�..????
 * �ɹ��ʵ��� ��� �θ�Ŭ������ �ɹ��ʵ忡�� �����Ҽ� �ִ� (�ʵ�� �Ӽ�, �������� �ǹ�)
 * �ڽ� Ŭ���� �ɹ��ʵ�� �������̵��� �� �ڽ� Ŭ������ �޼��忡 ���ؼ��� �����Ҽ� �ִ�.
 * ������ �������̵��� �ȵȴ� ((��Ӱ� �پ缺�� ���κ�����))
 */
public class PolymorphismEx2 {
	public static void main(String[] args) {
		Parent4 p = new Child4();
		System.out.println("x= "+ p.x);
//		System.out.println("x= "+ p.x);	�ڽ��� �θ� ������ �θ�Ŭ���� �ȿ� �ִ°͵鸸 ������ �����ϴ�
//		System.out.println("y= "+ p.y); ������ ���� �߻�
		//�ڼ�Ÿ��(sub)->����(super):����ȯ ���� ����
		//�ڼ�Ÿ��(sub)<-����(super):����ȯ ���� �Ұ���
		System.out.println("y = "+ ((Child4)p).y);
	}
}
class Parent4{
	int x = 100;
//	int y = 200;
}
class Child4 extends Parent4{
	int x = 200;
	int y = 400;
}