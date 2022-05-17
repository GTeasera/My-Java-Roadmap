public class Java8 {
}

interface Java8_Formula{
    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}

@FunctionalInterface
interface Converter<F, T>{
    T convert(F from);
}