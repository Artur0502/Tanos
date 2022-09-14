public class Main {
    public static void main(String[] args) {
Boss Tanos = new Boss();
Tanos.setDamage(50);
Tanos.setXp(500);
Tanos.setTyreDefence ("kinetic");
        System.out.println("Damage;" + Tanos.getDamage());
        System.out.println("Tyre Defence; " + Tanos.getTyreDefence());
        System.out.println("Damage;" + Tanos.getXp());

        for (int i = 0; i <createHeroes().length ; i++) {
            System.out.println("Damage: " + createHeroes()[i].getDamage() );
            System.out.println("Xp: " + createHeroes()[i].getXp());
            System.out.println("Abilyty: " + createHeroes()[i].getAdilyty());
        }
    }



    public static Hero[] createHeroes() {
        Hero Thor = new Hero(250,25,"Magic");
        Hero Toni = new Hero(300,30,"kinetic");
        Hero Stiven = new Hero(350,35);

        Hero[] heroes = {Thor,Toni,Stiven};
        return heroes;

    }

}