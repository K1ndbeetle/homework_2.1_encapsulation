package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearbox;
    private final String bodyType;
    private String regNumber;
    private final int cabinCapacity;
    private boolean tireSeason;
    private Key key;

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return ", удаленный запуск двигателя: " + (remoteStart ? "есть" : "нет") +
                    ", бесключевой доступ: " + (keylessEntry ? "есть" : "нет") + ".";
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String gearbox, String bodyType, String regNumber, int cabinCapacity,
               boolean tireSeason, Key key) {
        if (brand == "" || brand == null || brand == "null") {
            this.brand = "default";
        } else this.brand = brand;
        if (model == "" || model == null || model == "null") {
            this.model = "default";
        } else this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else this.productionYear = productionYear;
        if (productionCountry == "" || productionCountry == null || productionCountry == "null") {
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;
        setGearbox(gearbox);
        if (bodyType == "" || bodyType == null || bodyType == "null") {
            this.bodyType = "default";
        } else this.bodyType = bodyType;
        setRegNumber(regNumber);
        if (cabinCapacity <= 0) {
            this.cabinCapacity = 5;
        } else this.cabinCapacity = cabinCapacity;
        this.tireSeason = tireSeason;
        setKey(key);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getCabinCapacity() {
        return cabinCapacity;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "" || color == null || color == "null") {
            this.color = "белый";
        } else this.color = color;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        if (gearbox == "" || gearbox == null || gearbox == "null") {
            this.gearbox = "МКПП";
        } else this.gearbox = gearbox;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == "" || regNumber == null || regNumber == "null") {
            this.regNumber = "X000XX00";
        } else this.regNumber = regNumber;
    }

    public boolean isTireSeason() {
        return tireSeason;
    }

    public void setTireSeason(boolean tireSeason) {
        this.tireSeason = tireSeason;
    }

    public Car.Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void tireSeason(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            tireSeason = false;
        }
        if (month >= 4 && month <= 10) {
            tireSeason = true;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль : " +
                "Марка " + brand + ", модель " + model + ", объём двигателя - " + engineVolume + " л.с." +
                ", цвет " + color + ", год выпуска " + productionYear + ", страна производства " + productionCountry +
                ", коробка передач " + gearbox + ", тип кузова " + bodyType + ", регистрационный номер " + regNumber +
                ", количество мест " + cabinCapacity + ", " + (tireSeason ? "летняя" : "зимняя") + " резина" + key;
    }
}
