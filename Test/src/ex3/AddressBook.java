package ex3;

public class AddressBook {
	String name;
	String adr;
	String tel;
	public AddressBook(String name,String adr,String tel){
		setName(name);
		setAdr(adr);
		setTel(tel);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public void printInfo(){
		System.out.println("name:"+name);
		System.out.println("adr:"+adr);
		System.out.println("tel:"+tel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook a = new AddressBook("jacky","shenzhen","13750039598");
		a.printInfo();
		
	}

}
