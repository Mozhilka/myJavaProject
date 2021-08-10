package school.lesson4;

    class Cat extends Animal {

        Cat(double animalDistanceRun, double animalDistanceSwim) {
            super(animalDistanceRun, animalDistanceSwim);
        }

        @Override
        public boolean run(double value) {
            return false;
        }
    }

