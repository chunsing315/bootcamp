public enum Devices {
    DEVICE1(1),
    DEVICE2(2),
    DEVICE3(3),
    DEVICE4(4),
    DEVICE5(5),
    DEVICE6(6),
    DEVICE7(7),
    DEVICE8(8),
    DEVICE9(9),
    DEVICE10(10),
    DEVICE11(11),
    DEVICE12(12);

    private final int code;

    Device(int number) {
        this.code = number;
    }

    public int getCode() {
        return this.code;

}
