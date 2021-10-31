package com.S4Poo.S4Ejercicio;

public class SmartPhone extends SmartDevice{

    boolean swpulsometro;
    String swcolorCorrea;

    public SmartPhone() {
    }

    public SmartPhone(Boolean sdendendido, String sdversion, double sdtamPantalla, double sdcapacidadBat, String sdcolorCarcasa, String sdso, boolean swpulsometro, String swcolorCorrea) {
        super(sdendendido, sdversion, sdtamPantalla, sdcapacidadBat, sdcolorCarcasa, sdso);
        this.swpulsometro = swpulsometro;
        this.swcolorCorrea = swcolorCorrea;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sdendendido=" + sdendendido +
                ", sdversion='" + sdversion + '\'' +
                ", sdtamPantalla=" + sdtamPantalla +
                ", sdcapacidadBat=" + sdcapacidadBat +
                ", sdcolorCarcasa='" + sdcolorCarcasa + '\'' +
                ", sdso='" + sdso + '\'' +
                ", swpulsometro=" + swpulsometro +
                ", swcolorCorrea='" + swcolorCorrea + '\'' +
                '}';
    }
}
