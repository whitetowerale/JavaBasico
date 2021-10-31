package com.S4Poo.S4Ejercicio;

public class SmartWatch extends SmartDevice {

    String spconector;

    public SmartWatch() {
    }

    public SmartWatch(Boolean sdendendido, String sdversion, double sdtamPantalla, double sdcapacidadBat, String sdcolorCarcasa, String sdso, String spconector) {
        super(sdendendido, sdversion, sdtamPantalla, sdcapacidadBat, sdcolorCarcasa, sdso);
        this.spconector = spconector;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sdendendido=" + sdendendido +
                ", sdversion='" + sdversion + '\'' +
                ", sdtamPantalla=" + sdtamPantalla +
                ", sdcapacidadBat=" + sdcapacidadBat +
                ", sdcolorCarcasa='" + sdcolorCarcasa + '\'' +
                ", sdso='" + sdso + '\'' +
                ", spconector='" + spconector + '\'' +
                '}';
    }
}
