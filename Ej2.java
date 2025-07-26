public class Ej2 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 4, 9};
        int buscar = 4;
        boolean encontrado = false;
        for (int n : arr) if (n == buscar) encontrado = true;
        System.out.println(encontrado);
    }
}
