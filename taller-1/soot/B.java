public class B {
    public int exercise2(int a, int b) {
        int c = a + b;
        int d = a - b;
        int r;
        if (a < b) {
            r = c;
        } else {
            r = d;
        }
        return r;
    }
}