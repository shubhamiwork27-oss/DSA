
    public class Note_five {

        public static void main(String[] args) {
            Bird b1 = new Bird();

            b1.mammal();
            b1.eagle();
        }

    }

    class Animal{
        void mammal(){
            System.out.println("CODE RED");
        }
    }
    class Bird extends Animal{
        void eagle(){
            System.out.println("IT'S A GHOST : VIKRAM");
        }
    }