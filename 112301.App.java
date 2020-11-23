import java.util.Scanner;
public class radomDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("每当用户输入1时，输出一个二维坐标R(x,y)");
        while (true){
            int userIput = sc.nextInt();
            if (userIput==1) {
                int x = (int)(Math.random()%10*1000);
                int y = (int)(Math.random()%10*1000);
                System.out.println("二维坐标R("+x+","+y+")");
            }

        }

    }
}
