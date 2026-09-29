
    public class Note_five {

        public static void main(String[] args) {
            Rolex c1 = new Rolex();
            c1.callall();
         Bird b1 = new Bird();
            b1.eagle();
        }

    }

    class Animal{
        void mammal(){
            System.out.println("LEO");
        }
    }
    class Bird extends Animal{
        void eagle(){
            System.out.println("VIKRAM");
        }
    }
    class Rolex extends Animal{
        void callall(){
            System.out.println("KAITHI");
        }
    }