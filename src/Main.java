import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // --------------------Java 8
        // ---- Default interface + override interface
        Java8_Formula formula = new Java8_Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        // ---- Lambda
        LambdaInterf summer = new LambdaInterf() {
            @Override
            public int sum(final int a, final int b) {
                return a + b;
            }
        };
        LambdaInterf summer2 = (a,b) -> a + b;


        // ---- Functional Interface
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer convented = converter.convert("123");
        System.out.println(convented);

        // ---- Links on methods and constructors
        Converter<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter1.convert("456");
        System.out.println(converted1);

        // ---- StreamAPI
    }
}