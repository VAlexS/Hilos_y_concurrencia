package sincronizacion;

public class EjemploProductorConsumidor {

    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();

        new Thread(new Productor(panaderia)).start();
        new Thread(new Consumidor(panaderia)).start();
    }
}
