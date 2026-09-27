public class Note_two {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("white");
        System.out.println(p1.getColor());
        p1.setModel(270205);
        System.out.println(p1.getModel());
    }

    static class Pen {
        private String color;
        private int model;

        String getColor() {
            return this.color;
        }

        void setColor(String NewColor) {
            this.color = NewColor;
        }

        int getModel() {
            return this.model;
        }

        void setModel(int New_model) {
            this.model = New_model;
        }
    }
}