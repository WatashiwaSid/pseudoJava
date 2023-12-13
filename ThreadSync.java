class PatternPrinter {

    synchronized void printStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    synchronized void printHash(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

class StarThread extends Thread {

    private PatternPrinter printer;
    private int n;

    public StarThread(PatternPrinter printer, int n) {
        this.printer = printer;
        this.n = n;
    }

    @Override
    public void run() {
        printer.printStars(n);
    }
}

class HashThread extends Thread {

    private PatternPrinter printer;
    private int n;

    public HashThread(PatternPrinter printer, int n) {
        this.printer = printer;
        this.n = n;
    }

    @Override
    public void run() {
        printer.printHash(n);
    }
}

public class ThreadSync {

    public static void main(String[] args) {
        PatternPrinter printer = new PatternPrinter();
        StarThread starThread = new StarThread(printer, 5);
        HashThread hashThread = new HashThread(printer, 5);
        starThread.start();
        hashThread.start();
    }
}
