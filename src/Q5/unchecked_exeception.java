
class UncheckedExceptionExample {

    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught: Division by zero");
        }
    }
}
