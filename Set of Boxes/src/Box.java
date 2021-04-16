public class Box{
    public:
	Double length;
	Double width;
	Double height;
	
	Box(){}
	
	Box(Double length, Double width, Double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public double volume() {
		return height * width * length;
	}
	
}