package boxing;

public class BoxingUnboxing {

    public static void main(String[] args) {

        // Boxing é o processo de conversão de um objeto tipo valor
        // para um objeto tipo referência compatível

        int x = 20;
        Object obj = x;
        System.out.println(obj);

        // Unboxing é o processo de conversão de um objeto tipo referência
        // para um objeto tipo valor compatível

        int y = (int) obj;
        System.out.println(y);

        // Wrapper classes
        // têm o objetivo de tratar os tipos primitivos como classes de forma
        // transparente ao compilador, sem precisar usar castings ou fazer conversões
    }
}