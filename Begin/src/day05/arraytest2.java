package day05;

public class arraytest2 {

	public static void main(String[] args) {
		float[] a = new float[3];
		float result =0;
		a[0] = -16.456f;
		a[1] = 200.5f;
		a[2] = 30e+3f;
		for(int i=0;i<a.length;i++)
		{
			result+=a[i];
		}
		System.out.println("총합은 : "+result);
		System.out.println("평균값은 : " + result/a.length);
	}

}
