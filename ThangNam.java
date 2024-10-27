package Nam;

import java.util.Scanner;

public class ThangNam {
	public static void main(String[] args) {
		int thang;
		int nam;
	Scanner sc= new Scanner(System.in);
		System.out.println("Nhap thang: ");
		thang=sc.nextInt();
		System.out.println("Nhap nam: ");
		nam=sc.nextInt();
		
		switch(thang){
			case 4: case 6: case 9: case 11:
				System.out.println("Tháng có 30 ngày");
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Tháng có 31 ngày");
			    break;
			case 2:
				if((nam%4==0 && nam%100!=0) || nam%400==0) {
					System.out.println("Tháng có 29 ngày");
				}
				else
					System.out.println("Tháng có 28 ngày");
				    break;
				default:
				     System.out.println("Thang khong hop le");
				     break;
		}
		
	}

}
