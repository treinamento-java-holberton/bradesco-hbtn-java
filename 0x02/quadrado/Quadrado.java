public class Quadrado {
    public static double area(double lado) {
        if(lado < 1) {
            throw new java.lang.IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return lado * lado;
    }
}