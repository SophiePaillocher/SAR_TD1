public class P1 extends Thread {
    private JobController AB, BD, DE, EF;
    public P1(JobController x1, JobController x2,JobController x3, JobController x4){
        AB=x1;
        BD = x2;
        DE = x3;
        EF = x4;
    }
    public void run(){
        System.out.println("A");
        AB.jobDone();
        BD.isJobDone();
        System.out.println("D");
        DE.jobDone();
        EF.isJobDone();
        System.out.println("F");
    }
}
