package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();

        int [][] mat = new int[row][row];
        for (int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                mat[i][j]=sc.nextInt();
            }

        }
        System.out.println(findCelebrity(mat));

    }
    // method-1 with On^2
//    private static int findCelebrity(int[][] mat) {
//
//      int mujheKitne[]= new int[mat.length];
//      int maiKitnoKo[]=new int [mat.length];
//
//        for(int i=0;i<mat.length;i++){
//
//            for(int j=0;j<mat[0].length;j++){
//                if(mat[i][j]==1){
//                    //here i knows j
//                    mujheKitne[j]++;
//                    maiKitnoKo[i]++;
//                }
//            }
//
//
//
//        }
//        for(int i=0;i<mat.length;i++){
//            //means celibrity is that, all people except cel knowing him. but he don't know anyone
//            if(mujheKitne[i]==mat.length-1&&maiKitnoKo[i]==0){
//                return i;
//            }
//        }
//        return -1;
//    }
    // method 2 with On

private static int findCelebrity(int[][] mat) {
        Stack<Integer> st = new Stack<>();
        //putting all elements into stack
    for(int i=0;i<mat.length;i++){
        st.push(mat[i][0]);
    }
    while (st.size() > 1) {
        int i=st.pop();
        int j=st.pop();
        if(mat[i][j]==1){
            //means i knows j-> so i cant be celebrity
            //j may be
            st.push(j);

    }else{
            //means i dont know j ,so j cant be celebrity means i may be
            st.push(i);
        }

    }
    //after all of that stack size ==1 and there only that index which potentially be celebrity
    int pot=st.peek();
    //checking all i, j of potential if he knows anyone or if
    //  one person don't know him so pot can be celebrity
    for(int i=0;i<mat.length;i++){
        if (i!=pot){
            //means avoiding pot==pot case 2knows 2
            //handling false cases like noOne knows pot or pot Knows aleast one
            if(mat[i][pot]==0||mat[pot][i]==1){
                return -1;

            }

        }
    }
    return pot;



}
}
