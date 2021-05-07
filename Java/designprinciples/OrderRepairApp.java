interface Order {

    void processOrder(String modelName);
}

interface PhoneRepair {

    void processPhoneRepair(String modelName);
}

interface PhoneAccessoryRepair {

    void phoneAccessoryRepair(String accessoryType);
}

class PhoneOrder implements Order {

    @Override
    public void processOrder(String modelName) {
    }

}

class PhoneAndAcceoryRepair implements PhoneAccessoryRepair, PhoneRepair {

    @Override
    public void processPhoneRepair(String modelName) {
    }

    @Override
    public void phoneAccessoryRepair(String accessoryType) {
    }

}

public class OrderRepairApp {
    public static void main(String[] args) {

    }

}