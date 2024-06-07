package students.examples.com;

public interface HasBattery {
    public boolean charge();
    public boolean disCharge();
    public boolean isCharged();

    public int getCharge();
    public void setCharge(int charge);
}
