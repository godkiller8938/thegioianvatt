package com.example.anvat.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MonAn implements Serializable {

    @SerializedName("idmonan")
    @Expose
    private String idmonan;
    @SerializedName("tenmonan")
    @Expose
    private String tenmonan;
    @SerializedName("giamonan")
    @Expose
    private String giamonan;
    @SerializedName("hinhanhmonan")
    @Expose
    private String hinhanhmonan;
    @SerializedName("mota")
    @Expose
    private String mota;
    @SerializedName("idloaimonan")
    @Expose
    private String idloaimonan;

    public String getIdmonan() {
        return idmonan;
    }

    public void setIdmonan(String idmonan) {
        this.idmonan = idmonan;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public String getGiamonan() {
        return giamonan;
    }

    public void setGiamonan(String giamonan) {
        this.giamonan = giamonan;
    }

    public String getHinhanhmonan() {
        return hinhanhmonan;
    }

    public void setHinhanhmonan(String hinhanhmonan) {
        this.hinhanhmonan = hinhanhmonan;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getIdloaimonan() {
        return idloaimonan;
    }

    public void setIdloaimonan(String idloaimonan) {
        this.idloaimonan = idloaimonan;
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "idmonan='" + idmonan + '\'' +
                ", tenmonan='" + tenmonan + '\'' +
                ", giamonan='" + giamonan + '\'' +
                ", hinhanhmonan='" + hinhanhmonan + '\'' +
                ", mota='" + mota + '\'' +
                ", idloaimonan='" + idloaimonan + '\'' +
                '}';
    }
}