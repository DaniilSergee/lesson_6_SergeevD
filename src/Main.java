public class Main {
    public static void main(String[] args) {
        Boss kingKong = new Boss();
        kingKong.setHealth(700);
        kingKong.setDamage(180);
        kingKong.weapon0.setTypeWeapon(WeaponType.GUN);
        kingKong.weapon0.setName("Pushka");
        System.out.println(kingKong.printInfo());
        System.out.println("----------");

        Skeleton bigBone = new Skeleton();
        bigBone.setHealth(300);
        bigBone.setDamage(50);
        bigBone.weapon0.setTypeWeapon(WeaponType.BOW);
        bigBone.weapon0.setName("Redrain");
        bigBone.setArrows(20);

        Skeleton billyBone = new Skeleton();
        billyBone.setHealth(500);
        billyBone.setDamage(100);
        billyBone.weapon0.setTypeWeapon(WeaponType.ARBALEST);
        billyBone.weapon0.setName("Luckyone");
        billyBone.setArrows(70);
        System.out.println(bigBone.printInfoSkeleton());
        System.out.println(billyBone.printInfoSkeleton());

    }
}