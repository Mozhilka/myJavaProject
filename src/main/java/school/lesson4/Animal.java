package school.lesson4;
public abstract class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceSwim;

    Animal(double animalDistanceRun, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}
