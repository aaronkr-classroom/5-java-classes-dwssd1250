
public class cat extends animal{ //Cat is-a animal
	String breed;
	String color;
	
	void eat() {
		System.out.println(this.getName() + " 먹이를 먹다~");
	}
	
	void scratch() {
		System.out.println(this.getName() + " 발톱으로 햘퀴다");
	}
	public void sound() { //메서드 오버라이딩 (다른 객체에서 덮어쓰기)
		System.out.println(this.getName() + " 야옹야옹 meowmeow");
	}
}
