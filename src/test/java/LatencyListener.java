import bwapi.*;

import java.util.Random;

import static bwapi.UnitFilter.*;


public class LatencyListener extends DefaultBWListener {
    final BWClient bwClient;

    Random random;
    Game game;
    Player self;
    Unit[] minerals;
    Unit[] workers;

    LatencyListener() {
        bwClient = new BWClient(this);
        bwClient.startGame();
    }

    public void onStart() {
        game = bwClient.getGame();
        self = game.self();
        random = new Random();

        game.setLatCom(true);
        System.out.println("latcom: " + game.isLatComEnabled());

        minerals = game.getMinerals().stream().filter(IsVisible).toArray(Unit[]::new);
        workers = game.getAllUnits().stream().filter(GetPlayer(p -> p.equals(self)).and(IsWorker)).toArray(Unit[]::new);

        for (Unit worker: workers) {
            worker.gather(minerals[random.nextInt(minerals.length)]);
        }
    }

    public void onFrame() {
        if (game.getFrameCount() > 2) System.exit(0);
        System.out.println("FRAME: " + game.getFrameCount());
        for (Unit worker: workers) {
            System.out.println("---------------");
            System.out.println("Worker " + worker.getID());
            System.out.println("idle: " + worker.isIdle());
            System.out.println("order: " + worker.getOrder());
            System.out.println("orderTargetId: " + worker.getOrderTarget());
        }
    }

    public static void main(String[] args) {
        new LatencyListener();
    }
}
