package bwapi;

public class UnitSelf {
    Order order;
    int targetPositionX;
    int targetPositionY;
    int orderTargetPositionX;
    int orderTargetPositionY;
    int target;
    boolean isConstructing;
    boolean isIdle;
    UnitType buildType;
    Order secondaryOrder;
    int remainingBuildTime;
    int buildUnit;
    UnitType type;
    boolean isMorphing;
    boolean isCompleted;
    int remainingResearchTime;
    TechType tech;
    UnitType[] trainingQueue = new UnitType[5];
    int trainingQueueCount;
    boolean isTraining;
    int remainingTrainTime;
    UpgradeType upgrade;
    int remainingUpgradeTime;

    int energy;
    boolean isMoving;
    boolean isGathering;

    int rallyPositionX;
    int rallyPositionY;
    int rallyUnit;

    int hitPoints;
    int stimTimer;

    int orderTarget;
}
