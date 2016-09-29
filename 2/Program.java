class Program {
public static void main(String[] args) {
		// объявил целочисленную переменную
		int a = 5;
		int b = a; // a == b == 5

		// объявление вещественной переменной
		double x = 9.3;
		// нельзя приводит явно вещественный тип целому
		//a = x;

		// но явное преобразование разрешено
		a = (int)x;
		System.out.println(a);

		// явное преобразование из int в double разрешено
		x = a;
		System.out.println(x);

		int r = 10;
		int t = 5;

		// условная структура управления
		if (r > t) {
			System.out.println(r);
		} else if (t > r) {
			System.out.println(t);
		} else {
			System.out.println(t + " " +r);
		}

		// цикл
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++; // i = i + 1;
		}
		// синтаксический сахар над while - цикл for
		for (int j= 0; j < 10; j++) {
			System.out.println(j);
		}
	}
}