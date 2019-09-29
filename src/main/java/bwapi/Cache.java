package bwapi;


class Cache<T> {
    protected int frame = -1;
    protected T obj;

    Cache() { }

    void update(T obj, int frame) {
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
            this.obj += obj;
        }
        else {
            this.obj = obj;
        }
        this.frame = frame;
    }
}

class BooleanCache extends Cache<Boolean>{}
