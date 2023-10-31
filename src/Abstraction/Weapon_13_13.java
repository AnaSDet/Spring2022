package Abstraction;

public class Weapon_13_13 {
    public static void main(String[] args) {

    }
}
interface WeaponType {
    String getWeaponType();
    void setWeaponType(String weaponType);
    default void resetWeaponType() {
        setWeaponType("Default");
    }
}
interface Damageable {
    int getDurability();
    void setDurability(int durability);
    default void repair() {
        setDurability(100);
    }
}
class Weapon implements WeaponType, Damageable {
    private String weaponType;
    private int durability;
    public Weapon(String weaponType, int durability) {
        this.weaponType = weaponType;
        this.durability = durability;
    }
    @Override
    public String getWeaponType() {
        return weaponType;
    }
    @Override
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
    @Override
    public int getDurability() {
        if (durability < 100 && durability > 0) {
            return durability;
        } else {
            return 100;
        }
    }
    @Override
    public void setDurability(int durability) {
        this.durability = durability;
    }
}