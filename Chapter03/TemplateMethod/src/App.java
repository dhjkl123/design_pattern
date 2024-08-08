import gamelevel.AdvancedLevel;
import gamelevel.Player;
import gamelevel.SuperLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvancedLevel());
        player.play(2);

        player.upgradeLevel(new SuperLevel());
        player.play(3);
    }
}
