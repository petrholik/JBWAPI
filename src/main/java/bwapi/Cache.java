package bwapi;


class Cache<T> {
    private int frame = -1;
    private T obj;

    Cache() { }

    void set(T obj, int frame) {
        this.frame = frame;
        this.obj = obj;
    }

    boolean sameFrame(int currentFrame) {
        return frame == currentFrame;
    }

    T get() {
        return obj;
    }
}

class IntegerCache extends Cache<Integer> {

    void addOrSet(int obj, int frame) {
        if (sameFrame(frame)) {
            set(get() + obj, frame);
        }
        else {
            set(obj, frame);
        }
    }
}

class BooleanCache extends Cache<Boolean>{}
class OrderCache extends Cache<Order>{}
class UnitTypeCache extends Cache<UnitType>{}
class UpgradeTypeCache extends Cache<UpgradeType>{}
class TechTypeCache extends Cache<TechType>{}