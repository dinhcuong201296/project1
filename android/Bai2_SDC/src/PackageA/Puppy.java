package PackageA;

import importTest.TestImport;

public class Puppy {
	public  Puppy(String name) {
		System.out.println("Ten cua no la:"+ name);
	}
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("John");
		
		
		System.out.println("Gia tri cua Puppy la"+TestImport.PI);
	}

}
