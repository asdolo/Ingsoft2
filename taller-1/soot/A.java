public class A {
    public static int main(String[] args) {
        int a = 8;
        if (args.length > 2)
            a = 5;
        int c = 1;
        while (!(c > a)) {
            c = c + c;
        }
        a = c - a;
        c = 0;
        return a + c;
    }
}