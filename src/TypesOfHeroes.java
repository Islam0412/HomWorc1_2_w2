public class TypesOfHeroes extends Players {
    private Server server;

    public TypesOfHeroes(String name, int age,
                         HeroClass heroClass, Server server) {
        super(name, age, heroClass, server);
        this.server = server;

    }

    @Override
    public Server getServer() {
        return server;
    }

    public void makeHit() {
        System.out.println("удар мечом");
    }

    public void dangerous(String answer) {
        System.out.println(answer);
    }

    public final String getInfo() {
        return "Name: " + getName() + "\nAge: " + getAge() +
                "\nHero Class " + getHeroClass() + "\nServer: " + getServer();
    }

}
