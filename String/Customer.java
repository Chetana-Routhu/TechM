package abstraction;

public class Customer {
	int cid;
	String cname;
	Saloon sa;
	public Customer(int cid,String cname,Saloon sa) {
		this.cid = cid;
		this.cname = cname;
		this.sa = sa;
		
	}
	public void display1() {
		System.out.println("Customer id :"+cid);
		System.out.println("Customer name:"+cname);
		sa.display();
		
	}

	public static void main(String[] args) {
		Saloon saloon=new Saloon("Vcare","vizag");
		Customer cust = new Customer(5455,"shiva",saloon);
		cust.display1();
		
	}

}
