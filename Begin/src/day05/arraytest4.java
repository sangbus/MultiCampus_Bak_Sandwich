package day05;

public class arraytest4 {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
				System.out.print(a[i][k]+" ");
			System.out.println();
		}
		for(int aa[] : a)
		{
			for(int aaa : aa)
				System.out.print(aaa+" ");
			System.out.println();
		}
		char[][] ch = new char[3][];
		ch[0]=new char[2];
		ch[1]=new char[3];
		ch[2]=new char[4];
		
		ch[0][0] = 'J';
		ch[0][1] = 'J';
		
		ch[1][0] = 'B';
		ch[1][1] = 'y';
		ch[1][2] = 'e';
		
		ch[2][0] = 'A';
		ch[2][1] = 'B';
		ch[2][2] = 'C';
		ch[2][3] = 'D';
		
		for(char bb[] : ch)
		{
			for(char bbb: bb)
				System.out.println(bbb+" ");
			System.out.println();
		}
		
		double arr[][][] = {{{1,2,3},{1,1,1},{1,1,1}},{{10},{20}} };
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}
