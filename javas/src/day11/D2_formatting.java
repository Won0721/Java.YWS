package day11;
// formatting : 데이터의 형식을 지정하는 것을 의미

import java.text.DecimalFormat;

public class D2_formatting {
	public static void main(String[] args) {
		String []pattern = {
				"###.###"
				,"000.000"
				,"-###.###"
				,"00000.00%"
		};
		
		double []arr= {
				1.3
				,3.3
				,124.243
				,242
		};
		
		for(int p=0; p<pattern.length; p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);
			System.out.println("<<<"+pattern[p]+">>>");
			for(int i=0;i<arr.length;i++) {
				System.out.println(d.format(arr[i]));
			}
		}
	}

}
