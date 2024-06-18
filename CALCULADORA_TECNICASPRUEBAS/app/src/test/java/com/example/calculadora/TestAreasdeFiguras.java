package com.example.calculadora;

public class TestAreasdeFiguras {public class AreasdeFiguras {

    public static void main(String[] args) {
        // Ejemplo de cálculo de área de un trapecio
        double baseMayor = 10.0;
        double baseMenor = 6.0;
        double altura = 5.0;

        // Calcular área del trapecio
        double areaTrapecio = calcularAreaTrapecio(baseMayor, baseMenor, altura);
        System.out.println("El área del trapecio con base mayor " + baseMayor + ", base menor " + baseMenor +
                " y altura " + altura + " es: " + areaTrapecio);
    }

    // Método para calcular el área de un trapecio
    public static double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }
}

}
