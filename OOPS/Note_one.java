
    public class Note_one {
        public static void main(String[] args){
            Pen p1 = new Pen();
            p1.set_color("white");
            System.out.println(p1.color);
            p1.set_model(270205);
            System.out.println(p1.model);

        }
    }

    class Pen{
        String color;
        int model;
        void set_color(String NewColor){
             color = NewColor;
        }
        void set_model(int New_model){
            model = New_model;
        }
    }