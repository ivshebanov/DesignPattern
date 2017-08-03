package ilya;

public class Car {
    private String name;
    private String engine;
    private String wheels;
    private String paint;

    private Car(BuilderCar builderCar){
        this.name = builderCar.name;
        this.engine = builderCar.engine;
        this.wheels = builderCar.wheels;
        this.paint = builderCar.paint;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheels() {
        return wheels;
    }

    public String getPaint() {
        return paint;
    }

    static class BuilderCar {
        private String name;
        private String engine;
        private String wheels;
        private String paint;

        public BuilderCar setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderCar setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public BuilderCar setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public BuilderCar setPaint(String paint) {
            this.paint = paint;
            return this;
        }

        public Car build(){
           return new Car(this);
        }
    }
}

