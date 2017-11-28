class Square extends SquareTypeShapes {
	public Square(int length,int breadth){
		super(length, breadth);
	}

	@Override
	public String toString(){
		return "Length is " + length + "\nBreadth is " + breadth;
	}

	@Override
	public int area(){
		return length * breadth * 2;
	}
}

class Inheritance {
	public static void main(String[] args) {
		Square s = new Square(2, 4);
		System.out.println(s);
		System.out.println(s.area());
	}
}