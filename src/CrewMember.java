import java.util.Random;

abstract class CrewMember {
    protected String name;
    protected String specialization;
    protected int energyLevel;

    public CrewMember(String name, String specialization, int energyLevel) {
        this.name = name;
        this.specialization = specialization;
        this.energyLevel = energyLevel;
    }

    public void performDuty() {
        if (energyLevel >= 10) {
            energyLevel -= 10;
            System.out.println(name + " выполнил свою задачу. Остаток энергии: " + energyLevel);
        } else {
            System.out.println(name + " слишком устал, чтобы выполнить задачу.");
        }
    }

    public void rest() {
        energyLevel += 20;
        System.out.println(name + " отдохнул. Уровень энергии: " + energyLevel);
    }

    public abstract void doSpecialDuty();
}