package Program;

import java.io.*;

class Matrix {

    int[][] a;
    int i, j;

    void getval() throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter the number of rows: ");
        i = Integer.parseInt(br.readLine());

        System.out.print("Enter the number of columns: ");
        j = Integer.parseInt(br.readLine());

        a = new int[i][j];

        System.out.println("Enter the values in " + i + " x " + j + " matrix:");

        for (int x = 0; x < i; x++) {

            for (int y = 0; y < j; y++) {
                a[x][y] = Integer.parseInt(br.readLine());
            }
        }
    }

    void display() {

        System.out.println("\nMatrix is:");

        for (int x = 0; x < i; x++) {

            for (int y = 0; y < j; y++) {
                System.out.print(a[x][y] + " ");
            }

            System.out.println();
        }

        System.out.println("\nTranspose of Matrix:");

        for (int x = 0; x < j; x++) {

            for (int y = 0; y < i; y++) {
                System.out.print(a[y][x] + " ");
            }

            System.out.println();
        }
    }
}

class MatrixDemo {

    public static void main(String[] args) throws IOException {

        Matrix m = new Matrix();

        m.getval();
        m.display();
    }
}