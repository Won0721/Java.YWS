package practice;

public class AnimalEx2 {	public static void main(String[] args) {
	Animal lion1 = new Lion();
	Animal rabbit1 = new Rabbit();
	Animal monkey1 = new Monkey();
	ZooKeeper james = new ZooKeeper();
	
	james.feed(lion1);
	james.feed(monkey1);
	james.feed(rabbit1);
	System.out.println(lion1);
}

}
class Animal{
	void breath() {
		System.out.println("숨쉬기");}	
	}

class Lion extends Animal{
	public String toString() {
		return "사자5";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "토끼5";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "원숭이5";
	}
}

class ZooKeeper{
	void feed(Animal animal) {  //animal 객체
		System.out.println(animal+"에게먹이주기");
	}




}

