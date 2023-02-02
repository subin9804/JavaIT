package Day08;

// 화면에 출력하는 부분
public class View {
	public static void main(String[] args) {
		Model model = new Model(3000,"아메리카노");		// Model 클래스에 있는 변수를 추가한 셈
		Model model2 = new Model(5000,"카페라떼");
		// model 변수에 3000, "아메리카노"
		
		
		Controller con = new Controller(model);	// Controller 클래스에 정보를 넘겨줌
		// syso
		System.out.println(con.sell()+"를 판매합니다.");
		System.out.println(con.info().getMenu()+"의 가격은 "+con.info().getPrice()+"원 입니다.");
	}

}		// MVC패턴 (Model - View - Controller 코딩방식)

// 흐름(로직)을 제어하는 부분
class Controller {
	Model model = new Model();
	public Controller(Model model) {
		this.model.setPrice(model.getPrice());
		this.model.setMenu(model.getMenu());
	}
	
	public String sell() {
		return model.getMenu();
	}
	
	public Model info() {		// 자료형 대신 클래스명을 사용하여 자기 자신을 리턴값으로 받을 수 있다.
		return model;			// model을 리턴한다는 것은 getmenu()와 getprice() 모두 리턴한다는 의미
	}
}