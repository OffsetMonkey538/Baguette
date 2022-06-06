package com.github.offsetmonkey538.baguette.config;

import java.io.Serializable;

public final class BaguetteConfig implements Serializable {
    private int tntBaguetteExplosionStrength =            6;

    private int chargedTntBaguetteExplosionStrength =     12;

    private int waterBaguetteHungerDurationTicks =        1200;
    private int waterBaguetteHungerAmplifier =            0;
    private float waterBaguetteHungerChance =             100;

    private int waterBaguetteNauseaDurationTicks =        600;
    private int waterBaguetteNauseaAmplifier =            0;
    private float waterBaguetteNauseaChance =             100;

    private int waterBaguetteWaterBreathingDurationTicks =        3600;
    private int waterBaguetteWaterBreathingAmplifier =            0;
    private float waterBaguetteWaterBreathingChance =             100;

    private int fireBaguetteFireResistanceDurationTicks = 3600;
    private int fireBaguetteFireResistanceAmplifier =     0;
    private float fireBaguetteFireResistanceChance =      100;

    public BaguetteConfig() {

    }

    //
    // Setters
    //

    public void setTntBaguetteExplosionStrength(int tntBaguetteExplosionStrength) {
        this.tntBaguetteExplosionStrength = tntBaguetteExplosionStrength;
    }
    public void setChargedTntBaguetteExplosionStrength(int chargedTntBaguetteExplosionStrength) {
        this.chargedTntBaguetteExplosionStrength = chargedTntBaguetteExplosionStrength;
    }
    public void setWaterBaguetteHungerDurationTicks(int waterBaguetteHungerDurationTicks) {
        this.waterBaguetteHungerDurationTicks = waterBaguetteHungerDurationTicks;
    }
    public void setWaterBaguetteHungerAmplifier(int waterBaguetteHungerAmplifier) {
        this.waterBaguetteHungerAmplifier = waterBaguetteHungerAmplifier;
    }
    public void setWaterBaguetteHungerChance(float waterBaguetteHungerChance) {
        this.waterBaguetteHungerChance = waterBaguetteHungerChance;
    }
    public void setWaterBaguetteNauseaDurationTicks(int waterBaguetteNauseaDurationTicks) {
        this.waterBaguetteNauseaDurationTicks = waterBaguetteNauseaDurationTicks;
    }
    public void setWaterBaguetteNauseaAmplifier(int waterBaguetteNauseaAmplifier) {
        this.waterBaguetteNauseaAmplifier = waterBaguetteNauseaAmplifier;
    }
    public void setWaterBaguetteNauseaChance(float waterBaguetteNauseaChance) {
        this.waterBaguetteNauseaChance = waterBaguetteNauseaChance;
    }
    public void setFireBaguetteFireResistanceDurationTicks(int fireBaguetteFireResistanceDurationTicks) {
        this.fireBaguetteFireResistanceDurationTicks = fireBaguetteFireResistanceDurationTicks;
    }
    public void setFireBaguetteFireResistanceAmplifier(int fireBaguetteFireResistanceAmplifier) {
        this.fireBaguetteFireResistanceAmplifier = fireBaguetteFireResistanceAmplifier;
    }
    public void setFireBaguetteFireResistanceChance(float fireBaguetteFireResistanceChance) {
        this.fireBaguetteFireResistanceChance = fireBaguetteFireResistanceChance;
    }
    public void setWaterBaguetteWaterBreathingDurationTicks(int waterBaguetteWaterBreathingDurationTicks) {
        this.waterBaguetteWaterBreathingDurationTicks = waterBaguetteWaterBreathingDurationTicks;
    }
    public void setWaterBaguetteWaterBreathingAmplifier(int waterBaguetteWaterBreathingAmplifier) {
        this.waterBaguetteWaterBreathingAmplifier = waterBaguetteWaterBreathingAmplifier;
    }
    public void setWaterBaguetteWaterBreathingChance(float waterBaguetteWaterBreathingChance) {
        this.waterBaguetteWaterBreathingChance = waterBaguetteWaterBreathingChance;
    }


    //
    // Getters
    //

    public int getTntBaguetteExplosionStrength() {
        return tntBaguetteExplosionStrength;
    }
    public int getChargedTntBaguetteExplosionStrength() {
        return chargedTntBaguetteExplosionStrength;
    }
    public int getWaterBaguetteHungerDurationTicks() {
        return waterBaguetteHungerDurationTicks;
    }
    public int getWaterBaguetteHungerAmplifier() {
        return waterBaguetteHungerAmplifier;
    }
    public float getWaterBaguetteHungerChance() {
        return waterBaguetteHungerChance;
    }
    public int getWaterBaguetteNauseaDurationTicks() {
        return waterBaguetteNauseaDurationTicks;
    }
    public int getWaterBaguetteNauseaAmplifier() {
        return waterBaguetteNauseaAmplifier;
    }
    public float getWaterBaguetteNauseaChance() {
        return waterBaguetteNauseaChance;
    }
    public int getFireBaguetteFireResistanceDurationTicks() {
        return fireBaguetteFireResistanceDurationTicks;
    }
    public int getFireBaguetteFireResistanceAmplifier() {
        return fireBaguetteFireResistanceAmplifier;
    }
    public float getFireBaguetteFireResistanceChance() {
        return fireBaguetteFireResistanceChance;
    }
    public int getWaterBaguetteWaterBreathingDurationTicks() {
        return waterBaguetteWaterBreathingDurationTicks;
    }
    public int getWaterBaguetteWaterBreathingAmplifier() {
        return waterBaguetteWaterBreathingAmplifier;
    }
    public float getWaterBaguetteWaterBreathingChance() {
        return waterBaguetteWaterBreathingChance;
    }
}
