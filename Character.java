public class Character {
    private String name;
    private int level;
    private int experiencePoints;
    private int healthPoints;

    private CharacterState state;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.experiencePoints = 0;
        this.healthPoints = 100;
        this.state = new NoviceState();
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void checkLevelUp() {
        state.checkLevelUp(this);
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public CharacterState getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void addExperience(int amount) {
        experiencePoints += amount;
    }

    public void addHealth(int amount) {
        healthPoints += amount;

        if (healthPoints > 100) {
            healthPoints = 100;
        }
    }
}