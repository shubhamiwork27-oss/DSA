public class Direction {
    public static float ShortestPath(String direction) {
        int x = 0  , y = 0;
        for (int i = 0; i < direction.length(); i++) {
            char z = direction.charAt(i);
            if(z == 'N'){
                y++;
            }else if(z == 'S'){
                y--;
            }else if(z == 'W'){
                x--;
            }else if(z == 'E'){
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)(Math.sqrt(X2+Y2));
    }
    public static void main(String[] args) {
        String direction = "NS";
        System.out.println(ShortestPath(direction));
    }
    
}
