package Day04;

public class Array3 {
	public static void main(String[] args) {
		String name[] = new String[4];
		int no[] = {1, 2, 3, 4};
		
		name[0] = "보라돌이";
		name[1] = "뚜비";
		name[2] = "나나";
		name[3] = "뽀";
		
		System.out.println("===출석부===");
		for(int i=0; i<name.length; i++) {
			System.out.println(no[i]+"번 - "+name[i]);
		}
		
	}
}
