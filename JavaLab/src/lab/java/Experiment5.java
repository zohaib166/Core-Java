package lab.java;

class Box {
	private float width, height, depth;
	
	public Box(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	public float findVolume() {
		return width*height*depth;
	}
}
public class Experiment5 {
	public static void main(String[] args) {
		Box b = new Box(4.5f, 7.5f, 3.6f);
		System.out.print("Volume of the Box with Width="+
		b.getWidth()+" Height="+b.getHeight()+" Depth="+b.getDepth()+" is: ");
		System.out.println(b.findVolume());
	}
}


