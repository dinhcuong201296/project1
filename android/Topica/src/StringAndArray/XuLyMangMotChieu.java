package StringAndArray;

import java.util.Arrays;
public class XuLyMangMotChieu {

	public static void main(String[] args) {

		int [] M = new int[4];
		int [] N= new int[4];
		N[0]= 0;
		N[1]= 3;
		
		N[2]=9;
		N[3]=12;
		M[0]=1;
		M[1]=5;
		M[2]=9;
		M[3]= 14;
		int [][] H = new int[3][4];
		H[0][0]=4;
		H[0][1]=5;
		System.out.println("Mang da nhap vao la:");
		for(int i=0; i <M.length;i++)
		{
			System.out.print(M[i]+"\t");
			
		}
		Arrays.sort(M);
		System.out.println("\nMang sau khi da sap xep la:");
		for(int i=0; i <M.length;i++)
		{
			System.out.print(M[i]+"\t");
			
		}
		System.out.println("\nCac so nguyen to la: ");
		for(int i=0; i <M.length;i++)
		{
		 int dem = 0;
		 for(int j=0; j<=M[i];j++)
		 {
			 if(M[i]%j==0)
			 {
				 dem++;
			 }
			 
		 }
		 if(dem==2)

			 System.out.println(M[i]+"\t");
		}
	}

}
