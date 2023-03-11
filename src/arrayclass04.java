public class arrayclass04 {
    public static void main(String[] args) {
        int [] arr={10,13,20,25,45,50};
        // arr[1]=0 this is how we alter the indexes.
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);

        }

            }
        for (int i = 0; i <arr.length; i++) {// replace all odd numbers with 0
            if(arr[i]%2!=0){
                arr[i]=0;
            }

        }
        System.out.println("after replacing odd numbers" );
        for (int i = 0; i <arr.length ; i++) {


        System.out.println(arr[i]);
    }

}}

