public abstract class MyShape {
	protected DrawAPI drawAPI;

	protected MyShape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
