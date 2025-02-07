public class Area {
    public static final double PI = 3.14159;
    public static double calcularQuadrado(double lado) {
        return lado * lado;
    }
    public static double calcularRetangulo(double largura, double altura) {
        return largura * altura;
    }
    public static double calcularTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static double calcularCirculo(double raio) {
        return PI * raio * raio;
    }
}
