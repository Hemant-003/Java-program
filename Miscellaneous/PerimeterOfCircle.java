import java.util.Scanner;
class PerimeterOfCircle{
	public static void main(String []args){
		CirclePerimeter();

    }     
    	public static float CirclePerimeter (){    
    	System.out.println("Enter Radius of circle");     
    	Scanner s = new Scanner(System.in);     
    	float radius = s.nextFloat();
    	float pi = 3.14f;     
    	float PerimeterOfCircle= 2*radius*pi;
    	System.out.println("Perimeter Of Circle is = " +PerimeterOfCircle);     
    	return PerimeterOfCircle;

    	}
    	
}