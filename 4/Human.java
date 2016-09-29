class Human {
	
	public static final int DEFAULT_AGE = 0;
	public static final int DEFAULT_BALLS = 0;
	public static final String DEFAULT_NAME = "DEFAULT";
	public static final int MAX_MARKS_COUNT = 5;
	
	private String name;
	private int age;
	private int[] marks;

	// создаем конструктор без параметров
	// конструктор имеет то же название, что и класс
	public Human() {
		this.name = DEFAULT_NAME;
		this.age = DEFAULT_AGE;
		this.marks = new int[MAX_MARKS_COUNT];
	}

	// конструктор с параметрами
	public Human(int age, String name, int marks[]) {
		this.setAge(age);
		this.setName(name);
		this.setMarks(marks);
	}

	// конструктор копирования
	public Human(Human original) {
		this.setAge(original.age);
		this.setName(original.name);
		this.setMarks(original.marks);
	}

	// поля защищаются методами доступа
	// процедура, которая задает значение полю - сеттер

	public void setName (String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if (age >= DEFAULT_AGE) {
			this.age = age;
		} else this.age = DEFAULT_AGE;
	}

	// функция, которая возвращает значение поля - геттер
	public int getAge() {
		return this.age;
	}

	public void setMarks(int marks[]) {
		this.marks = new int[marks.length];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= DEFAULT_BALLS) {
				this.marks[i] = marks[i];
			} else this.marks[i] = DEFAULT_BALLS;
		}
	}

	public int[] getMarks() {
		return this.marks;
	}

	public double calcAverage() {
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		return sum / marks.length;
	}
	public void show() {
		System.out.println( age + " " + 
			name);
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}

	public static void sort(Human[] humans) {
		// TODO: реализовать
	}

	public static void showAll(Human[] humans) {
		// TODO: релазиовать
	}
}