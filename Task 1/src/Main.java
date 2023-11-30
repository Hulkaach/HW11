public class Main {
    public static void main(String[] args) {
        Phone philips = new Phone();
        Phone motorolla = new Phone(1091346711,"e398",123.44);
        Phone xiaomi = new Phone(1234567890, "m6",100.1);
        Phone nokia = new Phone(12367890,"3310",123.44);

        nokia.receiveCall("Mother");
        motorolla.receiveCall("Father",1231451);
        xiaomi.receiveCall("Work");

    }
}
