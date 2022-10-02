public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2,2,3,1,1, 5};
        int i = 0;
        while (i<a.length) {

            for(int j=0;j<b.length;j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    b[j]=Integer.MIN_VALUE;
                    break;
                }
            }
            i++;
        }
    }
}