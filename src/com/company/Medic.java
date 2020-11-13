package com.company;

public class Medic extends Hero{

    @Override
    public void setHealth(int health) {
        super.setHealth(80);
    }

    @Override
    public void setToHeal(int toHeal) {
        super.setToHeal(25);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility("Treat allies");
    }
}
