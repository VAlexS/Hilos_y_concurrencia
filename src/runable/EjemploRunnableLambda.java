package runable;

public class EjemploRunnableLambda {

    public static void main(String[] args) {

        /*Runnable viaje = new Runnable() {
            @Override
            public void run() {

                String nombre = Thread.currentThread().getName();

                System.out.println("Se inicia el run con el hilo "+nombre);

                for (int i = 0; i < 10; i++) {
                    System.out.println(i + ".- " + nombre);
                    try {
                        long tiempoPausa = (long) (Math.random() * 1000);
                        System.out.println("Espero "+tiempoPausa+" milisegundos en el hilo "+nombre+"...");
                        Thread.sleep(tiempoPausa);
                        System.out.println("Seguimos en el hilo "+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Finaliza el hilo "+nombre);
            }
        };*/

        Runnable viaje = () -> {

            String nombre = Thread.currentThread().getName();

            System.out.println("Se inicia el run con el hilo "+nombre);

            for (int i = 0; i < 10; i++) {
                System.out.println(i + ".- " + nombre);
                try {
                    long tiempoPausa = (long) (Math.random() * 1000);
                    System.out.println("Espero "+tiempoPausa+" milisegundos en el hilo "+nombre+"...");
                    Thread.sleep(tiempoPausa);
                    System.out.println("Seguimos en el hilo "+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Finaliza el hilo "+nombre);
        };

        new Thread(viaje, "Isla de Pascua").start();
        new Thread(viaje, "Robinson Crusoe").start();
        new Thread(viaje, "Juan Fernandez").start();
        new Thread(viaje, "Isla de Chiloe").start();


    }
}
