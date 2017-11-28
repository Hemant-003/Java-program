class Square extends SquareTypeShapes {
    public Square(int l, int b) { 
    	// super keyword is used to call parent class constructor
    	super(l, b);
	}

	@Override
    public String toString() { return "Length is " + length + "\nBreadth is " + breadth; }

    // super keyword can also be used to call parent class methods
	@Override
    public int area() { return super.area(); }

    public static void main(String[] args) {
    	SquareTypeShapes s = new Square(4, 5);
    	System.out.println(s);
    	System.out.println(s.area());
    }
}