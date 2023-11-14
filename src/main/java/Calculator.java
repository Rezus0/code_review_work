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

    public int[] karpushinaoSolver(int a, int b, int c) {
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

    public int[] romamentevrrSolver() { // x^2 - x - 6 = 0 quadratic equation solution
        int a = 1;
        int b = -1;
        int c = -6;
        int D = dif(times(b, b), times(4, times(a, c))); // discriminant: b^2 - 4ac
        int x1 = div(add(-b, (int) Math.sqrt(D)), times(2, a)); // -b + sqrt(D)
        int x2 = div(dif(-b, (int) Math.sqrt(D)), times(2, a)); // -b + sqrt(D)
        return new int[] {x1, x2};
    }
}