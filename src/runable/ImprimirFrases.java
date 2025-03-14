package runable;

import sincronizacion.EjemploSincronizacionThread;

public class ImprimirFrases implements Runnable {

    private String frase1;
    private String frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    //la idea es unir ambas frases para que sea coherente.
    private synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido");
            throw new RuntimeException(e);
        }

        System.out.println(frase2);
    }

    @Override
    public void run() {
        imprimirFrases(frase1, frase2);
    }
}
