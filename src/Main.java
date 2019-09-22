public class Main {

    public static void main(String[] args) {
        JobController AB, BD, BC, DE, CE, EF, EG;
        AB = new JobController();
        BD = new JobController();
        BC = new JobController();
        DE = new JobController();
        CE = new JobController();
        EF = new JobController();
        EG = new JobController();

        P1 p1 = new P1(AB, BD, DE, EF);
        P2 p2 = new P2(AB, BD, BC, DE, CE, EF, EG);
        P3 p3 = new P3(BC, CE, EG);

        p1.start();
        p2.start();
        p3.start();

        try {
            p1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            p3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
