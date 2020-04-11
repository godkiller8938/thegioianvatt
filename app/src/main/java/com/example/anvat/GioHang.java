package com.example.anvat;

public class GioHang {
    public int idCart;
    public String nameCart;
    public long priceCart;
    public String imageCart;
    public int numberCart;

    public GioHang(int idCart, String nameCart, long priceCart, String imageCart, int numberCart) {
        this.idCart = idCart;
        this.nameCart = nameCart;
        this.priceCart = priceCart;
        this.imageCart = imageCart;
        this.numberCart = numberCart;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public String getNameCart() {
        return nameCart;
    }

    public void setNameCart(String nameCart) {
        this.nameCart = nameCart;
    }

    public long getPriceCart() {
        return priceCart;
    }

    public void setPriceCart(long priceCart) {
        this.priceCart = priceCart;
    }

    public String getImageCart() {
        return imageCart;
    }

    public void setImageCart(String imageCart) {
        this.imageCart = imageCart;
    }

    public int getNumberCart() {
        return numberCart;
    }

    public void setNumberCart(int numberCart) {
        this.numberCart = numberCart;
    }
}
