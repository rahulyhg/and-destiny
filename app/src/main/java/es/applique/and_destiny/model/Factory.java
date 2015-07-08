package es.applique.and_destiny.model;

public class Factory {

    static public Sign createSign(String name) {
        Sign sign = new Sign();
        sign.setName(name);
        sign.setDescription("Esta es la descripción");
        sign.setColor("Rojo");
        sign.setPlanet("Marte");
        sign.setDailyHoroscope("Horóscopo diario");
        sign.setWeeklyHoroscope("Horóscopo semanal");
        sign.setMonthlyHoroscope("Horóscopo mensual");
        sign.setLove(4);
        sign.setFinance(3);
        sign.setCarrer(3);
        sign.setMood(1);
        sign.addLuckyNumber(5);
        sign.addLuckyNumber(8);

        Sign comp1 = new Sign();
        comp1.setName("Piscis");

        Sign comp2 = new Sign();
        comp2.setName("Tauro");
        sign.addCompatibleSign(comp1);
        sign.addCompatibleSign(comp2);
        return sign;
    }
}
