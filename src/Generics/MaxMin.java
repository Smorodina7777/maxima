package Generics;

public class MaxMin<T extends Number> {
    private T tmax;
    private T tmin;


    public MaxMin(T tmax, T tmin) {
        this.tmax = tmax;
        this.tmin = tmin;
    }

    public T getTmax() {
        return tmax;
    }

    public void setTmax(T tmax) {
        this.tmax = tmax;
    }

    public T getTmin() {
        return tmin;
    }

    public void setTmin(T tmin) {
        this.tmin = tmin;
    }
}
