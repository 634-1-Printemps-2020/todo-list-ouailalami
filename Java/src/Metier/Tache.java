package Metier;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Tache {
    private User createur;
    private String description;
    private Date date;
    private Status status;
    private Resolution resolution;

    public Tache(User createur, String description, Date date) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = Status.OPEN;
    }

    public User getCreateur() {
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


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return Objects.equals(createur, tache.createur) &&
                Objects.equals(description, tache.description) &&
                Objects.equals(date, tache.date) &&
                status == tache.status &&
                resolution == tache.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(createur, description, date, status, resolution);
    }
}
