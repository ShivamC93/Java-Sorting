public class insertion{
    static void insertionSort(int[] a){
        int n=a.length;
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j=1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a ={6,3,7,1,9,4,8};
        insertionSort(a);   
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i] + ' ');
        }     
    }
}