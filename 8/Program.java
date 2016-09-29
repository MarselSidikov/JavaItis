class Program {
	public static void main(String[] args) {
		Auto auto = new Auto(4, 95);
		SportAuto sportAuto = new SportAuto(10, 96);
		Bike bike = new Bike(10	);

		/* представим, что таких объектов - миллион
		transport.go();
		auto.go();
		sportAuto.go();
		bike.go();
		*/

		// решение - массив, но как сделать массив объектов разного типа?
		Transport trasports[] = {auto, sportAuto, bike};

		for (int i = 0; i < trasports.length; i++) {
			// восходящее приведение UpCasting
			Transport currentTransport = trasports[i];
			currentTransport.go();
		}

		// foreach
		for (Transport currentTransport : trasports) {
			currentTransport.go();
		}
	}
}