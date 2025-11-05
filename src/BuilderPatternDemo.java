class Computer {
    private final String CPU;
    private final int RAM;
    private final int storage;
    private final String graphicsCard;

    // A Private constructor to enforce use of Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;

        // Setter methods for Builder
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage
                + "GB, GraphicsCard=" + graphicsCard + "]";
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Create a gaming PC
        Computer gamingPC = new Computer.Builder()
                .setCPU("i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicsCard("RTX 4080")
                .build();

        // Create an office PC
        Computer officePC = new Computer.Builder()
                .setCPU("i5")
                .setRAM(16)
                .setStorage(512)
                .setGraphicsCard("Integrated")
                .build();

        // Display both configurations
        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}
