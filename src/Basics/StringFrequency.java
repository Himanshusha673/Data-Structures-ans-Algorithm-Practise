public class StringFrequency {
    public static void main(String[] a) {
        String str = "Himanshu SAHA";
        str = str.replace(" ", "").toLowerCase();
        int n = str.length();
        System.out.println(str);
        char[] arr = str.toCharArray();
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               if (arr[i] == arr[j]) {
                    count++;
                    for (int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                }
            }
            System.out.println(arr[i]+"="+count);
            n--;
        }
    }
}