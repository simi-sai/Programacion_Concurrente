public class Process2 implements Runnable {
    
    private Variable v;

    public Process2(Variable v) {
        this.v = v;
    }

    public void run() {
        while(true) {
            v.y2 = v.y1 + 1;

            while(!(v.y1 == 0 || v.y2 < v.y1)) {
                v.inCritical++;
                v.inCritical--;
                v.y2 = 0;

                System.out.println("Process 2 - inCritical   ");
                System.out.println(v.inCritical);
            }
        }
    }
}
