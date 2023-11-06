public class Bedroom {
    private Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private String name;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                   Ceiling ceiling, Bed bed, Lamp lamp, String name) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.name = name;
    }


    public Lamp getLamp() {
        return lamp;
    }


public void makeBed(){
    System.out.println("Bedroom -> Making the bed");
bed.make();
}

}
class Lamp{

    private String style;
    private Boolean battery;
    private int globRating;

    public Lamp(String style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setBattery(Boolean battery) {
        this.battery = battery;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println( "Lamp -> Turning on");
    }
    public String getStyle(){
        return style;
    }

    public Boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}

class Bed {

    private String style;
    private int pillow;
    private int height;
private int sheets;
private int quilt;


    public Bed(String style, int pillow, int height, int sheets, int quilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }


    public void make(){
        System.out.println("Making the bed");
    }
    public String getStyle(){
        return style;
    }

    public int getPillow() {
        return pillow;
    }


    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

}
    class Wall{
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }



    public String getDirection() {
        return direction;
    }
}