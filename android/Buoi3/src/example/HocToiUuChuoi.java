package example;

public class HocToiUuChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Nguyen         Van   Teo";
		s=s.trim();
		String []arr= s.split(" ");
		String sToiUu=" ";
		for (String tu : arr) {
			if(tu.trim().length()!=0)
			sToiUu += tu + " ";
			
		}
		sToiUu = sToiUu.trim();
		System.out.println(sToiUu);
		

	}

}
