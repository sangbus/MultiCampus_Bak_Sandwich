
public class num_4673 {

	public static void main(String[] args) {
		int[] arr = new int[50000];
		for(int i=0;i<10000;i++)
		{
			arr[i]=i;
		}
		for(int i=0;i<10000;i++)
		{
			int a = 0;
			
			if(i<10)
			{
				a=i*2;
			}
			
			else if(i<100)
			{
				a=(i)+(i/10)+(i%10);
			}
			
			else if(i<1000)
			{
				a=(i)+(i%100/10)+(i%10)+(i/100);
			}
			
			else if(i<10000)
			{
				a=(i)+(i%100/10)+(i%10)+(i%1000/100)+(i/1000);
			}
			arr[a]=0;
		}
		for(int b:arr)
		{
			if(b!=0&&b<=10000) 
			{
				System.out.println(b);
			}
		}

	}

}
