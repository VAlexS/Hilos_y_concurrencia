package thread;

public class EjemploExtenderThread {

    public static void main(String[] args) {

        Thread hilo = new NombreThread("John Doe");


        hilo.start();

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();


        /*System.out.println("Estado del hilo "+hilo.getName()+": "+hilo.getState());
        System.out.println("Estado del hilo "+hilo2.getName()+": "+hilo2.getState());*/

    }
}
