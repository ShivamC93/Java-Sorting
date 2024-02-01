public class Example2 {
    static void sortFruits(String[] f){
        int n = f.length;
        for(int i = 0; i<n;i++){
            int min_order=i;
            for(int j = i+1; j<n ; j++){
                if(f[j].compareTo(f[min_order]) < 0){
                min_order=j;
                }       
            }
            String temp = f[i];
            f[i]=f[min_order];
            f[min_order]=temp;
        }
    }
 
    public static void main(String[] args){
        String[] f = {"kiwi", "apple", "papaya", "mango"};
        sortFruits(f);
        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);

        }
    }
}

