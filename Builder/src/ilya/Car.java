package ilya;

public class Car {
    private String Engine;
    private String Frame;
    private String Wheels;
    private String Luxury;
    private String Multimedia;
    private String Safety;

    @Override
    public String toString() {
        return "Frame: " + Frame +
                "\nEngine: " + Engine +
                "\nWheels: " + Wheels +
                "\nMultimedia: " + Multimedia +
                "\nSafety: " + Safety +
                "\nLuxury: " + Luxury;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getFrame() {
        return Frame;
    }

    public void setFrame(String frame) {
        Frame = frame;
    }

    public String getWheels() {
        return Wheels;
    }

    public void setWheels(String wheels) {
        Wheels = wheels;
    }

    public String getLuxury() {
        return Luxury;
    }

    public void setLuxury(String luxury) {
        Luxury = luxury;
    }

    public String getMultimedia() {
        return Multimedia;
    }

    public void setMultimedia(String multimedia) {
        Multimedia = multimedia;
    }

    public String getSafety() {
        return Safety;
    }

    public void setSafety(String safety) {
        Safety = safety;
    }
}
