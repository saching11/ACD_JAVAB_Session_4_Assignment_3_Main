package EncapsulationPackage;
import java.util.Scanner;
import EncapsulationPackage.EmployeeDetails;

public class TestEmployeeDetails  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeDetails ed = new EmployeeDetails();
		System.out.println("Enter Employee Details");
		System.out.println("Address");
		ed.setAddress(sc.nextLine());
		System.out.println("Email");
		ed.setEmail(sc.nextLine());
		System.out.println("Name");
		ed.setEmployeeName(sc.nextLine());
		System.out.println("Gender");
		ed.setGender(sc.nextLine());
		System.out.println("Age");
		ed.setAge(sc.nextInt());
		
		System.out.println("Address " + ed.getAddress());
		System.out.println("Email " + ed.getEmail());
		System.out.println("Name " + ed.getEmployeeName());
		System.out.println("Gender " + ed.getGender());
		System.out.println("Age " + ed.getAge());
		
				
	}

}
