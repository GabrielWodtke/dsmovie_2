package com.devsuperior.dsmovie.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "movie.id", column = @Column(name = "MOVIE_ID", nullable = false)),
        @AttributeOverride(name = "user.id", column = @Column(name = "USER_ID", nullable = false))
    })
    private ScorePK id = new ScorePK();
    
    private Double value;
    
    public Score() {
    }
    
    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }
    
    public void setUser(User user) {
        id.setUser(user);
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
