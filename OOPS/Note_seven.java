public class Note_seven {
    public static void main(String[] args) {
        Jinka ani = new Jinka();
        ani.noya();
    }
}

class Pinka{
    void noya(){
        System.out.println("kkkk");
    }
}

class Jinka extends Pinka{
    void noya(){
        System.out.println("Vikram");
    }
}
