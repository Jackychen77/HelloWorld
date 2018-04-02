package ex3;

public class Rect {
	int len;
	int wide;
	int s;
	int p;
	public Rect(int len,int wide){
		setLen(len);
		setWide(wide);
	}
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}
	public int area_S(){
		s=len *wide;
		return s;
	}
	public int perimeter(){
		p = len + wide;
		return p;
	}
	public void printInfo(){
		System.out.println("area_S:"+ s);
		System.out.println("perimeter:" + p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect rect1 = new Rect(4,8);
		rect1.area_S();
		rect1.perimeter();
		rect1.printInfo();
	}

}
