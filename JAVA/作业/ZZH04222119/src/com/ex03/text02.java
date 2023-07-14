import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = scanner.nextInt();
        int m1 = 0, m5 = 0, m10 = 0, m20 = 0;
        for (int i = 20; i >= 1; i /= 2) {
            if (n >= i) {
                if (i==20) {
                    m20 += n / i;
                    n %= i;
                } else if (i==10) {
                    m10 += n / i;
                    n %= i;
                } else if (i==5) {
                    m5 += n / i;
                    n %= i;
                } else if (i==1) {
                    m1 += n / i;
                    n %= i;
                }
            }
        }
        System.out.println(m1 + "张1元  " + m5 + "张5元  " + m10 + "张10元  " + m20 + "张20元  ");
    }
}