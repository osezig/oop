public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null || brand != "") {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null || model != "") {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null || color != "") {
            this.color = color;
        } else {
            this.color = "default";
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country != null || country != "") {
            this.country = country;
        } else {
            this.country = "default";
        }
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
