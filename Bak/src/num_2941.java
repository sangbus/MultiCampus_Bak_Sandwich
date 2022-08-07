import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alp = br.readLine();
		int result = 0;
		for(int k=0;k<alp.length();k++)
		{
			
			if(alp.charAt(k)=='c')
			{
				if(k<alp.length()-1)
				{
					if(alp.charAt(k+1)=='=')
					{
						k++;
					}
					else if(alp.charAt(k+1)=='-')
					{
						k++;
					}
				}
			}
			
			
			else if(alp.charAt(k)=='d')
			{
				if(k<alp.length()-1)
				{
					if(alp.charAt(k+1)=='-')
					{
						k++;
					}
					else if(alp.charAt(k+1)=='z')
					{
						if(k<alp.length()-2)
						{
							if(alp.charAt(k+2)=='=')
							{
								k+=2;
							}
						}
					}
				}
			}
			
			
			else if(alp.charAt(k)=='l')
			{
				if(k<alp.length()-1)
				{
					if(alp.charAt(k+1)=='j')
						k++;
				}
			}
			
			else if(alp.charAt(k)=='n')
			{
				if(k<alp.length()-1)
				{
					if(alp.charAt(k+1)=='j')
						k++;
				}
			}
			
			else if(alp.charAt(k)=='s')
			{
				if(k<alp.length()-1)
				{
					if(alp.charAt(k+1)=='=')
						k++;
				}
			}
			
			else if(alp.charAt(k)=='z')
			{
				if(k<alp.length()-1)
				{
					if(alp.charAt(k+1)=='=')
						k++;
				}
			}
			
			result++;
		}
		
		System.out.println(result);
	}

}
