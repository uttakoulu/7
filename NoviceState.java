public class NoviceState implements CharacterState {
    private static final int required = 100;

    @Override
    public void train(Character character) {
        character.addExperience(25);

        System.out.println(character.getName() + " gained 25 exp");

        checkLevelUp(character);
    }

    @Override
    public void meditate(Character character) {
        System.out.println("Novice cannot meditate");
    }

    @Override
    public void fight(Character character) {
        System.out.println("Novice cannot fight");
    }

    @Override
    public void checkLevelUp(Character character) {
        if (character.getExperiencePoints() >= required) {
            character.setLevel(2);
            character.setState(new IntermediateState());

            System.out.println(character.getName() + " advanced to intermediate");
        }
    }

    @Override
    public String getLevelName() {
        return "Novice";
    }
}