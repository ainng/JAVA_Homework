package Homework_01;

/**
 * @author 王子安
 * @date 2022/9/17 - 11:43
 */

//输出所有水仙花数
public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int bits = i%10;        //记录数i的个位
            int ten = i%100/10;     //记录数i的十位
            int hundred = i/100;        //记录数i的百位
            if (bits*bits*bits+ten*ten*ten+hundred*hundred*hundred==i){     //如果满足水仙花数的条件判断，则输出i并换行
                System.out.println(i);
            }
        }
    }
}
