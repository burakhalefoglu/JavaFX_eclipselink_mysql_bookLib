package com.db.eclipslink.models;

import jakarta.persistence.*;

@Entity
@Table(name = "kitap", schema = "kutup")
public class BookEntity {
    @Id
    @Column(name = "kno", nullable = false)
    private int kno;

    private String baslik;
    private String yazar1;
    private String yazar2;
    private String yazar3;
    private String yayinevi;
    private String anahtar;
    private String issn;
    private Integer baski;
    private String byil;
    private String durum;
    private Integer kitaplik;
    private Integer raf;

    @Id
    @Column(name = "kno", nullable = false)
    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    @Basic
    @Column(name = "baslik", nullable = false, length = 256)
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    @Basic
    @Column(name = "yazar1", nullable = false, length = 64)
    public String getYazar1() {
        return yazar1;
    }

    public void setYazar1(String yazar1) {
        this.yazar1 = yazar1;
    }

    @Basic
    @Column(name = "yazar2", nullable = true, length = 64)
    public String getYazar2() {
        return yazar2;
    }

    public void setYazar2(String yazar2) {
        this.yazar2 = yazar2;
    }

    @Basic
    @Column(name = "yazar3", nullable = true, length = 64)
    public String getYazar3() {
        return yazar3;
    }

    public void setYazar3(String yazar3) {
        this.yazar3 = yazar3;
    }

    @Basic
    @Column(name = "yayinevi", nullable = true, length = 128)
    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Basic
    @Column(name = "anahtar", nullable = true, length = 32)
    public String getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(String anahtar) {
        this.anahtar = anahtar;
    }

    @Basic
    @Column(name = "issn", nullable = true, length = 16)
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Basic
    @Column(name = "baski", nullable = true)
    public Integer getBaski() {
        return baski;
    }

    public void setBaski(Integer baski) {
        this.baski = baski;
    }

    @Basic
    @Column(name = "byil", nullable = false, length = 4)
    public String getByil() {
        return byil;
    }

    public void setByil(String byil) {
        this.byil = byil;
    }

    @Basic
    @Column(name = "durum", nullable = true, length = 10)
    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Basic
    @Column(name = "kitaplik", nullable = true)
    public Integer getKitaplik() {
        return kitaplik;
    }

    public void setKitaplik(Integer kitaplik) {
        this.kitaplik = kitaplik;
    }

    @Basic
    @Column(name = "raf", nullable = true)
    public Integer getRaf() {
        return raf;
    }

    public void setRaf(Integer raf) {
        this.raf = raf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (kno != that.kno) return false;
        if (baslik != null ? !baslik.equals(that.baslik) : that.baslik != null) return false;
        if (yazar1 != null ? !yazar1.equals(that.yazar1) : that.yazar1 != null) return false;
        if (yazar2 != null ? !yazar2.equals(that.yazar2) : that.yazar2 != null) return false;
        if (yazar3 != null ? !yazar3.equals(that.yazar3) : that.yazar3 != null) return false;
        if (yayinevi != null ? !yayinevi.equals(that.yayinevi) : that.yayinevi != null) return false;
        if (anahtar != null ? !anahtar.equals(that.anahtar) : that.anahtar != null) return false;
        if (issn != null ? !issn.equals(that.issn) : that.issn != null) return false;
        if (baski != null ? !baski.equals(that.baski) : that.baski != null) return false;
        if (byil != null ? !byil.equals(that.byil) : that.byil != null) return false;
        if (durum != null ? !durum.equals(that.durum) : that.durum != null) return false;
        if (kitaplik != null ? !kitaplik.equals(that.kitaplik) : that.kitaplik != null) return false;
        if (raf != null ? !raf.equals(that.raf) : that.raf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kno;
        result = 31 * result + (baslik != null ? baslik.hashCode() : 0);
        result = 31 * result + (yazar1 != null ? yazar1.hashCode() : 0);
        result = 31 * result + (yazar2 != null ? yazar2.hashCode() : 0);
        result = 31 * result + (yazar3 != null ? yazar3.hashCode() : 0);
        result = 31 * result + (yayinevi != null ? yayinevi.hashCode() : 0);
        result = 31 * result + (anahtar != null ? anahtar.hashCode() : 0);
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        result = 31 * result + (baski != null ? baski.hashCode() : 0);
        result = 31 * result + (byil != null ? byil.hashCode() : 0);
        result = 31 * result + (durum != null ? durum.hashCode() : 0);
        result = 31 * result + (kitaplik != null ? kitaplik.hashCode() : 0);
        result = 31 * result + (raf != null ? raf.hashCode() : 0);
        return result;
    }
}
