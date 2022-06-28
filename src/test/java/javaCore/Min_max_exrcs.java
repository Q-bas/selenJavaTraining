package javaCore;

public class Min_max_exrcs {

    //find maximum number in the column where minimum number is found

    public static void main(String[] args) {
        int arr[][] ={{10,20,30},{90,23,44},{5,4,7}} ;
        int min = arr[0][0];
        int max = arr[0][0];
        int clmn = 0;
        for (int i = 0;i<3;i++){
            for (int j=0;j<3;j++){
                if (arr[i][j]<min){
                    min = arr[i][j];
                    clmn = j;
                }
            }
        }
        for (int i =0;i<3;i++){
            if (arr[i][clmn]>max){
                max = arr[i][clmn];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
