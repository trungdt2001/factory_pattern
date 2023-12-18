package Entity;

public class DropDownMenu implements UIComponent {
    @Override
    public void view(String type) {
        if (type.equalsIgnoreCase("window")) {
            System.out.println("window dropdown view");
        }
        if (type.equalsIgnoreCase("mac")) {
            System.out.println("mac dropdown view");
        }
        if (type.equalsIgnoreCase("linux")) {
            System.out.println("linux dropdown view");
        }
    }
}
