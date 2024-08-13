package entities;

public class UserPremium extends User {
    String perk;

    public UserPremium() {
        super();
    }

    public UserPremium(Integer index, String name, String perk) {
        super(index, name);
        this.perk = perk;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n"
                + perk;
    }
}
