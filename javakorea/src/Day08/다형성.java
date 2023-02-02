package Day08;

public class 다형성 {
	public static void main(String[] args) {
		fruit a = new apple("사과", 3000);
		fruit b = new orange("오렌지",5000);
		
		a.print();
		b.print();
	}
}

class fruit {
	public String name;
	public int price;

	fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	void print(){
		System.out.println("print : fruit");
	}
}

class apple extends fruit{
	apple(String name, int price) {
		super(name, price);
	}

	@Override
	void print() {
		System.out.println("Print:"+this.name+"는 "+super.price+"원");
	}
}

class orange extends fruit {
	orange(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void print() {
		System.out.println("Print:"+super.name+"는 "+super.price+"원");
	}
}