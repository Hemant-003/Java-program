
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Number of students already applied for the course");
        int N = s.nextInt();// N Students have already applied
                            // courses range from i to c
                            
        System.out.println("EnterNumber of friends");
        int p = s.nextInt(); // Number of Friends
        
        System.out.println("Enter Number of courses");
        int i = s.nextInt(); //Number of course
        
        System.out.println("Number of students Enrolled in the course")
        int c =s.nextInt();
        
        System.out.println("Enter sum of Iq of Last two students")
        int x = s.nextInt(); // SumOf Iq
        //course 
        for (int j =1 ;j<i;i++){
            if (1 <=i && i <=c){
               int  z = x*c ;
            }
        }

        /*for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        System.out.println("Hello World!");
    }
}
