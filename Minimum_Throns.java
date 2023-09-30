/*
 * Geek and Geekina are placed in a grid of size nm. Both of them are allowed

to move in any of the Left, Right, Up, or Down directions if the cell is
empty. Initially, all cells of Grid are empty (except the ones in which Geek
and Geekina are present). Classmates of Geek can place thorns in any number of cells in the grid.

Find the minimum number of thorns required by their classmates such that it
is not possible for Geek and Geekina to meet or report if it is impossible.
 */
public class Minimum_Throns {
    public int minimumThorns(int n, int m, int geek[], int geekina[]) {
        // Code Here
        if ((geek[0] == geekina[0] && Math.abs(geek[1] - geekina[1]) == 1)
                || (geek[1] == geekina[1] && Math.abs(geek[0] - geekina[0]) == 1)) {
            return -1;
        }
        int cnt1 = 0;
        int cnt2 = 0;

        if (geek[1] - 1 >= 1) {
            cnt1++;
        }
        if (geek[1] + 1 <= m) {
            cnt1++;
        }
        if (geek[0] + 1 <= n) {
            cnt1++;
        }
        if (geek[0] - 1 > 0) {
            cnt1++;
        }

        if (geekina[1] - 1 > 0) {
            cnt2++;
        }
        if (geekina[1] + 1 <= m) {
            cnt2++;
        }
        if (geekina[0] + 1 <= n) {
            cnt2++;
        }
        if (geekina[0] - 1 > 0) {
            cnt2++;
        }

        return Math.min(cnt1, cnt2);
    }
}
