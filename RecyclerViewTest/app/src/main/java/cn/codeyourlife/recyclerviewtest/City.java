package cn.codeyourlife.recyclerviewtest;

public class City {
    private String name;
    private int imageId;

    public City(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
