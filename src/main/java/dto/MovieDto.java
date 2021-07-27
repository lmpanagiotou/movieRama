package dto;

import java.util.Date;

public class MovieDto {
    private String title;
    private String description;
    private String user;
    private Date publicationDate;
    private int numberOfLikes;
    private int numberOfHates;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfHates() {
        return numberOfHates;
    }

    public void setNumberOfHates(int numberOfHates) {
        this.numberOfHates = numberOfHates;
    }
}
