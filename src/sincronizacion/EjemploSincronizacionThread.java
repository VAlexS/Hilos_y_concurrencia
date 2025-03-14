package sincronizacion;

import runable.ImprimirFrases;

public class EjemploSincronizacionThread {

    public static void main(String[] args) {

        Thread hilo1 = new Thread(new ImprimirFrases("Hola ", "qué tal"));
        Thread hilo2 = new Thread(new ImprimirFrases("¿Quien eres ", "tú?"));
        Thread hilo3 = new Thread(new ImprimirFrases("¡Muchas ", "gracias amigo!"));

        hilo1.start();
        hilo2.start();



        hilo3.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido");
            throw new RuntimeException(e);
        }

        System.out.println(hilo3.getState());





    }


}
