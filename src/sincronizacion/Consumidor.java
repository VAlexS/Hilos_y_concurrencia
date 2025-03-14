package sincronizacion;

public class Consumidor implements Runnable {

    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String panConsumido = panaderia.consumir();
            System.out.println("Cliente consume: " + panConsumido);
        }
    }
}
