public class Punto4 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 14, 89};
        System.out.println(getIndex(arr, 9, 0));
    }

    public static int getIndex(int[] arr, int num, int i){
        if(num == arr[i]){
            int index = i;
            return index;
        }
        if(i == arr.length - 1){
            System.out.println("No hay coincidencias.");
            return -1;
        }

        return getIndex(arr, num, i+1);
    }
}
