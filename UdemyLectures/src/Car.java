
public class Car {

	private String model;
	private int number;
	private int horsepower;
	private String colour;

	public void setModel(String model) {
		String ValidModel= model;
		if (ValidModel.equals("porsche") || (ValidModel.equals("Baleno"))){
		this.model = model;
	}
	}

	public String getModel() {
		return this.model;
	}

	public void setNumber(int number){
	this.number=number;
}
	public int getNumber(){
		return this.number;
	}
}

