class Pilot extends CrewMember {
    public Pilot(String name, int energyLevel) {
        super(name, "Pilot", energyLevel);
    }

    public void navigate() {
        System.out.println(name + " прокладывает маршрут.");
    }

    @Override
    public void doSpecialDuty() {
        navigate();
    }
}
