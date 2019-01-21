public class Zoo {

    private String zooName = "Мишутка";
    private Cage cage1;
    private Cage cage2;

    public Zoo() {
        cage1 = new Cage();
        cage1.setAnimal(new Animal("Шарик"));
        cage2 = new Cage();
        cage2.setAnimal(new Animal("Барсик"));
    }

    public Animal[] getAnimals() {
        Animal[] animals = new Animal[2];
        animals[0] = cage1.getAnimal();
        animals[1] = cage2.getAnimal();
        return animals;
    }




    public class Cage {
        private Animal animal;


        public String getZooName() {
            return Zoo.this.zooName;
        }

        public Animal getAnimal() {
            return animal;
        }

        public void setAnimal(Animal animal) {
            this.animal = animal;
        }
    }







}
