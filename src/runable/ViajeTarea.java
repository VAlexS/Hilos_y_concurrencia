package runable;

public class ViajeTarea implements Runnable {

    private final String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {

        System.out.println("Se inicia el run con el hilo "+nombre);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ".- " + nombre);
            try {
                long tiempoPausa = (long) (Math.random() * 1000);
                System.out.println("Espero "+tiempoPausa+" milisegundos en el hilo "+nombre+"...");
                Thread.sleep(tiempoPausa);
                System.out.println("Seguimos en el hilo "+nombre);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Finaliza el hilo "+nombre);
    }
}
