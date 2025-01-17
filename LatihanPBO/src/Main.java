class ItemAttack {
    private String nameItem;
    private int damageItem;
    private String rarityItem;

    public ItemAttack(String nameItem, int damageItem, String rarityItem) {
        this.nameItem = nameItem;
        this.damageItem = damageItem;
        this.rarityItem = rarityItem;
    }

    public String getNameItem() {
        return this.nameItem;
    }

    public int getDamageItem() {
        return this.damageItem;
    }

    public String getRarity() {
        return this.rarityItem;
    }
}

class Player {
    private String name;
    private int health;
    private int defaultDamage;
    private Armor armor;
    private ItemAttack item;

    public Player(String nama) {
        this.name = nama;
        this.health = 100;
        this.defaultDamage = 100;
    }

    public void display() {
        System.out.println("Nama anda adalah : " + this.name);
        System.out.println("Health anda adalah : " + this.health);
        System.out.println("Damage Awal : " + this.defaultDamage);
    }

    public void setItem(ItemAttack item) {
        this.item = item;
    }

    public int damageTambahan() {
        if (this.item != null) {
            return this.defaultDamage + this.item.getDamageItem();
        } else {
            return this.defaultDamage;
        }
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String getNama() {
        return this.name;
    }

    public int darahMaximal() {
        if (this.armor != null) {
            return this.health + this.armor.getArmorHealth() * 5;
        } else {
            return this.health;
        }
    }

    public int getHealth() {
        return this.health;
    }
}

class Armor {
    private String nameArmor;
    private int armorHealth;

    public Armor(String name, int armor) {
        this.nameArmor = name;
        this.armorHealth = armor;
    }

    public int getArmorHealth() {
        return this.armorHealth;
    }

    public String getNameArmor() {
        return this.nameArmor;
    }
}

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("PLAYER 1");
        Armor armor1 = new Armor("Baju Besi", 100);
        ItemAttack itemAttack = new ItemAttack("Blood of Despair", 200, "Epic");

        System.out.println("=== Informasi Awal Player ===");
        player1.display();

        player1.setArmor(armor1);
        System.out.println("Player menggunakan armor: " + armor1.getNameArmor());

        int totalHealth = player1.darahMaximal();
        System.out.println("\n=== Perhitungan Darah Maksimal ===");
        System.out.println("Nama Player: " + player1.getNama());
        System.out.println("Darah awal: " + player1.getHealth());
        System.out.println("Bonus dari armor (" + armor1.getArmorHealth() + " * 5): " + (armor1.getArmorHealth() * 5));
        System.out.println("Total darah setelah memakai armor: " + totalHealth);

        player1.setItem(itemAttack);
        System.out.println("\n=== Perhitungan Damage Setelah Mendapat 1 Item ===");
        System.out.println("Nama Item: " + itemAttack.getNameItem());
        System.out.println("Damage Tambahan dari Item: " + itemAttack.getDamageItem());
        System.out.println("Total Damage Setelah Mendapat Item: " + player1.damageTambahan());
    }
}
