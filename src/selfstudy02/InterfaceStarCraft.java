package day0110;

public class InterfaceStarCraft {

	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip ds = new DropShip();
		Marine mr = new Marine();
		Scv scv = new Scv();
		Medic md = new Medic();
		scv.repair(tank);
		scv.repair(ds);
		scv.repair(scv);
		
		md.heal(md);
		md.heal(scv);
		md.heal(mr);
		
	//  scv.repair(marine은 안됨)	
	}
}
interface Repairable{}
class Unit1{
	int hitpoint;
	final int MAX_HP;
	Unit1(int hp){
		MAX_HP = hp;
	}
}
class GroundUnit extends Unit1{
	GroundUnit(int hp) {
		super(hp);
	}
}
class AirUnit extends Unit1{
	AirUnit(int hp) {
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends GroundUnit implements Repairable{
	DropShip(){
		super(200);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine extends GroundUnit implements Healable{
	Marine(){
		super(40);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}
class Scv extends GroundUnit implements Repairable,Healable{
	Scv(){
		super(60);
		hitpoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit1) {
			Unit1 u = (Unit1)r;
			while(u.hitpoint!=u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	public String toString() {
		return "SCV";
	}
}
interface Healable{}
class Medic extends GroundUnit implements Healable{
	Medic(){
		super(50);
		hitpoint = MAX_HP;
	}
	void heal(Healable h) {
		if(h instanceof Unit1) {
			Unit1 u = (Unit1)h;
			while(u.hitpoint!=u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString() + "의 치료가 끝났습니다.");
		}
	}
	public String toString() {
		return "Medic";
	}
	
}