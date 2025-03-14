package runable;

public class EjemploImplementarThread {

    public static void main(String[] args) {

        Thread hilo1 = new Thread(new ViajeTarea("Isla de Pascua"));
        Thread hilo2 = new Thread(new ViajeTarea("Robinson Crusoe"));
        Thread hilo3 = new Thread(new ViajeTarea("Juan Fernandez"));
        Thread hilo4 = new Thread(new ViajeTarea("Isla de Chiloe"));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}
