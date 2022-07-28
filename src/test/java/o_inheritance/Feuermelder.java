package o_inheritance;

import org.joda.time.DateTime;

public class Feuermelder extends Elektrogeräte {

    private long activationDate;
    private long endDate;

    public Feuermelder() {
        super(true);
        this.activationDate = new DateTime().getMillis();

    }

    public void turnOn() {
        System.out.println("turned on");
    }

    @Override
    public void aus() {

    }

    long batteryLeft = 100;

    public void getBatteryLeft() {
        this.endDate = new DateTime().getMillis();
        long seconds = (endDate- activationDate) / 1000;
        System.out.println(seconds);
    }

    public String toString() {

            //long batteryUses = getBatteryLeft();
            boolean batteryUses;
            return null;
        }
    }
