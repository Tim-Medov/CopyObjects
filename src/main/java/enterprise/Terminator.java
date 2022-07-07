
package enterprise;

public class Terminator {

    private String model;
    private int damage;

    public Terminator(String model, int damage) {
        this.model = model;
        this.damage = damage;
    }

    public Terminator(Terminator terminator) {
        this.copy(terminator);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void copy(Terminator terminator) {
        this.setModel(terminator.getModel());
        this.setDamage(terminator.getDamage());
    }

    public void print() {
        System.out.println("Model: " + model + " Damage: " + damage + "%");
    }
}
