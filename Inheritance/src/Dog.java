public class Dog extends AnimalInheritance {

    private int teeth;
    private int eyes;
    private int tail;

        public Dog(String name,int weight,int size,int eyes, int tail,int teeth){
            super(name,1,1,weight,size);
            this.teeth=teeth;
            this.eyes=eyes;
            this.tail=tail;
        }
    }
