public class C {
    private static class Cell {
        int value;
    }

    public int exercise3(Cell c1, Cell c2) {
        c1.value = 1;
        c2.value = 2;

        return c1.value;
    }
}