package productorConsumidor;

public class ThreadApp2 {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        p.start();
        c.start();

        try {
            System.in.read();
        } catch (Exception e) { }
    }
}