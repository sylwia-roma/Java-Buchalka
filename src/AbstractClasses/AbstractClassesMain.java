package AbstractClasses;

//Interfaces define whats need to be done, it doesn't define how it is done

//napotykając taką klasę w kodzie od razu wiemy, że jest ona tylko i wyłącznie bazą do tworzenia innych klas.
// Mówimy, że jest ona pewnego rodzaju projektem, który następnie powinien zostać odpowiednio zaimplementowany
// w klasach podrzędnych (dziedziczących).
// W przypadku gdy jedna klasa abstrakcyjna dziedziczy z drugiej klasy abstrakcyjnej,
// nie musimy implementować w niej metod abstrakcyjnych. Kompilacja się powiedzie.

public class AbstractClassesMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        //Pojawia się błąd przez to że nird jest klasą abstrakcyjną, to się nie może skompilować
        //musimy utworzyć oddzielną klasę Parrot

//        Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }

}
