public class Calculation extends AbstractClass {
    @Override
    public void mass() {
        int weight = 25;
        int area =85;

        double mass = area/weight;
        System.out.println(mass);
    }

    @Override
    public void speed(int timetaken, int kmCoverd) {
        super.speed(timetaken, kmCoverd);
    }

    public static void main(String[] args) {

    Calculation calculation= new Calculation();
    calculation.speed(25,58);

        calculation.mass();

    }
}