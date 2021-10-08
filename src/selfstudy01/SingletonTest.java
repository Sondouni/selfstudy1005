package selfstudy01;
//�������� ����������
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
	private static Singleton instance;//private �̹Ƿ� ������ �Ҽ�����.
	private Singleton() {//�������� ���������ڸ� private�� �����ϸ�, �ܺο��� �����ڿ� �����Ҽ� ��� �ν��Ͻ��� �����Ҽ� ����.
		
		
	}
	//�ν��Ͻ��� �������� �ʰ� ȣ���Ҽ� �־���ϰ� ������ static�̿��� �Ѵ�.
	public static Singleton getInstance() {//�ν��Ͻ��� ��ȯ//static�޼��� �ȿ��� Ŭ���� ��������� �����ְ�, �ν��Ͻ������� ����Ҽ��� ����. 
		if(instance == null)//������ �ν��Ͻ��� ������ �ν��Ͻ��� ��������
			instance = new Singleton();//������ �ν��Ͻ��� ������ ���θ����� ���� ������ �ν��Ͻ��� ����
		return instance;//������ ���������� �̿��Ҷ��� static�޼��带 �̿�
	}
}
//�������� ����
//Ŭ������ ����Ҽ��ִ� ������ ��� ����������,final,static,abstrict
//�޼��尡 �����Ҽ��ִ� ������	 ��� ����������, inal.,static,abstrict	

//��� ��������� ����Ҽ��ִ� ������
//������� ������,final
	