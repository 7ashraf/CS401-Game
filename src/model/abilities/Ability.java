package model.abilities;

public class Ability {
    private String name;
    private int manaCost;
    private int baseCooldown;
    private int CurrentCooldown;
    private int castRange;
    private int requiredActionPoints;
    AreaOfEffect castArea;

    public Ability(String name,
                   int manaCost,
                   int baseCooldown,
                   int castRange,
                   int requiredActionPoints,
                   AreaOfEffect castArea) {
        this.name = name;
        this.manaCost = manaCost;
        this.baseCooldown = baseCooldown;
        this.castRange = castRange;
        this.requiredActionPoints = requiredActionPoints;
        this.castArea = castArea;
    }

    public void setCurrentCooldown(int currentCooldown) {
        CurrentCooldown = currentCooldown;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getBaseCooldown() {
        return baseCooldown;
    }

    public int getCurrentCooldown() {
        return CurrentCooldown;
    }

    public int getCastRange() {
        return castRange;
    }

    public int getRequiredActionPoints() {
        return requiredActionPoints;
    }

    public AreaOfEffect getCastArea() {
        return castArea;
    }
}
