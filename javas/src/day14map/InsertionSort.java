package day14map;

public class InsertionSort {

	public static void main(String[] args) {
		int ar[]= {8,1,2,5,4,3,6,7};
		int idx,tmp;
		for(int i=1;i<ar.length; i++) {
			idx=i;
			for(int j=i-1; j>=0; j--) {
				if(ar[j]>ar[idx]) {
					tmp=ar[j];
					ar[j]=ar[idx];
					ar[idx]=tmp;
					idx=j;
					
				}
			}
		}
		System.out.println("정렬 후");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
