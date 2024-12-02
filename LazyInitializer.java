public class LazyInitializer {
    private Animal animal;

    public Animal getInstance() {
        if(animal == null){
            animal = new Animal();
        }
        return animal;
    }
}
