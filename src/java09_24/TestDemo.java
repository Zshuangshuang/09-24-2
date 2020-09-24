package java09_24;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-24
 * Time:13:07
 **/
public class TestDemo {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = sc.nextInt();
        int ret = add(x,b);
        System.out.println(ret);
    }
}
