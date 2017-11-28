package com.company;

    class Movie{
        private String Name;
        public Movie(String Name){
            this.Name=Name;
        }
        public String Plot(){
            return "No Plot Here";
        }
        public String getName(){
            return Name;
        }
    }
    class Jaws extends Movie{
        public Jaws(){
            super("jaws");
        }
        @Override
        public String Plot(){
            return "Hollowood";
        }
    }

    class Dhoom extends Movie{
        public Dhoom(){
            super("Dhoom");
        }
        @Override
        public String Plot(){
            return "Bollywood";
        }
    }
    class Bareily extends Movie{
        public Bareily(){
            super("Bareily");
        }
        @Override
        public String Plot(){
            return "2017 Latest";
        }
    }
    class JHMS extends Movie{
        public JHMS(){
            super("JHMS");
        }
        @Override
        public String Plot() {
            return "Flop";
        }
    }




public class Polymorphism {

    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            Movie movie= randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n"+
                    "Plot" +movie.Plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random Number is : " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new JHMS();
            case 3:
                return new Bareily();
            case 4:
                return new Dhoom();
        }
        return null;
    }
}
