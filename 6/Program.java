class Program {
	public static void main(String[] args) {
		SomeClass someClass = new SomeClass();
		someClass.someMethod();
		someClass.someMethod();
		someClass.someMethod();
		someClass.print();

		SomeClass someClass2 = new SomeClass();
		someClass2.print();

		System.out.println(SomeClass.a);
		System.out.println(someClass.a);
		SomeClass.staticMethod();
		someClass.staticMethod();

	}
}