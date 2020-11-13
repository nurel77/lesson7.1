package com.company;

public class Warrior extends Hero{

    @Override
    public void setHealth(int health) {
        super.setHealth(150);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(64);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility("Hulk crashes !!!" );
    }
}
