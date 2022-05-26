package A;

public class manager {
    private String name;
    private int salar;

    public manager(String name, int salar) {
        this.name = name;
        this.salar = salar;
    }

    public manager() {
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
