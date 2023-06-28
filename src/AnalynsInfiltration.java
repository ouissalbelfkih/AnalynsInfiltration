public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake){
        return !knightIsAwake;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake; 
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    if (petDogIsPresent) {
            return !archerIsAwake;
        }
    else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }
    public static void main(String[] args) {
    // Testing canFastAttack()
    boolean knightIsAwake = false;
    boolean canFastAttackResult = canFastAttack(knightIsAwake);
    System.out.println("Can perform fast attack: " + canFastAttackResult);

    // Testing canSpy()
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean canSpyResult = canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
    System.out.println("Can spy on the group: " + canSpyResult);

    // Testing canSignalPrisoner()
    boolean canSignalPrisonerResult = canSignalPrisoner(archerIsAwake, prisonerIsAwake);
    System.out.println("Can signal the prisoner: " + canSignalPrisonerResult);

    // Testing canFreePrisoner()
    boolean petDogIsPresent = false;
    boolean canFreePrisonerResult = canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
    System.out.println("Can free the prisoner: " + canFreePrisonerResult);
    }
}