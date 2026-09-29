//Interfaces

//Made due to the following reasons :- Multiple Inheritance,total abstraction
// |----------|                
// |All methods are public, abstract and without implementation
// |Used to achieve total abstraction
// |Variables in the interface are final , public and static




public class Note_eight{
    public static void main(String[] args) {
        Master kill = new Master();
        kill.killers();
    }
}

interface LCU{
    void killers();
}

class Master implements LCU{
    public void killers(){
        System.out.println("Thlapathy");
    }
}
class Leo implements LCU{
    public void killers(){
        System.out.println("Thlapathy");
    }
}
class Kaithi implements LCU{
    public void killers(){
        System.out.println("Dilli");
    }
}
class Rolex implements LCU{
    public void killers(){
        System.out.println("Vikram");
    }
}