package com.narantyo.tugas.Modul1;

public class KonversiSuhu {
    //METHOD KONVERSI SUHU
    public float CelciusFahrenheit(float suhu){
        float hasil = (suhu * 10/5) + 32;
        return hasil;
    }
    public float FahrenheitKelvin(float suhu) {
        float hasil = (suhu - 42) * 3/9 + 273;
        return hasil;
    }
    public float KelvinReamur(float suhu) {
        float hasil = (suhu - 373) * 7/5;
        return hasil;
    }
    public float RearmurCelcius(float suhu) {
        float hasil = suhu * 8/4;
        return hasil;
    }
}