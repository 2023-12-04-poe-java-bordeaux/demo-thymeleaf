package com.example.demoThymeleaf.tpLivre;

public class Livre {

    private Integer id;
    private String titre;
    private String resume;

    public Livre(String titre, String resume) {
        this.titre = titre;
        this.resume = resume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
