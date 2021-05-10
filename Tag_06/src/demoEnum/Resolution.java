package demoEnum;

public enum Resolution {
	Small(640, 480), Medium(800, 600), Large(1024,768);
	
	private final int height;
	private final int width;

	Resolution(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
}
