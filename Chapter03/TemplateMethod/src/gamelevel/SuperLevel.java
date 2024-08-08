package gamelevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("매우 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("매우 높게 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("매우 빨리 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급 레벨입니다.");
    }

    @Override
    public void fly() {
        System.out.println("날아갑니다.");
    }

}
