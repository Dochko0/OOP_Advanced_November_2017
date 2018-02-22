package JarOfT;

public class Pickle {
    private static int currentCount = 0;
    private int count;

    public Pickle(){
        this.count=++currentCount;
    }

    @Override
    public String toString() {
        return "Pickle" + count;
    }
}
