import java.util.List;

public class Hotpot {
    private String id;
    private Region region;
    private Spiciness spiciness;
    private Size size;
    private List<Food> foodList;
    private double price;

    public Hotpot(String id, Region region, Spiciness spiciness, Size size, List<Food> foodList, double price) {
        this.id = id;
        this.region = region;
        this.spiciness = spiciness;
        this.size = size;
        this.foodList = foodList;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId(){
        return id;
    }

    public Region getRegion() {
        return region;
    }

    public Spiciness getSpiciness() {
        return spiciness;
    }

    public Size getSize() {
        return size;
    }

    public List<Food> getFoodList() {
        return foodList;
    }
}
