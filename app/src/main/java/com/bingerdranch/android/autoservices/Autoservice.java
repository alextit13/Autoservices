package com.bingerdranch.android.autoservices;

public class Autoservice {
    private String marka;
    private String model;
    private String okrug;
    private String rayon;
    private String metro;
    private String vid_rabot;

    public Autoservice(String marks) {
        this.marka = marks;
    }

    public Autoservice(String marks, String model) {
        this.marka = marks;
        this.model = model;
    }

    public Autoservice(String marks, String model, String okrug) {
        this.marka = marks;
        this.model = model;
        this.okrug = okrug;
    }

    public Autoservice(String marks, String model, String okrug, String rayon) {
        this.marka = marks;
        this.model = model;
        this.okrug = okrug;
        this.rayon = rayon;
    }

    public Autoservice(String marks, String model, String okrug, String rayon, String metro) {
        this.marka = marks;
        this.model = model;
        this.okrug = okrug;
        this.rayon = rayon;
        this.metro = metro;
    }

    public Autoservice(String marks, String model, String okrug, String rayon, String metro, String vid_rabot) {
        this.marka = marks;
        this.model = model;
        this.okrug = okrug;
        this.rayon = rayon;
        this.metro = metro;
        this.vid_rabot = vid_rabot;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public String getVid_rabot() {
        return vid_rabot;
    }

    public void setVid_rabot(String vid_rabot) {
        this.vid_rabot = vid_rabot;
    }
}
