package bwapi;

public class PlayerSelf {
    /*
    * DIFFERENCE HERE IS THAT THIS SHOULD BE ADDED TO, INSTEAD OF TAKEN DIRECTLY.
    */
    int minerals;
    int gas;

    int[] supplyUsed = new int[3];

    boolean[] isResearching = new boolean[46 + 1];
    boolean[] isUpgrading = new boolean[46 + 1];

}
