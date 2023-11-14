public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int[] solver(int a, int b, int c) {
        int discriminant = times(b, b) - times(times(4, a), c);
        if (discriminant > 0) {
            int root1 = div((-b + (int) Math.sqrt(discriminant)), (times(2, a)));
            int root2 = div((-b - (int) Math.sqrt(discriminant)), (times(2, a)));
            return new int[]{root1, root2};
        } else if (discriminant == 0) {
            int root = div(-b, (times(2, a)));
            return new int[]{root};
        } else {
            // Уравнение не имеет целых корней.
            return new int[0];
        }
    }
}
