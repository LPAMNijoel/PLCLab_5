class A {
	public void p() {
		System.out.println("A.p");

	}

	public void q() {

		System.out.println("A.q");
	}

	public void r() {
		// prints out whats passed in p
		p();

		// prints out whats passed in q
		q();
	}
}

class B extends A {
	public void p()

	{
		System.out.println("B.p");
	}

}

class C extends B {

	public void q() {
		System.out.println("C.q");
	}

	public void r() {
		// prints out whats passed in p
		p();
		// prints out whats passed in q
		q();
	}
}

public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("something");
		A a;
		C c = new C();
		a = c;
		a.r();
		a = new B();
		a.r();
		a = new C();
		a.r();

	}
}
