class Engineer extends CrewMember {
    public Engineer(String name, int energyLevel) {
        super(name, "Engineer", energyLevel);
    }

    public void repairSystems() {
        System.out.println(name + " чинит неисправные системы корабля.");
    }

    @Override
    public void doSpecialDuty() {
        repairSystems();
    }
}
