package day0110;

public class InterfaceTv {

	public static void main(String[] args) {
		
	}

}
class Tvcr extends Tv implements Ivcr{
	Vcr vcr = new Vcr();
	@Override
	public void play() {
		vcr.play();
	}
	@Override
	public void stop() {
		vcr.stop();
	}
	@Override
	public void reset() {
		vcr.reset();
	}
	@Override
	public void getCounter() {
		vcr.getCounter();
	}
	@Override
	public void setCounter(int c) {
		vcr.setCounter(c);
	}
}
class Tv{
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() {power =! power;}
	public void channelUp() {channel++;}
	public void channelDown() {channel--;}
	public void voulumUp() {volume++;}
	public void voulumDown() {volume--;}
	
}
class Vcr{
	void play() {
		System.out.println("Tape를 재생한다");
	}
	void stop() {
		System.out.println("Tape를 정지한다");
	}
	void reset() {
		System.out.println("Tape를 멈춤한다");
	}
	int getCounter() {
		return 0;
	}
	void setCounter(int c) {
		System.out.printf("현재 채널은 %d입니다",c);
	}
	
}
interface Ivcr{
	public void play();
	public void stop();
	public void reset();
	public void getCounter();
	public void setCounter(int c);
}