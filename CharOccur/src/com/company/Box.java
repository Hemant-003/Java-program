class Box{
	int height;
	int width;
	int length;
	int volume;
Box(){
	width = 5;
	height = 5;
	length = 6;
}
void method{
	volume= height*width*length;
}
}

class Constructor_object{
	public static void main(String []args){
		Box obj = new Box();
		obj.volume;
		System.out.println(obj.volume);
	}
}
