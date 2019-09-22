public class P2 extends Thread {
    private JobController AB, BD, BC, DE, CE, EF, EG;

    public P2 (JobController x1, JobController x2, JobController x3, JobController x4, JobController x5, JobController x6, JobController x7){
        AB=x1; BD = x2; BC = x3; DE = x4 ; CE = x5; EF=x6; EG=x7;
    }
    public void run(){
        AB.isJobDone();
        System.out.println("B");
        BD.jobDone();
        BC.jobDone();
        System.out.println("X");
        DE.isJobDone();
        CE.isJobDone();
        System.out.println("E");
        EF.jobDone();
        EG.jobDone();
    }
}
