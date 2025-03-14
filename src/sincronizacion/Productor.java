package sincronizacion;

import java.util.concurrent.ThreadLocalRandom;

public class Productor implements Runnable {

    private Panaderia panaderia;

    public Productor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            panaderia.hornear("Pan N°" + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido");
                throw new RuntimeException(e);
            }

        }

    }
}
