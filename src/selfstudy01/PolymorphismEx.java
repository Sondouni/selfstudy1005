package selfstudy01;
/**
 * ������? 
 * �������� �������� Ŭ������ �ϳ��� �θ� Ŭ���� ��ü�� ���հ����Ͽ� ȿ������ ���ΰ�
 * �� ������ ������ �ݵ�� �� Ŭ������ �θ�� ���ƾ� �Ѵ�
 * ���������� ���� �߿��� ���� �θ� ��ü�� �ڽ� Ŭ������ �ν��Ͻ��� ���������� � ����� ����Ҽ� �ְ�
 * � �����Ϳ� ���� ���������� �Ǻ��� ���°�
 */
/*
 * class A{...}
 * class B extends A{..}
 * class C extends A{..}
 * B�� C Ŭ������ A��� Ŭ�������� ��ӹ޾Ҵ�.
 * A ap = new A(); //�Ϲ��� Ŭ���� �������
 * A ap = new B(); //������ ǥ�� ���ɽ���??????
 * A ap = new C(); //������ ǥ��
 * �ڽ��� Ŭ���� ��ü�� �ƴ����� �ڽ��� �θ� Ŭ������� �ν��Ͻ��� �θ�ü�� ������ �ִ�.
 */
public class PolymorphismEx {

	public static void main(String[] args) {
		/*
		 * A3 ap = new A3();
		 * B3 bp = new B3();
		 * System.out.println("ap= " +ap);
		 * System.out.println("bp= " +bp);
		 */
		Object[] obj = new Object[2];//��� Ŭ������ ObjectŬ������ ��� 
		obj[0] = new A3();
		obj[1] = new B3();
		for(int i =0;i<obj.length;i++) {
			System.out.println("obj["+i+"]="+obj[i]); //obj[i].toString()�� ����
		}
		
	}
}	
class A3 {//extends Object�� �����Ѱ�
	public String toString() {//�������̵�
		return "A3Ŭ����";
	}
}
class B3{
	public String toString() {//�������̵�
		return "B3Ŭ����";
	}
}
