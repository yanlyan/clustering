/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

/**
 *
 * @author yanlyan
 */
public class Nilai {

    private String nama;
    private int jk;
    private int kedisiplinan;
    private int ketekunan;
    private int minat;

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jk
     */
    public int getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        if (jk.equalsIgnoreCase("Pria")) {
            this.jk = 2;
        } else {
            this.jk = 3;
        }
    }

    /**
     * @return the kedisiplinan
     */
    public int getKedisiplinan() {
        return kedisiplinan;
    }

    /**
     * @param kedisiplinan the kedisiplinan to set
     */
    public void setKedisiplinan(String kedisiplinan) {
        if (kedisiplinan.equalsIgnoreCase("Baik")) {
            this.kedisiplinan = 2;
        } else if (kedisiplinan.equalsIgnoreCase("Sedang")) {
            this.kedisiplinan = 3;
        } else {
            this.kedisiplinan = 4;
        }
    }

    /**
     * @return the ketekunan
     */
    public int getKetekunan() {
        return ketekunan;
    }

    /**
     * @param ketekunan the ketekunan to set
     */
    public void setKetekunan(String ketekunan) {
        if (ketekunan.equalsIgnoreCase("Baik")) {
            this.ketekunan = 2;
        } else if (ketekunan.equalsIgnoreCase("Sedang")) {
            this.ketekunan = 3;
        } else {
            this.ketekunan = 4;
        }
    }

    /**
     * @return the minat
     */
    public int getMinat() {
        return minat;
    }

    /**
     * @param minat the minat to set
     */
    public void setMinat(String minat) {
         if (minat.equalsIgnoreCase("Keuangan")) {
            this.minat = 2;
        } else {
            this.minat = 3;
        }
    }
}
