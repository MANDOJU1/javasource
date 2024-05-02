package study;

import java.util.ArrayList;

public class ThreePrinter<T> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    ArrayList<String> list = new ArrayList<>();
}
