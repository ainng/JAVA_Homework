package Homework_01;

/**
 * @author 王子安
 * @date 2022/9/17 - 11:32
 */

//打印1到100所有奇数的和
public class OddSum {
    public static void main(String[] args) {
        int sum=0;      //初始化和为0 用sum记录和
        for (int i = 0; i <= 100; i++) {
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println("1到100所有奇数的和为"+sum);
    }
}
