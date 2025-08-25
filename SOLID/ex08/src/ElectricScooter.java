class ElectricScooter implements EnginePowered, Rechargeable {
    public void startEngine() {
        System.out.println("Scooter motor engaged");
    }
    public void recharge(int kWh) {
        System.out.println("Scooter charged with " + kWh + " kWh");
    }
}