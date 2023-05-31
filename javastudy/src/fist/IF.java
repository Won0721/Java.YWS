package fist;

public class IF {

	public static void main(String[] args) {
		int age = 8;
		if(age >=8){
			System.out.println("학교다녀");
			
		}
		else {
			System.out.println("안다녀");
		}
		
//		switch-case 문 : 하나의 값으로 표현될수 있을때
		int rank =1;
		char medalColor = 0;
		switch(rank) {
			case 1 : medalColor = 'G';
					 break;
			case 2 : medalColor = 'S';
					 break;
			case 3 : medalColor = 'B';
					 break;
			case 4 : medalColor = 'A'; // default : medalColor = 'A'; 도 가능
					 break;
			
		}
		System.out.println(rank + "등 메달의 색깔은" + medalColor + "입니다");
	}

}
