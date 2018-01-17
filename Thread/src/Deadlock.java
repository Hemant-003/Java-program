public class Deadlock {


    String a = "Hemant";
    String b = "Ramesh";

    Thread thread = new Thread("New thread"){

        public void run(){
            while(true){
                synchronized (a){
                    synchronized (b){
                        System.out.println("Running a and b");
                    }
                }
            }
        }
    };


    Thread thread1 = new Thread("Thread2"){

        public void run(){
            synchronized (a){
                synchronized (b){
                    System.out.println("Running thread 2");
                }
            }
        }
    };




    public static void main(String[] args) {

       Deadlock deadlock = new Deadlock();
        deadlock.thread.start();
        deadlock.thread1.start();

    }
}