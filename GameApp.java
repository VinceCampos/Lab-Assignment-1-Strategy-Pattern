public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new KnightAttack(), new KnightDefense());
        Character wizard = new Character(new WizardAttack(), new WizardDefense());
        Character archer = new Character(new ArcherAttack(), new ArcherDefense());

        System.out.println("Knight:");
        knight.performAttack();
        knight.performDefense();
        System.out.println();

        System.out.println("Wizard:");
        wizard.performAttack();
        wizard.performDefense();
        System.out.println();

        System.out.println("Archer:");
        archer.performAttack();
        archer.performDefense();
    }
}