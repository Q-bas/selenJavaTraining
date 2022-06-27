package javaCore;

public class ArraysDemo {
    public static void main(String[] args) {
        
        //array which stores multiple values of the same type
        //declare array and allocate memory 
        int a[] = new int[5];
        a[0]= 2;
        a[1]= 10;
        a[2] = 12;
        a[3]= 20;
        a[4]= 22;

        for(int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }

        int b[] = {1,2,3,4,5};
        for(int i=0;i<b.length; i++){
            System.out.println(b[i]);
        }

        //multidimensional array
        //[x][y] coordinates in the matrix
        //[x] - rows [y] - columns
        int c[][] = new int [2][3];
        c[0][0] = 1;
        c[0][1] = 100;
        c[0][2] = 99;
        c[1][0]=2;
        c[1][1]= 200;
        c[1][2]=198;
        //print one of the values in matrix
        System.out.println(c[1][1]);

        //2nd way to declare array
        int d[][] = {{1,10,100},{2,20,200},{3,30,300}};

        //print whole array
        for(int i=0;i<d.length; i++){
            for(int ii=0;ii<d.length;i++){

            }

        }
    }
}
