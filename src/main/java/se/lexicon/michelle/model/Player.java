package se.lexicon.michelle.model;

import java.util.Arrays;

public class Player {
    private String name;
    private  int strength,
                    life,
                    score;
    private  int    maxlife ;
    private String[] battleHistory;



    public Player(String name, int strength, int maxlife) {
        this.name = name;
        this.strength = strength;
        this.maxlife = maxlife;
        battleHistory = new String[0];
        setLife(maxlife);
        score = 0;
    }

    public boolean isAlive(){
        return life < 0;
    }
    public int attack(int random){
        return strength + random;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMaxlife() {
        return maxlife;
    }

    public String[] getBattleHistory() {
        return battleHistory;
    }
    public void addBattleHistory(String addedBattleHistory){
        String[] temp = Arrays.copyOf(battleHistory, battleHistory.length + 1);
        temp[temp.length-1] = addedBattleHistory;
        battleHistory = temp;
    }



}
