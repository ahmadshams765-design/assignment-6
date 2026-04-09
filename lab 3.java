public class Temperature {

    private double value;
    private char scale; // 'C' or 'F'

    // 1) No-argument constructor (0°C)
    public Temperature() {
        value = 0.0;
        scale = 'C';
    }

    // 2) One-parameter constructor (value only → assume Celsius)
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // 3) One-parameter constructor (scale only → assume 0 degrees)
    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    // 4) Two-parameter constructor
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    // =========================
    // Accessor Methods
    // =========================

    // Return temperature in Celsius
    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

    // Return temperature in Fahrenheit
    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9 * value / 5) + 32;
        }
    }

    // =========================
    // Mutator Methods
    // =========================

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    // =========================
    // Comparison Methods
    // =========================

    // Check equality
    public boolean equals(Temperature other) {
        return this.getCelsius() == other.getCelsius();
    }

    // Greater than
    public boolean isGreater(Temperature other) {
        return this.getCelsius() > other.getCelsius();
    }

    // Less than
    public boolean isLess(Temperature other) {
        return this.getCelsius() < other.getCelsius();
    }

    // =========================
    // toString Method
    // =========================

    public String toString() {
        return value + "°" + scale;
    }
}
