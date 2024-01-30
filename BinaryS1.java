public class BinaryS1 {
    static boolean binarySearch(int[] a, int target){
        int n = a.length;
        int st=0, end= n-1;

        while(st<=end){
            int mid = (st+end)/2;
            if(a[mid] == target) {
                return true;
            }
            else if(target < a[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return false;
    }
    
    static boolean recBinarySe(int[]a, int st, int end, int target){
        if(st > end) return false;
        int mid = (st+end)/2;

        if(target == a[mid]){
            return true;
        }else if(target < a[mid]){
            return recBinarySe(a, st, mid-1, target);
        } else{
            return recBinarySe(a, mid+1, end, target);
        }
    }
    
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int n = a.length;
        int target = 4;
        System.out.println(recBinarySe(a, 0, n, target));
        System.out.println(binarySearch(a, target));

    }
}
