//120701.寻找0的相邻坐标.Find.java
public class Find {
    public int[] FinnZero(int array2d[][]) {
        int[] returnArr = new int[2];
        for (int row = 0; row < array2d.length; row++) {
            for (int culumn = 0; culumn < array2d[0].length; culumn++) {
                if (array2d[row][culumn] == 0) {
                    System.out.println("0的坐标是:" + "R_Zero(" + culumn + "," + row + ")");
                    returnArr[0] = culumn;
                    returnArr[1] = row;
                    break;
                }
            }
        }
        return returnArr;
    }

    void Finnleft(int x, int y) {
        System.out.println("0的左边数字" + 10 + "的坐标是:" + "R_left(" + (x - 1) + "," + (y) + ")");
    }

    void Finnright(int x, int y) {
        System.out.println("0的右边数字" + 12 + "的坐标是:" + "R_right(" + (x + 1) + "," + (y) + ")");
    }

    //up
    void Finnup(int x, int y) {
        System.out.println("0的上边数字" + 5 + "的坐标是:" + "R_up(" + (x) + "," + (y - 1) + ")");
    }

    //down
    void Finndown(int x, int y) {
        System.out.println("0的下边数字" + 11 + "的坐标是:" + "R_down(" + (x) + "," + (y + 1) + ")");
    }
}
