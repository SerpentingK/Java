public class Prueba {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(Function(num, 10, 0));
    }
    public static boolean Function(int n, int max, float min){
        return n <= max && n > min;
    }
    public static boolean Function(int n, int max){
        return n <= max;
    }
    public static boolean Function(int n, float min){
        return n >= min;
    }
}
