package model.services;

import model.entities.User;

//testei primeiro com hashCode e equals
//depois testei só com equals usando 10000000 e Artur9999999
//não houve aumento de tempo considerável

import java.util.List;

public class Find {

    String nameOnList;
    public boolean findName(List<? extends User> list, String name) {

        //Integer n = name.hashCode();
        try {
            for (User user : list) {
                if (name.equals(user.getName())) {
                    this.nameOnList = user.getName();
                    return name.equals(user.getName());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("An unexpected error occurred while checking the list.", e);
        }
        if (nameOnList == null) {
            throw new NullPointerException("Can't find name on list!");
        }
        return name.equals(nameOnList);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

