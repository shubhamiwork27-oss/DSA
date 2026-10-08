//Container with most water // 1,8,6,2,5,4,8,3,7

import java.util.ArrayList;

public class Cwmw {

    public static int bruteForce(ArrayList<Integer> list ) {
        int maxwtr = 0 ; 
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i +1 ; j<list.size() ; j++){
                int ht = Math.min(list.get(i),list.get(j));
                int wdth = j-i;
                int wtr = wdth * ht;
                maxwtr = Math.max(maxwtr , wtr);
            }
        }   
        return maxwtr;
    }        

    // //2 pointer approach - O(n)

    public static int pointerapp(ArrayList<Integer> list){
        int lp = 0; int rp = list.size()-1;
        int maxwater = 0;
        while(lp < rp){
            int ht = Math.min(list.get(lp) , list.get(rp));
            int wdth = rp-lp;
            int currwater = ht*wdth;
            maxwater = Math.max(maxwater,currwater);
            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1); list.add(8);list.add(6);list.add(2);list.add(5);list.add(4);list.add(8);list.add(3);list.add(7);
            System.out.print(bruteForce(list ));
        }
    }