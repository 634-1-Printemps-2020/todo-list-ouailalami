package Metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tache {
    private String createur;
    private String description;
    private Date date;
    private String status;
    private String resolution;

    public Tache(String createur, String description, Date date) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = "Open";
        this.resolution = " ";
    }

    public String getCreateur() {
        return createur;
    }

//    public void setCreateur(String createur) {
//        this.createur = createur;
//    }

    public String getDescription() {
        return description;
    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Date getDate() {
        return date;
    }

//    public void setDate(SimpleDateFormat date) {
//        this.date = date;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }


}
