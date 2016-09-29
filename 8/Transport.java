// абстрактный класс - класс, в котором хотя бы один из методов
// является абстрактным - то есть не имеет реализации
// объектные переменные создавать можно
// объекты - нельзя
 abstract class Transport {
	private int wheelsCount;

	public Transport(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}

	public abstract void go();
}