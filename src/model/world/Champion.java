package model.world;

import model.abilities.Ability;
import model.effects.Effect;

import java.awt.*;
import java.util.ArrayList;

public class Champion {
    private String name;
    private int maxHP;

    private int currentHP;
    private int mana;

    private int maxActionPointsPerTurn;
    private int currentActionPoints;

    private int attackRange;
    private int attackDamage;

    private int speed;

    private ArrayList<Ability> abilities;
    private ArrayList<Effect> appliedEffects;

    private Condition condition;
    private Point location;

    public Champion(String name, int maxHP, int mana, int maxActionPointsPerTurn, int attackRange, int attackDamage, int speed) {
        this.name = name;
        this.maxHP = maxHP;
        this.mana = mana;
        this.maxActionPointsPerTurn = maxActionPointsPerTurn;
        this.attackRange = attackRange;
        this.attackDamage = attackDamage;
        this.speed = speed;
        condition = Condition.ACTIVE;

    }

    public String getName() {
        return name;
    }



    public int getMaxHP() {
        return maxHP;
    }



    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxActionPointsPerTurn() {
        return maxActionPointsPerTurn;
    }

    public void setMaxActionPointsPerTurn(int maxActionPointsPerTurn) {
        this.maxActionPointsPerTurn = maxActionPointsPerTurn;
    }

    public int getCurrentActionPoints() {
        return currentActionPoints;
    }

    public void setCurrentActionPoints(int currentActionPoints) {
        this.currentActionPoints = currentActionPoints;
    }

    public int getAttackRange() {
        return attackRange;
    }



    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }



    public ArrayList<Effect> getAppliedEffects() {
        return appliedEffects;
    }



    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
