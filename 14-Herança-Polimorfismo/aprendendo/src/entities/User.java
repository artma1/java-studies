package entities;

public class User {

    private int index;
    private String name;
    private double discount;

    public User() {
    }

    public User(Integer index, String name) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return index
                + "\n"
                + name;
    }
}
