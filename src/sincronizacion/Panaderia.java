package sincronizacion;

public class Panaderia {

    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa) {
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido");
                throw new RuntimeException(e);
            }
        }
        pan = masa;
        System.out.println("Panadero hornea: " + pan);
        disponible = true;
        notify();
    }

    public synchronized String consumir() {
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido");
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente consume: " + pan);
        disponible = false;
        notify();
        return pan;
    }
}
