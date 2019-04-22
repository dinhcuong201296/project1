package StringAndArray;

public class TenBaiHat {
	public static void Main(String agrs[]) {
		String bh1 = "d:/music/nhactrinh/riengmotgoctroi.mp3";
		int vtcuoi = bh1.lastIndexOf("/");
		String tenBaiHat = bh1.substring(vtcuoi+1);
		System.out.println("ten bai hat la"+tenBaiHat);
	}

}
