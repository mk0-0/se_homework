import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private List<Hotpot> hotpotList;

    public Order(){
        hotpotList = new ArrayList<>();
    }

    public void initHotpot(String id, Region region, Spiciness spiciness, Size size, List<Food> foodList, double price){
        Hotpot hotpot = new Hotpot(id, region, spiciness, size, foodList, price);

        System.out.println("** Welcome to our restaurant. Hotpot initiated! **");
        System.out.println("ID: " + id);
        System.out.println("Region: " + region);
        System.out.println("Spiciness: " + spiciness);
        System.out.println("Size: " + size);
        System.out.println("foodList: null");
        System.out.println("price: " + price);

        hotpotList.add(hotpot);
    }

    public void addFood(Hotpot hotpot, String food){
        switch(food){
            case "Mutton":
            case "mutton":
            case "MUTTON":
                hotpot.getFoodList().add(Food.Mutton);
                hotpot.setPrice(hotpot.getPrice() + 38);
                System.out.println("** Mutton Selected! **");
                break;
            case "Beef":
            case "beef":
            case "BEEF":
                hotpot.getFoodList().add(Food.Beef);
                hotpot.setPrice(hotpot.getPrice() + 48);
                System.out.println("** Beef Selected! **");
                break;
            case "Mushrooms":
            case "mushrooms":
            case "MUSHROOMS":
                hotpot.getFoodList().add(Food.Mushrooms);
                hotpot.setPrice(hotpot.getPrice() + 8);
                System.out.println("** Mushrooms Selected! **");
                break;
            case "Meat":
            case "meat":
            case "MEAT":
                hotpot.getFoodList().add(Food.Meat);
                hotpot.setPrice(hotpot.getPrice() + 28);
                System.out.println("** Meat Selected! **");
                break;
            case "Shrimp":
            case "shrimp":
            case "SHRIMP":
                hotpot.getFoodList().add(Food.Shrimp);
                hotpot.setPrice(hotpot.getPrice() + 38);
                System.out.println("** Shrimp Selected! **");
                break;
            case "Potato":
            case "potato":
            case "POTATO":
                hotpot.getFoodList().add(Food.Potato);
                hotpot.setPrice(hotpot.getPrice() + 8);
                System.out.println("** Potato Selected! **");
                break;
            case "Yam":
            case "yam":
            case "YAM":
                hotpot.getFoodList().add(Food.Yam);
                hotpot.setPrice(hotpot.getPrice() + 8);
                System.out.println("** Yam Selected! **");
                break;
            default:
                System.out.println("** Sorry, the food ' "+ food + " ' cannot be selected currently. You can consult with our waiters. Thank you! **");
                break;
        }
    }

    public Hotpot getHotpotByID(String id) {
        for (Hotpot hotpot : hotpotList) {
            if (hotpot.getId().equals(id)) {
                return hotpot;
            }
        }
        System.out.println("** Sorry, we don't find this order. **");
        return null;
    }

    public double payByID(Hotpot hotpot){
        System.out.println("** You need to pay " + hotpot.getPrice() + " yuan. Thank you for patronizing! **");
        return hotpot.getPrice();
    }
}
