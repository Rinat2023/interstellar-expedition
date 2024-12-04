class Scientist extends CrewMember {
    public Scientist(String name, int energyLevel) {
        super(name, "Scientist", energyLevel);
    }

    public void conductResearch() {
        System.out.println(name + " проводит исследование новой планеты.");
    }

    @Override
    public void doSpecialDuty() {
        conductResearch();
    }
}