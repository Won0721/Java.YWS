package day04;

public class Day2_Abstract {
	public static void main(String[] args) {
		Pokemon pokemon = new Pikachu();
		System.out.println("이 포켓몬은:"+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		System.out.println();
		
		pokemon = new Squirtle();
		System.out.println("이 포켓몬은:"+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		
		
		
	}

}
abstract class Pokemon{
	String name;
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}	
}
class Pikachu extends Pokemon{
	Pikachu(){
		this.name = "피카츄";
	}
	@Override
	void attack() {
		System.out.println("전기공격");
		
	}

	@Override
	void sound() {
		System.out.println("피카피카");
	}	
}
class Squirtle extends Pokemon{
	Squirtle(){
		this.name = "꼬부기";
	}
	void attack() {
		System.out.println("물대포 공격");
	}
	void sound() {
		System.out.println("꼬북꼬북");
	}
}
 
