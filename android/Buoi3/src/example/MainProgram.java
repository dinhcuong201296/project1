package example;

public class MainProgram {

	public static void main(String[] args) {

		Job job1 = new Job(1, "HR");
		Job job2 = new Job(2, "CEO");
		Job job3 = new Job(3, "DEV");
		Job job4 = new Job(4, "Tester");
		Job job5 = new Job(5, "BA");
		Employee employee1 = new Employee("Nguyen Van A", 1, 25, false , job1);
		Employee employee2 = new Employee("Nguyen Van B", 2,  26, false, job2);
		Employee employee3 = new Employee("Nguyen Van C", 3, 27, true, job3);;
		Employee employee4 = new Employee("Nguyen Van D", 4, 28, false, job4);
		Employee employee5 = new Employee("Nguyen Van E", 5, 29, true, job5);


		
		Employee[] employee = new Employee[6];
	
		employee[0]= employee1;
		employee[1]= employee2;
		employee[2]= employee3;
		employee[3]= employee4;
		employee[4]= employee5;
		System.out.println("Mang: "+employee.length+"phan tu");
		System.out.println("Cac phan tu cua mang");
		System.out.println("------Thong tin emplyee---");
		System.out.println("ID   Name    Age");
		System.out.println(employee[4].id +" " +  employee[4].name+" "+  employee[4].age);
		String bh1 = "d:/music/nhactrinh/riengmotgoctroi.mp3";
		int vtcuoi = bh1.lastIndexOf("/");
		String tenBaiHat = bh1.substring(vtcuoi+1);
		System.out.println("ten bai hat la: "+tenBaiHat);
		int vtCuoi = bh1.lastIndexOf(".");
		String tenBaiHat1 = bh1.substring(vtcuoi+1,vtCuoi );
		System.out.println("ten bai hat k duoi la: "+tenBaiHat1);
	}

}
