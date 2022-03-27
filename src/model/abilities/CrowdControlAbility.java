package model.abilities;

import model.effects.Effect;

public class CrowdControlAbility extends Ability{
    Effect effect;
    public CrowdControlAbility(String name, int manaCost, int baseCooldown, int castRange, int requiredActionPoints, AreaOfEffect castArea, Effect effect) {
        super(name, manaCost, baseCooldown, castRange, requiredActionPoints, castArea);
        this.effect = effect;
    }

    public Effect getEffect() {
        return effect;
    }
}
