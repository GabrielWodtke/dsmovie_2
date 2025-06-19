package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO(){
    }

    public MovieDTO(Long id, String image, Integer count, Double score, String title) {
        this.id = id;
        this.image = image;
        this.count = count;
        this.score = score;
        this.title = title;
    }
    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.image = movie.getImage();
        this.count = movie.getCount();
        this.score = movie.getScore();
        this.title = movie.getTitle();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
