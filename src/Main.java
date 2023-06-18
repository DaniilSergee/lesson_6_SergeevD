public class Main {
    public static void main(String[] args) {
        Boss kingKong = new Boss();
        kingKong.setHealth(700);
        kingKong.setDamage(180);
        kingKong.weapon0.setTypeWeapon(WeaponType.GUN);
        kingKong.weapon0.setName("Pushka");
        System.out.println("Boss Information: \n" +
                "health: " + kingKong.getHealth() +
                "\ndamage: " + kingKong.getDamage() +
                "\ntype of boss weapon: " + kingKong.weapon0.getTypeWeapon() +
                "\nname of boss weapon: " + kingKong.weapon0.getName());
        System.out.println("----------");
    }
}