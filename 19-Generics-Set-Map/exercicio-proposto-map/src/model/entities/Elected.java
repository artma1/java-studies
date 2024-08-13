package model.entities;

public class Elected {

    private String name;
    private Integer votes;

    public Elected(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public Elected() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
