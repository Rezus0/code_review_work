public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int[] solver() { // x^2 - x - 6 = 0 quadratic equation solution
        int a = 1;
        int b = -1;
        int c = -6;
        int D = dif(times(b, b), times(4, times(a, c))); // discriminant: b^2 - 4ac
        int x1 = div(add(-b, (int) Math.sqrt(D)), times(2, a)); // -b + sqrt(D)
        int x2 = div(dif(-b, (int) Math.sqrt(D)), times(2, a)); // -b + sqrt(D)
        return new int[] {x1, x2};
    }
}
