package lecture.week7.example03_observer;

public class Test {
    public static void main(String[] args) {
        /* observed 될 subject 객체 생성 */
        PlainDogBot patch = new PlainDogBot(4, 2, "Patch");
        PlainDogBot rover = new PlainDogBot(9, 6, "Rover");

        /* subject로서 관리되도록, */
        ObservableDogBot observedPatch = new ObservableDogBot(patch);
        ObservableDogBot observedRover = new ObservableDogBot(rover);

        /* observer 인스턴스 생성*/
        DogWatcher jim = new DogWatcher("Jim");
        DogWatcher fred = new DogWatcher("Fred");

        System.out.println("\nStarting Observation Test 1 with:\n");
        System.out.println(observedPatch);
        System.out.println(observedRover);
        System.out.println(jim);
        System.out.println(fred);

        System.out.println("\nNo-one is observing Rover or Patch");
        System.out.println(observedRover + " has " + observedRover.countObservers() + " observers");
        System.out.println(observedPatch + " has " + observedPatch.countObservers() + " observers\n");
        System.out.println("Rover rests");
        observedRover.rest();
        System.out.println("Patch plays");
        observedPatch.play();

        System.out.println("\nJim observes Rover and Patch\n");
        observedRover.addObserver(jim);
        observedPatch.addObserver(jim);
        System.out.println("Patch plays");
        observedPatch.play();
        System.out.println("Rover plays");
        observedRover.play();
        System.out.println("Rover makes noise: " + observedRover.noise());
        System.out.println("Patch makes noise: " + observedPatch.noise());

        System.out.println("\nFred observes Patch");
        observedPatch.addObserver(fred);
        System.out.println(observedRover + " has " + observedRover.countObservers() + " observers");
        System.out.println(observedPatch + " has " + observedPatch.countObservers() + " observers\n");
        System.out.println("Patch plays");
        observedPatch.play();
        System.out.println("Rover plays");
        observedRover.play();
        System.out.println("Patch looks at food");
        if (observedPatch.eat())
            System.out.println(" and Patch eats");
        else
            System.out.println(" and Patch decides not to eat");
        System.out.println("Rover makes noise: " + observedRover.noise());
        System.out.println("Patch makes noise: " + observedPatch.noise());
        System.out.println("\nFred stops observing Patch\n");
        observedPatch.deleteObserver(fred);
        System.out.println("Patch rests");
        observedPatch.rest();

        System.out.println("\nFred starts observing Rover\n");
        observedRover.addObserver(fred);
        System.out.println("Patch rests");
        observedPatch.rest();
        System.out.println("Rover rests");
        observedRover.rest();
        System.out.println("Patch looks at food");
        if (observedPatch.eat())
            System.out.println(" and Patch eats");
        else
            System.out.println(" and Patch decides not to eat");
        System.out.println("Patch looks at food again");
        if (observedPatch.eat())
            System.out.println(" and Patch eats");
        else
            System.out.println(" and Patch decides not to eat");
        System.out.println("Rover makes noise: " + observedRover.noise());
        System.out.println("Patch makes noise: " + observedPatch.noise());
        System.out.println("Rover looks at food");
        if (observedRover.eat())
            System.out.println("Rover eats");
        else
            System.out.println("Rover decides not to eat");

        System.out.println("\nJim stops observing Rover\n");
        observedRover.deleteObserver(jim);
        System.out.println("Rover looks at food again");
        if (observedRover.eat())
            System.out.println(" and Rover eats");
        else
            System.out.println(" and Rover decides not to eat");
        System.out.println("Rover rests");
        observedRover.rest();
        System.out.println("\nObservation Test 1 ends\n");
    }

}
