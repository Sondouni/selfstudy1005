package day0917;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random rd = new Random();
		Random rd1 = new Random();
		Random rd2 = new Random(2);
		Random rd3 = new Random(2);
		for (int i = 0; i<5; i++) {
			System.out.println("�⺻������"+rd.nextInt(10));
		}
		for (int i = 0; i<5; i++) {
			System.out.println("�⺻������2"+rd1.nextInt(10));
		}
		for (int i = 0; i<5; i++) {
			System.out.println("rd2 ������"+rd2.nextInt(10));
		}
		for (int i = 0; i<5; i++) {
			System.out.println("rd3������"+rd3.nextInt(10));
		}
		System.out.println(System.currentTimeMillis());
	}

}
