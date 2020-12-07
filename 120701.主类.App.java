//120701.主类.App.java
public class App {
    public static void main(String[] args) {
        int array2d[ ][ ]={
                {1,2,3,4,5,6},
                {7,8,9,10,0,12},
                {8,8,9,10,11,12},
                {7,8,3,10,11,12},
                {88,66,92,102,151,999}
        };
        Find find = new Find();
        int[] zeroIndex = find.FinnZero(array2d);
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        find.Finnleft(x,y);
        find.Finnright(x,y);
        find.Finnup(x,y);
        find.Finndown(x,y);
    }
   // R_zero(4,1)、R_left（3,1）、R_right（5,1）、R_up(4,0)、R_down(4,2)
}
