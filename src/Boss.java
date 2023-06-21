public class Boss extends GameEntity{
     Weapon weapon0 = new Weapon();

    public Weapon getWeapon0() {
        return weapon0;
    }

    public void setWeapon0(Weapon weapon0) {
        this.weapon0 = weapon0;
    }
    public String printInfo(){
        return "Boss Information: \n" + "health: " + this.getHealth() +
                "\ndamage: " + this.getDamage() +
                "\ntype of boss weapon: " + this.weapon0.getTypeWeapon() +
                "\nname of boss weapon: " + this.weapon0.getName();
    }
    public String printInfoSkeleton(){
        return "Skeleton Information: \n" + "health: " + this.getHealth() +
                "\ndamage: " + this.getDamage() +
                "\ntype of boss weapon: " + this.weapon0.getTypeWeapon() +
                "\nname of boss weapon: " + this.weapon0.getName();
    }
}
