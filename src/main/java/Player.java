
class Player {

    public Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[] {new Pistol(), new Gun(), new BigGun(), new Slingshot(), new WaterPistol()};
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(Integer slot) {
        if((slot >= 0)&&(slot < weaponSlots.length)){
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        } else{

            System.out.println("Некорректное значение");

        }
    }
}