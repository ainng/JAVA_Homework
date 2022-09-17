package Homework_01;

/**
 * @author 王子安
 * @date 2022/9/17 - 11:53
 */

//计算两个给定矩阵c和d的相加和相乘结果
public class MatrixOperation {
    public static void main(String[] args) {
        int c[][] =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int d[][] =new int[][]{{2,2,2},{1,1,1},{3,3,3}};
        int addResult[][] = new  int[3][3];     //相加所得的矩阵
        int multiResult[][] = new int[3][3];        //相乘所得的矩阵
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                addResult[i][j] = c[i][j] + d[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiResult[i][j] = c[i][0]*d[0][j]+c[i][1]*d[1][j]+c[i][2]*d[2][j];
            }
        }

    }
}
