package Entity;

public class Button implements UIComponent {

    @Override
    public void view(String type) {
        if (type.equalsIgnoreCase("window")) {
            System.out.println("window button view");
        }
        if (type.equalsIgnoreCase("mac")) {
            System.out.println("mac button view");
        }
        if (type.equalsIgnoreCase("linux")) {
            System.out.println("linux button view");
        }
    }
}
