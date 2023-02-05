public class Punto3 {
    public static void main(String[] args) {
        double[] arr = new double[]{1, 2, 3, 4, 5};
        System.out.println(prom(arr, 0));
    }

    public static double prom(double[] arr, int i){
        if(i == arr.length - 1)
            return arr[i]/arr.length;
        return arr[i]/arr.length + prom(arr, i+1);
    }
}
