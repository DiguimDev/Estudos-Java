package academy.devdojo.maratonajava.javacore.Oexcessao.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayINdexOutr");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro de outra excessao");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro de outra excessao");
        }
    }

}
