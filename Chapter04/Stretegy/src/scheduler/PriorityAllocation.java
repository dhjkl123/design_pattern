package scheduler;

public class PriorityAllocation implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 상담 전화를 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무스킬이 높은 상담원을 우선 배분합니다.");
    }

}
