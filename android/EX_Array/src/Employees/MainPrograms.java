package Employees;

public class MainPrograms {

	public static void main(String[] args) {

		Job job1 = new Job(1, "HR");
		Job job2 = new Job(2, "Tester");
		Job job3 = new Job(3, "Fresher");
		Job job4 = new Job(4, "QA");
		Employee employee1 = new Employee("Nguyen Van Nam", 1, 1000, 21, true, job1);
		Employee employee2 = new Employee("Nguyen Van Hung", 2, 2000, 32, true, job2);
		Employee employee3 = new Employee("Nguyen Van Ngoc", 3, 3000, 25, true, job3);
		Employee employee4 = new Employee("Nguyen Van Cuong", 4, 1500, 27, true, job4);
		Employee employee5 = new Employee("Nguyen Van Hai", 5, 1400, 29, false, job1);
		Employee employee6 = new Employee("Nguyen Van Dang", 6, 1600, 21, false, job1);
		
		Employee[] employees = new Employee[6];
		employees[0]= employee1;
		employees[1]= employee2;
		employees[2]= employee3;
		employees[3]= employee4;
		employees[4]= employee5;
		employees[5]= employee6;
		System.out.println("--------Thong tin nhan vien---------");
		System.out.println("Name           ID    Salary     Age      Married     ");
		System.out.println(employees[0].name +" " +  employees[0].id+"    "+  employees[0].Salary+"     "+employees[0].age+"    "+employees[0].married);
		
		
	}

}
