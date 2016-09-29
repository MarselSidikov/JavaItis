class Program {
	public static void main(String[] args) {
		// объявление объектной переменной
		Human h;
		// выделение памяти под объект
		// new - оператор выделения памяти
		// Human() - конструктор
		// Конструктор - инициализирует объект - задает начальное состояние  
		h = new Human();
		// . - оператор обращения к членам класса
		// h.age = 22;
		h.setAge(22);
		//h.name = "Marsel";
		h.setName("Marsel");
		/* h.marks = new int[3];
		h.marks[0] = 4;
		h.marks[1] = 4;
		h.marks[2] = 5; */

		int a[] = {4, 4, -10, 2};
		h.setMarks(a);

		h.show();

		Human h2 = new Human();
		h2.show();

		// ссылочные типы!
		h2 = h;
		h2.setAge(100);
		System.out.println("------ " + h.getAge());

		Human h3 = new Human(30, "Vladimir", a);
		h3.show();

		Human h4 = new Human(h3);
		h4.show();

		double average = h4.calcAverage();

		System.out.println(average);

	}
}