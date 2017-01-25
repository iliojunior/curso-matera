public class Inicio {
    public static void main(String[] args){
        System.out.println("Inicio");
        metodoA();
        System.out.println("Fim");
    }

    private static void metodoA() {
        System.out.println("entrou metodoA");
        int[] array = new int[5];
        for (int i = 0; i <= 7; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("saiu metodoA");
    }
}
