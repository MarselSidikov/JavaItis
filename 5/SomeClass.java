class SomeClass {
	// метод - здесь функция, которая возвращает значение
	// формальные параметры - a и b
	// тип возвращаемого значения - int
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(double a, int b) {
		return (int)a + b;
	}

	// так нельзя!
	/*
	public double sum(int a, int b) {
		return a + b;
	}
	*/
	// перегрузка метода - создание метода с одинаковым названием
	// но другой сигнатурой (список форм. параметров)
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
}