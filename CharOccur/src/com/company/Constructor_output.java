class box {
        int width;
        int height;
        int length;
        int volume;
        box() {
            width = 5;
            height = 5;
            length = 6;
        }
        void volume() {
             volume = width*height*length;
        } 
    }    
    class Constructor_output {
        public static void main(String args[])
        {
            box obj = new box();
            obj.volume();
            System.out.println(obj.volume);
        }
   }