package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class DuckRacer {
    //Fields
    private final int id;
    private final String name;
    private Collection<Reward> rewards = new ArrayList<>();

    //Constructors
    public DuckRacer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //action methods
    public void win(Reward reward){
        rewards.add(reward);
    }

    //Accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Derived property, no corresponding field
    public int getWins(){
        return rewards.size();
    }
    public Collection<Reward> getRewards() {
        return Collections.unmodifiableCollection(rewards);
    }

    @Override
    public String toString(){
        return String.format("%s id: %s, Name: %s, wins: %s rewards: %s",
                getClass().getSimpleName(), getId(), getName(), getRewards());
    }
}