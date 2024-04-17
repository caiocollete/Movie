package com.caiocollete.modules;

public class Movie {
    // Struct
    private int rank;
    private String title;
    private String description;
    private String image;
    private String big_image;
    private String[] genre;
    private String thumbnail;
    private Float rating;
    private String id;
    private int year;
    private String imdbid;
    private String imdb_link;

    // Methods
    public int getRank(){return rank;}
    public String getTitle(){return title;}
    public String getDesc(){return description;}
    public String getImg(){return image;}
    public String getBImg(){return big_image;}
    public String[] getGenre(){return genre;}
    public String getThumb(){return thumbnail;}
    public Float getRating(){return rating;}
    public String getId(){return id;}
    public int getYear(){return year;}
    public String getImdbid(){return imdbid;}
    public String getImdb_link(){return imdb_link;}

    public void setRank(int rank){ this.rank = rank; }
    public void setTitle(String title) { this.title = title; }
    public void setDesc(String desc) { this.description = description; }
    public void setImg(String image) { this.image = image; }
    public void setBImage(String big_image) { this.big_image = big_image; }
    public void setGenre(String[] genre) { this.genre = genre; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }
    public void setRating(Float rating){this.rating = rating;}
    public void setId(String id){this.id = id;}
    public void setYear(int year){this.year = year;}
    public void setImdbidetImdbid(String imdbid){this.imdbid= imdbid;}
    public void setImdb_link(String imdb_link){this.imdb_link = imdb_link;}

}
