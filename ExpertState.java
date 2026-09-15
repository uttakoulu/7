public class ExpertState implements CharacterState {
    private static final int required = 500;

    @Override
    public void train(Character character) {
        System.out.println(character.getName() + " gained 0 exp. You are too good for training");

        checkLevelUp(character);
    }

    @Override
    public void meditate(Character character) {
        character.addHealth(20);

        System.out.println(character.getName() + " gained 20 hp");
    }

    @Override
    public void fight(Character character) {
        character.addHealth(-25);
        character.addExperience(25);

        System.out.println(character.getName() + " fought and lost 20 hp");
        System.out.println("gained 25 exp");

        checkLevelUp(character);
    }

    @Override
    public void checkLevelUp(Character character) {
        if (character.getExperiencePoints() >= required) {
            character.setLevel(4);
            character.setState(new MasterState());

            System.out.println(character.getName() + " reached master!");
        }
    }

    @Override
    public String getLevelName() {
        return "Expert";
    }
}