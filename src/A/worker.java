package A;

public class worker {
    private String name;
    private int salar;

    public worker(String name, int salar) {
        this.name = name;
        this.salar = salar;
    }

    public worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }
}
