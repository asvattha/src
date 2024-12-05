public class LazyInitializer {
    private Animal animal;

    public synchronized Animal getInstance() {
        if(animal == null){
            animal = new Animal();
        }
        return animal;
    }
}
