package learn.community.dto;

public class GithubUser {
    private String name;
    private long id;
    private String bio;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
