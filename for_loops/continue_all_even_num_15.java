package for_loops;

public class continue_all_even_num_15 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                continue;// will skip all the codes below if the num is odd
            }// and when num will be even it will not enter the if statemet and just print i
            System.out.println(i);

        }
    }




}

