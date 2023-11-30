public class Phone {
    static String madeCountry;
    long number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String nameCalling){
        receiveCall(nameCalling,0000);
    }

    public void receiveCall(String nameCalling, long numberCalling){
        System.out.println("Звонит абонент по имени "+nameCalling+" номер абонента "+numberCalling);
    }
}
