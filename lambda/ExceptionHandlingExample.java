package lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int [] somenumber={1,2,3,4};
        int key=0;
        process(somenumber,key,wrapperLambda((v,k)->System.out.println(v/k)));
    }
    private static void process(int [] somenumber,int key,BiConsumer<Integer,Integer> consumer){
        for (int i : somenumber) {
            consumer.accept(i, key);
            
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (a,b)->{
            try {
                consumer.accept(a, b);
            } catch (ArithmeticException e) {
                System.out.println("exception");
            }
        };
    }
}
