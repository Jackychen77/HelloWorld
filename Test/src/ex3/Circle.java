package ex3;

public class Circle {
	int r;
	double s;
	double p;
	public Circle(int r){
		setR(r);
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}


	public double area_S(){
		s=3.14 *r*r;
		return s;
	}
	public double perimeter(){
		p = 2 * 3.14 *r;
		return p;
	}
	public void printInfo(){
		System.out.println("area_S:"+ s);
		System.out.println("perimeter:" + p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(4);
		circle1.area_S();
		circle1.perimeter();
		circle1.printInfo();
	}
}
