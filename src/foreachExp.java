public class foreachExp {
    public static void main(String[] args) {
        int[] anArray = {1, 2, 3, 4, 5,};
        for (int i = 0; i < anArray.length; i++) {
            anArray[i]++;
            System.out.println(anArray[i]++);
        }
    }
}
