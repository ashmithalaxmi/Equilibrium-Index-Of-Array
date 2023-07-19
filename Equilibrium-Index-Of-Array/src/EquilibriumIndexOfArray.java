import java.util.Scanner;

public class EquilibriumIndexOfArray {
    static int equilibrium(int[] a,int n) {
        int[] P= new int[n];
        P[0]=a[0];
        int minimum=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            P[i]=P[i-1]+a[i];
        }
        int count=0;
        int p= P.length;
        for(int i=1;i<n;i++){
            if(P[i-1]==P[n-1]-P[i]){
                count++;
                if(minimum>i){
                    minimum=i;
                }
            }
        }
        if(count==0) {
            return -1;
        }
        else{
            return minimum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println(equilibrium(array, n));
    }
}
