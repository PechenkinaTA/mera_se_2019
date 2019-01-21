public class ZooVisitor {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal[] animals = zoo.getAnimals();
        for (Animal animal : animals) {
            System.out.println("Привет," + animal.getName());
        }
    }
}
