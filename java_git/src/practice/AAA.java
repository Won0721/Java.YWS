package practice;

public class AAA {	public static void main(String[] args) {
	Animal lion1 = new Lion();
	Animal rabbit1 = new Rabbit();
	Animal monkey1 = new Monkey();
	ZooKeeper james = new ZooKeeper();
	
	james.feed(lion1);
	james.feed(monkey1);
	james.feed(rabbit1);
	
}

}
class Animal{
	void breath() {
		System.out.println("숨쉬기");}	
	}

class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper{
	void feed(Animal animal) {  //animal 객체
		System.out.println(animal+"에게먹이주기");
	}




}

