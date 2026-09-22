class Device {

    final void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Phone extends Device {

    void call(String number) {
        System.out.println("Calling " + number);
    }

    void installApp(String name) {
        System.out.println("Installing app: " + name);
    }
}

class Smartphone extends Phone {

    @Override
    void installApp(String name) {
        System.out.println("Smartphone installing app: " + name);
    }
}

public class DeviceHierarchy {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.powerOn();
        phone.call("9876543210");
        phone.installApp("WhatsApp");
    }
}