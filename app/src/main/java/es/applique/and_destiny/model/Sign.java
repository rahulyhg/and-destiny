package es.applique.and_destiny.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sign implements Serializable, Comparable {
    private String name;
    private String description;
    private String color;
    private String planet;

    private String dailyHoroscope;
    private String weeklyHoroscope;
    private String monthlyHoroscope;

    private Integer love;
    private Integer finance;
    private Integer carrer;
    private Integer mood;

    private TreeSet<Integer> luckyNumbers;
    private TreeSet<Sign> compatibleSigns;

    public Sign() {
        name = description = color = planet = dailyHoroscope = weeklyHoroscope =
                monthlyHoroscope = "";
        love = finance = carrer = mood = 0;
        luckyNumbers = new TreeSet<Integer>();
        compatibleSigns = new TreeSet<Sign>();
    }

    public void setName(String n) {
        name = n;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setPlanet(String p) {
        planet = p;
    }

    public void setDailyHoroscope(String h) {
        dailyHoroscope = h;
    }

    public void setWeeklyHoroscope(String h) {
        weeklyHoroscope = h;
    }

    public void setMonthlyHoroscope(String h) {
        monthlyHoroscope = h;
    }

    public void setLove(Integer i) {
        love = i;
    }

    public void setFinance(Integer i) {
        finance = i;
    }

    public void setCarrer(Integer i) {
        carrer = i;
    }

    public void setMood(Integer i) {
        mood = i;
    }

    /**
     * Get sign name.
     * @return Sign name.
     */
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDailyHoroscope() {
        return dailyHoroscope;
    }

    public String getWeeklyHoroscope() {
        return weeklyHoroscope;
    }

    public String getMonthlyHoroscope() {
        return monthlyHoroscope;
    }

    public Integer getLove() {
        return love;
    }

    public Integer getFinance() {
        return finance;
    }

    public Integer getCarrer() {
        return carrer;
    }

    public Integer getMood() {
        return mood;
    }

    public String getColor() {
        return color;
    }

    public String getPlanet() {
        return planet;
    }

    public Set<Integer> getLuckyNumbers() {
        return luckyNumbers;
    }

    public Set<Sign> getCompatibleSigns() {
        return compatibleSigns;
    }

    /**
     * Adds the specified number to this set if it is not already present.
     * @param i number to be added to this set.
     * @return true if this set did not already contain the specified element.
     */
    public boolean addLuckyNumber(Integer i) {
        return luckyNumbers.add(i);
    }

    /**
     * Adds the specified sign to this set if it is not already present.
     * @param sign sign to be added to this set.
     * @return true if this set did not already contain the specified element.
     */
    public boolean addCompatibleSign(Sign sign) {
        return compatibleSigns.add(sign);
    }

    @Override
    public int compareTo(Object other) {
        return (other != null) ? name.compareTo(other.toString()) : 1;
    }

    @Override
    public String toString() {
        return name;
    }
}
