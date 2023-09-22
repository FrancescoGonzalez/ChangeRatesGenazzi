package S6;

import javax.management.OperationsException;

public class Box {
    private int x;
    private int y;
    private int z;
    public Box() {
        x = 1;
        y = 1;
        z = 1;
    }
    public void setX(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("less than 0 is not a valid argument");
        }
        this.x = x;
    }
    public void setY(int y) {
        if (y < 0) {
            throw new IllegalArgumentException("less than 0 is not a valid argument");
        }
        this.y = y;
    }
    public void setZ(int z) {
        if (z < 0) {
            throw new IllegalArgumentException("less than 0 is not a valid argument");
        }
        this.z = z;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public int volume() {
        try {
            return (x * y * z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
