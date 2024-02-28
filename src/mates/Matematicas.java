package mates;

public class Matematicas {
    public static double piRecursivo(long pasos) {
        return piRecursivo(pasos, 0, 0);
    }

    private static double piRecursivo(long pasos, long contador, long puntosDentroDelCirculo) {
        if (contador == pasos) {
            return 4 * (double) puntosDentroDelCirculo / pasos;
        } else {
            double x = Math.random();
            double y = Math.random();
            // Si el punto generado está dentro del círculo de radio 1, incrementamos el contador
            if (x * x + y * y <= 1) {
                puntosDentroDelCirculo++;
            }
            return piRecursivo(pasos, contador + 1, puntosDentroDelCirculo);
        }
    }
}