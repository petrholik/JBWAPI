package bwapi;

class GameContainer {
    private static Game game;

    static void setGame(final Game game) {
        if (!Thread.currentThread().getStackTrace()[2].getClassName().equals(EventHandler.class.getName())) {
            System.err.println("Shouldn't call setGame if not in bwapi.EventHandler");
        }
        GameContainer.game = game;
    }
    static Game getGame() {
        return game;
    }
}
