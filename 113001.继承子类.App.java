public class App extends R{
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.boy_filePath);
        System.out.println(app.girl_filePath);
        for (int[] x:app.arr2d) {
            System.out.println(java.util.Arrays.toString(x)); // 遍历输出二维数组的所有内容
        }
    }
}
