class SquareTypeShapes {
	private String name = "Shape";
	int length, breadth;

	public SquareTypeShapes(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public int area(){
		return length * breadth;
	}
}