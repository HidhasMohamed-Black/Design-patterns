interface Button {
    void paint();
}

interface Checkbox {
    void check();
}

// concrete UI elements for Light theme
class LightButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Light Button");
    }
}

class LightCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checking a Light Checkbox");
    }
}

// concrete UI elements for Dark theme
class DarkButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Dark Button");
    }
}

class DarkCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checking a Dark Checkbox");
    }
}

// Define abstract factory interface
interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}

class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Choose a theme
        String theme = "dark"; // Change to "light" to test light theme

        UIFactory factory;
        if (theme.equalsIgnoreCase("light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.check();
    }
}
