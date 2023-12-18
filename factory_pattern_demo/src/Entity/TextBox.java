package Entity;

public class TextBox implements UIComponent {
    @Override
    public void view(String type) {
        if (type.equalsIgnoreCase("window")) {
            System.out.println("window textbox view");
        }
        if (type.equalsIgnoreCase("mac")) {
            System.out.println("mac textbox view");
        }
        if (type.equalsIgnoreCase("linux")) {
            System.out.println("linux textbox view");
        }
    }
}
