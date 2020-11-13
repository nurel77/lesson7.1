package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int Health;
    private int Damage;
    private int toHeal;
    private String NameHero;

    public String getNameHero(String magic) {
        return NameHero;
    }

    public void setNameHero(String nameHero) {
        NameHero = nameHero;
    }

    public int getToHeal() {
        return toHeal;
    }

    public void setToHeal(int toHeal) {
        this.toHeal = toHeal;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

    }
}
