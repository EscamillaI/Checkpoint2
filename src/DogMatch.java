public class DogMatch {

    private Dog dog;
    private boolean matchConfirmed = false;

    public DogMatch() {
        this.dog = new Dog();
    }

    public DogMatch(Dog dog) {
        this.dog = dog;
    }

    public boolean isCompatible(Dog myDog) {
        if(dog.isInterestedIn(myDog) && myDog.isInterestedIn(dog)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isMatchConfirmed() {
        return matchConfirmed;
    }

    public void confirmMatch() {
        Random catFun = new Random();
        int output = catFun.nextInt(2);
        if (output == 0) {
            matchConfirmed = true;
        }
        else {
            matchConfirmed = false;
        }
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return this.dog;
    }
}