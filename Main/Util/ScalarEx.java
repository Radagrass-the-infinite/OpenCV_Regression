package Util;

import org.opencv.core.Scalar;

public class ScalarEx extends Scalar {
    public ScalarEx(double v0, double v1, double v2) {
        super(v0, v1, v2);
    }
    public void setH(int hVal){
        val[0] = hVal;
    }
    public void setS(int sVal){
        val[1] = sVal;
    }
    public void setV(int vVal){
        val[2] = vVal;
    }

    // same thing just only take the first 3 values
    @Override
    public String toString() {
        return "[" + val[0] + ", " + val[1] + ", " + val[2] + "]";
    }
}
