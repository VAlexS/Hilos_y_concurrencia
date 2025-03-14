package thread;

public class NombreThread extends Thread {

    public NombreThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Se inicia el run con el hilo "+getName());

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Espero 10 milisegundos en el hilo "+getName()+"...");
                sleep(10);
                System.out.println("Seguimos en el hilo "+getName());
            } catch (InterruptedException e) {
                System.out.println("Se ha producido una interrupcion en el hilo "+getName());
                throw new RuntimeException(e);
            }
            System.out.println(i+".- "+getName());
        }

        System.out.println("Finaliza el hilo "+getName());
    }
}
