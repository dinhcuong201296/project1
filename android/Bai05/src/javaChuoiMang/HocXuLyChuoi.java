package javaChuoiMang;
public class HocXuLyChuoi {

	public static void main(String[] args) {
 
		String s="5 Topica Education ";
		System.out.println("Chieu dai cua chuoi la="+s.length());
		// Đếm xem chuỗi có bao nhiêu ký tự in hoa inn thường?
		char []arr=s.toCharArray();
		int soInHoa=0;
		int soInThuong=0;
		int soChuSo=0;
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			if(Character.isUpperCase(c))
			{
				soInHoa++;
			}
			if(Character.isLowerCase(c)) 
			{
				soInThuong++;
			}
			if(Character.isDigit(c))
			{
				soChuSo++;
			}
		}
		System.out.println("So in hoa"+soInHoa +" ky tu in hoa");
		System.out.println("So in thuong"+soInThuong +" ky tu in thuong");
		System.out.println("So chu so"+soChuSo +" ky tu so");
	}

}
