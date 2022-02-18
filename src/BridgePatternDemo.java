
public class BridgePatternDemo {
	public static void main(String[] args) {
		MyShape redCircle = new Circle(200, 200, 120, new RedCircle());
		MyShape greenCircle = new Circle(100, 100, 50, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
