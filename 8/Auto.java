class Auto extends Transport {
	private int gasNumber;

	public Auto(int wheelsCount, int gasNumber) {
		super(wheelsCount);
		this.gasNumber = gasNumber;
	}

	public void go() {
		System.out.println("I'm Auto");
	}
}