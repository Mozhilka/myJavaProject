package school.lesson4;
    class Dog extends Animal {

    Dog(double animalDistanceRun, double animalDistanceSwim) {
        super(animalDistanceRun, animalDistanceSwim);
    }

        @Override
        public boolean run(double value) {
            return false;
        }
    }
