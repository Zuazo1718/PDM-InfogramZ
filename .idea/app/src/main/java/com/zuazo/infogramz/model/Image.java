package com.zuazo.infogramz.model;

public class Image {
    private String urlImage;
    private String username;
    private String cantidadDias;
    private String cantidadMeGusta;

    public Image(String urlImage, String username, String cantidadDias, String cantidadMeGusta) {
        this.setUrlImage(urlImage);
        this.setUsername(username);
        this.setCantidadDias(cantidadDias);
        this.setCantidadMeGusta(cantidadMeGusta);
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(String cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }
}
