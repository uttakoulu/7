public class IntermediateState implements CharacterState {
    private static final int required = 250;

    @Override
    public void train(Character character) {
        character.addExperience(10);

        System.out.println(character.getName() + " gained 25 exp");

        checkLevelUp(character);
    }

    @Override
    public void meditate(Character character) {
        character.addHealth(20);

        System.out.println(character.getName() + " gained 20 hp");
    }

    @Override
    public void fight(Character character) {
        System.out.println("intermediate cannot fight");
    }

    @Override
    public void checkLevelUp(Character character) {
        if (character.getExperiencePoints() >= required) {
            character.setLevel(3);
            character.setState(new ExpertState());

            System.out.println(character.getName() + " advanced to expert");
        }
    }

    @Override
    public String getLevelName() {
        return "Intermediate";
    }
}