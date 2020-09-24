package java09_24;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:

 * 12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
 *
 * User:ZouSS
 * Date:2020-09-24
 * Time:9:54
 **/
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 31; i >=1 ; i-=2) {
            System.out.print(((num >> i) & 1)+" ");
        }
        System.out.println();
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print(((num >> i) & 1)+" ");
        }
    }
    public static void main15(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <32 ; i++) {
            if (((num >>> i) & 1 )!= 0){
                count++;
            }
        }
        System.out.println(count);
    }
    //13. 输出一个整数的每一位.
    public static void main14(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num != 0){

            System.out.println(num%10);
            num = num/10;
        }
    }
    //11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while(num != 0){
            count++;
            num = num &(num-1);
        }
        System.out.println(count);
    }

    //10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
    public static void main12(String[] args) {
        System.out.println("请输入你的密码");
        Scanner scanner = new Scanner(System.in);
        int chance = 3;
        while(chance > 0){
            String str = scanner.next();
            if (str.equals("123@Zss")){
                System.out.println("密码正确");
                break;
            }else {
                System.out.println("密码错误，你还有"+(chance-1)+"次机会输入密码");
                chance--;
            }
        }
    }


    public static void main11(String[] args) {

        //1、求该数字的位数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num ; i++) {
            int count = 0;
            int tmp = i;
            while(tmp != 0){
                count++;
                tmp = tmp/10;
            }
            tmp = i;
            int sum = 0;
            while(tmp != 0){
                sum += Math.pow(tmp %10 ,count);
                tmp = tmp/10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
        }
    //8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
    public static void main9(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i/10 == 9){
                count++;
            }
            if((i % 10) == 9){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main8(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            int j = 1;
            for ( j = 2; j <= (i/2) ; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j > (i/2)){
                System.out.print(i+" ");
            }

        }
    }
    //7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main7(String[] args) {
        double sum = 0.0;
        int i = 1;
        int flag = 1;
        for (i = 1;  i<= 100 ;i ++) {
            sum += (1.0/i)*flag;
            flag = -flag;
        }
        System.out.println(sum);
    }
// 6. 求两个正整数的最大公约数
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 0;
        n = a%b;
        while (n != 0){
            a = b;
            b = n;
            n = a%b;
        }
        System.out.println(b);
    }
    //5. 输出乘法口诀表
    public static void main5(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" * "+j+" = " + i*j+"    ");
            }
            System.out.println();
        }
    }
    // 4. 输出 1000 - 2000 之间所有的闰年
    public static void main4(String[] args) {
       int year = 1000;
       while(year <= 2000){
           if ((year % 4 == 0) && (year %100) != 0 || year % 400 == 0){
               System.out.println(year);
           }
           year++;
       }


    }
    //2. 判定一个数字是否是素数
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int i =0;
            int num = scanner.nextInt();
            for (i = 2; i <= Math.sqrt(num) ; i++) {
                if (num %i == 0){
                    System.out.println(num+"是素数");
                    break;
                }
            }
            if (i > num){
                System.out.println(num+"不是素数");
            }
        }
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(true){
            int num = scanner.nextInt();
            for ( i = 2; i < num; i++) {
                if (num %i == 0){
                    System.out.println(num+"是素数");
                    break;
                }
            }
            if (i >= num){
                System.out.println(num+"不是素数");
            }
        }
    }
    //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year <= 18){
            System.out.println("少年");
        }else if (year >= 19 && year <= 28){
            System.out.println("青年");
        }else  if (year >= 29 && year <= 55){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }
}
