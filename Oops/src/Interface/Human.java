package Interface;

public class Human extends Monkey implements BasicAnimal {
	public void speak() {
		System.out.println("Hello");
	}
	public void eat() {
		System.out.println("Eating a food.."); 
	}
	public void sleep() {
		System.out.println("Sleeping...");
		
	}
	public static void main(String[] args) {
		Human h =new Human();
		h.eat();
		
	}
}