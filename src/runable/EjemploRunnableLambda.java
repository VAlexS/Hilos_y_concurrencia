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

        Thread main = Thread.currentThread();

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

            //System.out.println("Finaliza el hilo "+nombre);
            System.out.println("Finalmente, me voy de de viaje a "+nombre);
            System.out.println(main.getState());
        };

        Thread v1 = new Thread(viaje, "Isla de Pascua");
        Thread v2 = new Thread(viaje, "Robinson Crusoe");
        Thread v3 = new Thread(viaje, "Juan Fernandez");
        Thread v4 = new Thread(viaje, "Isla de Chiloe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        try {
            v1.join();
            v2.join();
            v3.join();
            v4.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo ha sido interrumpido");
            throw new RuntimeException(e);
        }


        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("Continua la ejecución del main: "+main.getName());




    }
}
