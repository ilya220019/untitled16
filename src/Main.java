public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(300);
        boss.setHealth(1000);
        boss.setTipfier("Fier");
        System.out.println("Damage " + boss.getDamage() + " Healts " + boss.getHealth()
        + " Tip fier " + boss.getTipfier());
        creatHerouse();
        for (int i = 0; i <creatHerouse().length; i++) {
            System.out.println(creatHerouse()[i].getDamage() + " " + creatHerouse()[i].getHealth()
            + " "+ creatHerouse()[i].getSuperSila() );

        }


    }

    public static Hero[] creatHerouse(){
        Hero mag = new Hero(20,50);
        Hero kinetic = new Hero(80,72);
        Hero mag2 = new Hero(10,43, "Fly");
        Hero[] hero = {mag, kinetic, mag2};
        return hero;

    }
}