package gamelevel;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    public void fly() {}; // hook 메소드

    public void go(int count){
        run();

        for(int i = 0; i < count ; i++){
            jump();
        }

        turn();
    }
}
