package studey;

public class Conditional05 {
	public static void main(String[] args) {
		/*
		 * 환불 신청 상태값
		 * 01 : 환불신청중
		 * 02 : 환불처리중
		 * 03 : 환불취소
		 * 04 : 계좌이체중
		 * 05 : 환불완료
		 */
		String rtCd= "02";
		
		switch(rtCd) {
		case "01":
		case "02":
		case "04":
			System.out.println("환불불가! 관리자에게 문의하세요.");
			System.out.println("환불상태 코드 :" + rtCd);
			System.out.println("문의전화  : 1544-1544");
		}
		
		if(rtCd == "01" || rtCd=="02" || rtCd=="04") {
			System.out.println("환불불가! 관리자에게 문의하세요.");
			System.out.println("환불상태 코드 :" + rtCd);
			System.out.println("문의전화  : 1544-1544");

		}
	}

}
