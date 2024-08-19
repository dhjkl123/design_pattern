import scheduler.LeastJob;
import scheduler.PriorityAllocation;
import scheduler.RoundRobin;
import scheduler.Scheduler;

public class App {
    public static void main(String[] args) throws Exception {
        int ch = System.in.read();

        Scheduler scheduler = null;
        if(ch=='r' || ch=='R'){
            scheduler = new RoundRobin();
        }else if (ch == 'l' || ch=='L'){
            scheduler = new LeastJob();
        }else if(ch == 'p' || ch == 'P'){
            scheduler = new PriorityAllocation();
        }else{
            System.out.println("정의 되지 않은 입력");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
