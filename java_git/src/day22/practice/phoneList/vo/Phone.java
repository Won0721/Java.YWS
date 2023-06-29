package day22.practice.phoneList.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Phone {
	private String name;
	private String phoneNumber;
	
	
	public Phone(Phone p) {
		this.name = p.name;
		this.phoneNumber = p.phoneNumber;
	}
	
	public void print() {
		System.out.println(this.name + "\t" + this.phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}
	
	
}
