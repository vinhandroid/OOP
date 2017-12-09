package vinhpv.tgg.java;

public class TestClass {

	public static void main(String[] args) {
		SoftwareHouse sh= new SoftwareHouse("Objects - R - Us");
		
		Programmer p1 = new Programmer(123, 2000, "John", "Ada") ;
		Programmer p2 = new Programmer(234, 2500, "Ken", "C++");
		Programmer p3 = new Programmer(456, 3000, "Peter", "Java") ;
		
		sh.hire(p1);
		sh.hire(p2);
		sh.hire(p3);
		
		//Hiển thị tất cả các lập trình viên trong công ty
		sh.displayStaff();
		
		//Nhân viên hiển thị thông tin của mình
		//p1.display();
		
	}

}
