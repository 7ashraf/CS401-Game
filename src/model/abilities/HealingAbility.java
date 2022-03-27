package model.abilities;

public class HealingAbility extends Ability{
    private int healAmount;
    public HealingAbility(String name, int manaCost, int baseCooldown, int castRange, int requiredActionPoints, AreaOfEffect castArea, int healAmount) {
        super(name, manaCost, baseCooldown, castRange, requiredActionPoints, castArea);
        this.healAmount = healAmount;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }
}
