public class Punto1 {
    public static void main(String[] args) {
        //Punto 1
        int[] arr = new int[]{1, 2, 8, 14, 89};
        System.out.println(sum(arr, 0));
    }
    public static int sum(int[] arr, int i){
        if (i == arr.length - 1) {
            return arr[arr.length - 1];
        }
        return arr[i] + sum(arr, i+1);
    }
}