package day09;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("각 도형의 면적");
		System.out.println("가로 : "+7+", 세로 : "+8+"-------");
		Rectangle rt = new Rectangle();
		rt.area(7, 8);
		Triangle tr = new Triangle();
		tr.area(7, 8);
		//Circle cr = new Circle();
		Circle cr = new SubCircle();
		cr.area(7, 8);
		((SubCircle)(cr)).area(8);
		SubCircle sc = new SubCircle();
		sc.area(8);
		System.out.println("=====배열에 넣기=====");
		Shape sh[] = {rt,tr,sc};
		for(Shape shape : sh)
		{
			if(shape instanceof SubCircle)
				((SubCircle)(shape)).area(7);
			else
				shape.area(7, 8);
		}
	}

}
