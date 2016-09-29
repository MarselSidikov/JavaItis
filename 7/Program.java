class Program {
	public static void main(String[] args) {
		A a = new A();
		a.method();

		B b = new B(10, 20);
		b.method();

		A a2 = b;

		a2.method();
	}
}