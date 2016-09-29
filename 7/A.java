class A {
	// члены класса предка становятся доступными в потомках
	protected int a;

	public A() {
		this.a = 1;
	}

	public A(int a) {
		this.a = a;
	}

	// final - запрет переопределения метода
	public void method() {
		System.out.println("I'm in A: " + a);
	}
}