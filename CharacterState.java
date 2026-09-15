public interface CharacterState {
    void train(Character character);

    void meditate(Character character);

    void fight(Character character);

    void checkLevelUp(Character character);

    String getLevelName();
}