package com.examly.model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class LikeModel {
    @Id
    private int id;
	private int noOfLike;
    private int likedUser;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNoOfLike() {
        return noOfLike;
    }
    public void setNoOfLike(int noOfLike) {
        this.noOfLike = noOfLike;
    }
    public int getLikedUser() {
        return likedUser;
    }
    public void setLikedUser(int likedUser) {
        this.likedUser = likedUser;
    }
    
}
