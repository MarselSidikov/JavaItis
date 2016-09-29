class SomeClass {
	// статичная переменная - глобальна для всех объектов
	public static int a = 1;

	public int b = 2;
	public void someMethod() {
		a = a + a;
	}

	public void print() {
		System.out.println(a);
	}

	public static void staticMethod() {
		// нельзя использовать нестатичные члены класса 
		// в статичном методе
		// System.out.println(b + b);
		// нестатичные методы в статичном вызывать нельзя
		//print();
		System.out.println("I'm static");
	}
}