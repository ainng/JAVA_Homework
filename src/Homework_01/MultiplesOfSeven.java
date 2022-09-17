package Homework_01;

/**
 * @author 王子安
 * @date 2022/9/17 - 11:37
 */

//打印1到100所有7的倍数的个数以及它们的总和
public class MultiplesOfSeven {
    public static void main(String[] args) {
        int sum=0;      //初始化和为0 用sum记录储存和
        int num=0;      //初始化个数为0 用num记录储存7的倍数的个数
        for (int i = 0; i <= 100 ; i++) {
            if(i%7==0){
                num++;
                sum+=i;
            }
        }
        System.out.println("1到100所有7的倍数的个数为"+num);
        System.out.println("1到100所有7的倍数的和为"+sum);
    }
}
