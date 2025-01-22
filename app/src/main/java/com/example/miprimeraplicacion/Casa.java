package com.example.miprimeraplicacion;

public class Casa {


    private String ubicacion;
    private int cantidadHabitaciones;

    public Casa(String ubicacion, int cantidadHabitaciones) {
        this.ubicacion = ubicacion;
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
}
