package abstraction;

public abstract class Parent{
	abstract void message();
}
class SubClass1 extends Parent{
	@Override
	public void message() {
		System.out.println("This is First SubClass");
	}
}
class SubClass2 extends Parent{
	@Override
	public void message() {
		System.out.println("This is Second SubClass");
	}
}
