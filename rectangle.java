
public class rectangle {

	double height, width;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle(25, 35);
		System.out.println("Area = " + r1.area());
	}
	
	rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	double area() {
		return this.width * this.height;
	}

}
