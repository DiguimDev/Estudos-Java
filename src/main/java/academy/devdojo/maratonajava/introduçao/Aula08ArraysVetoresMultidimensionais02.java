package academy.devdojo.maratonajava.introduçao;

public class Aula08ArraysVetoresMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][3];

        for (int[] arrayBase: arrayInt){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
        System.out.println("-----------");
        int[][] arrayInt2 = {{1, 2, 5}, {1, 6, 8}, {7, 5, 3}};

        for (int[] Base: arrayInt2){
            for (int num: Base) {
                System.out.print(num + "  |");
            }
        }
    }
}
