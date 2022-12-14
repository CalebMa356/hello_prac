package java03.example01;

import java.util.Scanner;

public class YearJudgment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        if(judge(year)) {
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "是平年");
        }
    }

    private static boolean judge(int year) {
        if(year % 4 == 0 && year % 100!=0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
