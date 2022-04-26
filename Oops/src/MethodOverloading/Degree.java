package MethodOverloading;

class Degree1 {
    void getDegree(){
		System.out.println("I got degree");
	}
	}
class Undergraduated extends Degree1{
	void getDegree() {
		System.out.println("I'm Under Graduated");
	}
}
class Postgraduated extends Degree1{
	 void getDegree() {
		System.out.println("I'm Post Graduated");
	}
}
class Degree{
	public static void main(String[] args) {
		Undergraduated a = new Undergraduated();
		Postgraduated b = new Postgraduated();
		a.getDegree();
		b.getDegree();
	}
}

