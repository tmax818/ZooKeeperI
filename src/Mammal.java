/**
 * Create a Mammal class that has an energyLevel member variable and displayEnergy() method. .
 */
public class Mammal {

    int energyLevel = 100;
    /**
     * The displayEnergy() method should show the animal's energy level as well as return it
     */
    public int displayEnergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
}
