package ilya.car;

public class Car {
    protected String name;
    protected String body;
    protected String engine;
    protected String paintColor;
    protected String wheels;

    public void assemblyBody(){
         System.out.println("Выбераем кузов");
     }
    public void installEngine(){
         System.out.println("Устанавливаем двигатель");
     }
    public void paint(){
         System.out.println("Красим автомобиль");
     }
    public void installWheels(){
        System.out.println("Устанавливаем колеса");
    }

    public void configure(){
        System.out.format("Автомобиль %s \n", this.name);
        System.out.format("Тип кузова %s \n", this.body);
        System.out.format("Тип двигателя %s \n", this.engine);
        System.out.format("Цвет автомобиля %s \n", this.paintColor);
        System.out.format("Колеса %s \n", this.wheels);
        System.out.println("---------------------------");
    }
}
