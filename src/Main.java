import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car carLada = new Car("Lada", "", 1.7, "", 2015, "Россия",
                "МКПП", "лифтбэк", "А808СА77", 5, false);
        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 0,
                "Германия", "АКПП", "седан", "А888АА61", 5, true);
        Car carBmw = new Car(null, "Z8", 3.0, "черный", 2021,
                "Германия", "АКПП", "кабриолет", "Х888ХХ77", 5, true);
        Car carKia = new Car("null", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "", "АКПП", "кроссовер", "Х404ХХ161", 5, true);
        Car carHyundai = new Car("Hyundai", "Avante", 0, "оранжевый", 2016,
                "Южная Корея", "", "седан", "Х761ХХ761", 5, true);

        System.out.println(carLada + "\n" + carAudi + "\n" +  carBmw  + "\n" +  carKia  + "\n" +  carHyundai);

        carLada.tireSeason(8);
        System.out.println();
        System.out.println(carLada);

    }
}
