package academy.devdojo.maratonajava.javacore.ZZAstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10000000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for ");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i= 1; i<=num; i++){
            result+= i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end -init) + " ms");
    }
    private static void sumStreamIterate(long num){
        System.out.println("Sum Stream Iterate ");
        long result = 0;
        long init = System.currentTimeMillis();
        result =  Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end -init) + " ms");
    }
    private static void sumParallelStreamIterate(long num){
        System.out.println("sumParallelStreamIterate ");
        long result = 0;
        long init = System.currentTimeMillis();
        result =  Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end -init) + " ms");
    }
    private static void sumLongStreamIterate(long num){
        System.out.println("sumLongStreamIterate ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end -init) + " ms");
    }
    private static void sumParallelLongStreamIterate(long num){
        System.out.println("sumParallelLongStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end -init) + " ms");
    }
}
