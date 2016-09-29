class B extends A {
	private int b = 10;

	public B() {
		this.b = 10;
	}

	public B(int a, int b) {
		// вызываем конструктор предка - указывается первым
		super(a);
		this.b = b;
	}

	public void method() {
		System.out.println("I'm in B: b=" + b + " and a= "  + a);
	}
}