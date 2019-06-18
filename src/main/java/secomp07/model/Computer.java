package secomp07.model;

import java.util.Objects;

public class Computer {
    private String name;
    private float cpuFrequencyGHz;
    private int coresCount;
    private int ramMB;
    private int storageGB;

    public Computer() {}

    public Computer(
            String name,
            float cpuFrequencyGHz,
            int coresCount,
            int ramMB,
            int storageGB
    ) {
        this.name = name;
        this.cpuFrequencyGHz = cpuFrequencyGHz;
        this.coresCount = coresCount;
        this.ramMB = ramMB;
        this.storageGB = storageGB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCpuFrequencyGHz() {
        return cpuFrequencyGHz;
    }

    public void setCpuFrequencyGHz(float cpuFrequencyGHz) {
        this.cpuFrequencyGHz = cpuFrequencyGHz;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public int getRamMB() {
        return ramMB;
    }

    public void setRamMB(int ramMB) {
        this.ramMB = ramMB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    @Override
    public String toString() {
        return "Computer \"" + getName() + "\":\n" +
                "\tCPU:     " + getCpuFrequencyGHz() + " GHz\n" +
                "\tCores:   " + getCoresCount() + "\n" +
                "\tRam:     " + getRamMB() + "\n" +
                "\tStorage: " + getStorageGB() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Float.compare(computer.getCpuFrequencyGHz(), getCpuFrequencyGHz()) == 0 &&
                Float.compare(computer.getCoresCount(), getCoresCount()) == 0 &&
                getRamMB() == computer.getRamMB() &&
                getStorageGB() == computer.getStorageGB() &&
                getName().equals(computer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCpuFrequencyGHz(), getCoresCount(), getRamMB(), getStorageGB());
    }
}
