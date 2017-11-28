class Person extends Object {
	String name;

	public Person(String name){
		this.name = name;
	}

	public String toString(){
		return name;
	}
}

class ToString extends Object {
	public static void main(String[] args) {
		Person p = new Person("Hemant");
		System.out.println(p.name);
		System.out.println(p.toString());
	}
}