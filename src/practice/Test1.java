package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.EqualsAndHashCode;

public class Test1 {
	public static void main(String[] args) {
		List<Apple> list = new ArrayList<Apple>();

		list.add(new Apple("RED",1,1));
		list.add(new Apple("RED",2,2));
		list.add(new Apple("RED",3,3));
		list.add(new Apple("RED",4,4));
		list.add(new Apple("BLUE",2,5));
		list.add(new Apple("RED",5,6));
	
		
		Stream<Apple> st = list.stream();
		
		List<Apple> filtered =
		st.filter(apple -> apple.getColor().equals("RED"))
		.filter(apple -> apple.getWeight() >=3)
		.collect(Collectors.toList());
		filtered.forEach(System.out::println);
			
				
		
	}

}

class Apple{
	String color;
	int weight;
	int uid;
	
	public Apple(String color, int weight, int uid) {
		this.color = color;
		this.weight = weight;
		this.uid = uid;
	}
	


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", uid=" + uid + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, uid, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(color, other.color) && uid == other.uid && weight == other.weight;
	}
	
	
	
	
}
