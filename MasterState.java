public class MasterState implements CharacterState {
    @Override
    public void train(Character character) {
        System.out.println("already a master");
    }

    @Override
    public void meditate(Character character) {
        System.out.println("already a master");
    }

    @Override
    public void fight(Character character) {
        System.out.println("already a master");
    }

    @Override
    public void checkLevelUp(Character character) {}

    @Override
    public String getLevelName() {
        return "Master";
    }
}