public class radomDemo extends Thread{
    public static void main(String[] args) {

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x = (int)(Math.random()%10*100);
            int y = (int)(Math.random()%10*100);
            System.out.println("二维坐标R("+x+","+y+")");

        }

    }
}
