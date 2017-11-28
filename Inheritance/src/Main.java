public class Main {

public static void main(String[]args){
   AnimalInheritance tom= new AnimalInheritance("Tomm",5,1,45,5);
   Dog Roman= new Dog("Roman",5,5,2,1,30);
   System.out.println("Roman has " +Roman.getName() + Roman.getBody() + " " +Roman.getSize());
   System.out.println(tom.getName());
    }
}


