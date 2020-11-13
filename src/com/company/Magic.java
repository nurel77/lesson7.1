package com.company;

public class Magic extends Hero {

    @Override
    public void setHealth(int health) {
        super.setHealth(100);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(44);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility("Fire ball");

    }
}
