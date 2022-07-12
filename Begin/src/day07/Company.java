package day07;

public class Company {
	private String education,location,name;	//학력,지역,회사이름
	private int graduate;			//학점
	public Company()
	{
		
	}
	public void Company(int graduate)
	{
		education = "고졸";
		this.graduate = graduate;
		location = "부산";
		name = "삼성";
	}
	public void Company(String education, int graduate)
	{
		this.education = education;
		this.graduate = graduate;
		location = "부산";
		name = "삼성";
	}
	public void setEducation(String education)
	{
		this.education = education;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setGraduate(int graduate)
	{
		this.graduate = graduate;
	}
	public String getEducation()
	{
		return education;
	}
	public String getLocation()
	{
		return location;
	}
	public String getName()
	{
		return name;
	}
	public int getGraduate()
	{
		return graduate;
	}
	
	/**메소드*/
	public void Gwork(double Gcompany,double Gjob)
	{
		if(Gcompany<=Gjob)
			System.out.println("학점 합격입니다.");
	}
	public void Ework(String Ecompany,String Ejob)
	{
		if(Ecompany==Ejob)
			System.out.println("학력 합격입니다.");
	}
}
