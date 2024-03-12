package tareas;

public class Tarea {
    
    public Tarea() {
        System.out.printf("En Tarea thread \" %s\": ", Thread.currentThread().getName());

        Calculator calc = new Calculator(4);
        Thread h1 = new Thread(calc);

        h1.start();
        h1.run();

        System.out.printf("En Tarea thread \" %s\": ", Thread.currentThread().getName());
    }
}
