package uc14;

class InvalidCapacityException extends Exception {
    InvalidCapacityException(String msg) {
        super(msg);
    }
}

class PassengerUnit {
    int capacity;

    PassengerUnit(int c) throws InvalidCapacityException {
        if (c <= 0)
            throw new InvalidCapacityException("Capacity must be greater than zero");
        capacity = c;
    }
}

public class TrainConsistManagementAppTestTestTest {
    public static void main(String[] args) {

        try {
            new PassengerUnit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}