public class strong {
    public static void main(String[] args) {
        int num = 145 ; 
            int num1 = num/100;
            int num2 = (num%100)/10;
            int num3 = num %10;
            int f1 = 1;
            int f2 = 1;
            int f3 = 1;

            for(int i = 1 ; i <= num1 ; i++){
                f1 = f1 * i;
            }
            for(int j = 1 ; j <= num2 ; j++){
                f2 = f2 * j;
            }
            for(int k = 1 ; k <= num3 ; k++){
                f3 = f3 * k;
            }
            if(f1+f2+f3 == num){
            System.out.println(num+" is a strong number");
            }else{
                System.out.println("not a strong number");
            }
    }
    
}
