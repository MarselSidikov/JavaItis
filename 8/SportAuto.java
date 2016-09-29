class SportAuto extends Auto {

	// поскольку в классе Auto нет 
	// конструктора по умолчанию, надо в классе Bike написать свой
	public void go() {
		System.out.println("I'm SroptCar");
	}

	public SportAuto(int wheelsCount, int gasNumber) {
		super(wheelsCount, gasNumber);
	}
}