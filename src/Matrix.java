import java.util.Scanner;

public class Matrix {
    public void transposeMatrix(Scanner s) {
        int a[][] = new int[2][2];

        System.out.print("Enter Array Elements = ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("Print Array Elements = ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }

    public void mirrorMatrix(Scanner s){
        int b[][]= new int[2][2];

        System.out.print("Enter Array Elements = ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = s.nextInt();
            }
        }

        System.out.print(" Print Array Elements = ");
        for (int i=0; i<=b.length-1; i++) {
            for (int j=b.length-1; j>=0; j--) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
