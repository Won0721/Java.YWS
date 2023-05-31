package day14map;

// 선택정렬(Selection Sort)
// 삽입정렬(Insertion Sort)
// 버블정렬(Buble Sort)

// 선택정렬 : 최소값 혹은 최대값을 선택해서 가장 앞에다가 위치하여 선택할 위치를 이동하며 정렬하는 방법
// 구현이 쉽지만 다른 정렬에 비해 시간이 오래걸린다.
public class SelectionSort {
	public static void main(String[] args) {
			int min,tmp;
			int ar[]= {8,1,2,5,4,3,6,7};
			System.out.println("---정렬 전 ---");
			for(int i=0; i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
			System.out.println();
			for(int i=0; i<ar.length-1;i++) {
				min = i;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[min]>ar[j]) {
						tmp = ar[min];
						ar[min] = ar[j];
						ar[j] = tmp;
						
					}
				}
			}
			
			System.out.println("---정렬 후---");
			for(int i=0; i<ar.length;i++) {
				System.out.print(ar[i]+" ");
				
			}
			
		
	}

}
