public class LunchTime {

    // ============================================================
    // INSTANCE VARIABLES
    // ============================================================

    // The number of chicken nuggets you were served.
    // IMPORTANT: This number may not be emotionally sufficient.
    private int numNugs;

    // The number of grams of mysterious dipping sauce you received.
    // Scientists have been unable to determine what the sauce actually is.
    private double mysterySauce;

    // Whether you received enough nuggets to survive until the end of school.
    private boolean enoughNugs;

    // The official name of today's chicken nugget entree.
    // Examples:
    // "Nuggly Ducklings"
    // "Nuggets of Questionable Origin"
    // "Chicken-ish Bites"
    private String entreeName;


    // ============================================================
    // CONSTRUCTORS
    // ============================================================

    /**
     * No-argument constructor.
     *
     * Give ALL FOUR instance variables reasonable default values.
     */
    public LunchTime() {
        // TODO: Initialize all four instance variables.
        numNugs = 6;
        mysterySauce = 30.0;
        enoughNugs = false;
        entreeName = "nugget";
    }


    /**
     * Constructor that allows someone to describe their exact lunch situation.
     */
    public LunchTime(int nugs, double sauce, boolean enough, String name) {
        // TODO: Set all four instance variables using the parameters.
        numNugs = nugs;
        mysterySauce = sauce;
        enoughNugs = enough;
        entreeName = name;
    }


    // ============================================================
    // STRING PRACTICE
    // ============================================================

    /**
     * Returns the number of characters in the entree name.
     *
     * Example:
     * "Nuggly Ducklings" -> 15
     *
     * Use .length()
     */
    public int getEntreeNameLength() {
        // TODO
        return entreeName.length();
    }


    /**
     * Returns part of the entree name using the given indexes.
     *
     * Example:
     * If entreeName is "Nuggly Ducklings":
     *
     * getEntreeSubstring(0, 6)
     *
     * would return:
     *
     * "Nuggly"
     *
     * Use .substring()
     */
    public String getEntreeSubstring(int start, int end) {
        // TODO
        return entreeName.substring(start,end);
    }


    /**
     * Finds where the word "Nug" first appears in the entree name.
     *
     * Example:
     * "Super Nug Platter" -> 6
     *
     * If "Nug" isn't there, remember what indexOf() returns!
     *
     * Use .indexOf()
     */
    public int containsNug() {
        // TODO
        return entreeName.indexOf("Nug");
    }


    /**
     * Compare today's entree name to another entree name
     * alphabetically.
     *
     * Use .compareTo()
     *
     * Remember that compareTo() returns:
     *   a negative number
     *   zero
     *   OR a positive number
     */
    public int compareLunchNames(String otherLunch) {
        // TODO
        return entreeName.compareTo(otherLunch);
    }


    /**
     * Returns true if today's entree has EXACTLY the same name
     * as the String provided.
     *
     * Use .equals()
     *
     * DO NOT use == unless you want Mr. Krokower to appear
     * mysteriously behind you and ask you about object references.
     */
    public boolean isSameLunch(String otherLunch) {
        // TODO
        return entreeName.equals(otherLunch);
    }


    // ============================================================
    // MATH PRACTICE
    // ============================================================

      /**
       * The cafeteria has discovered a revolutionary new method
       * for deciding how many nuggets you receive: RANDOMNESS.
       *
       * Return a random integer between lowNugs and highNugs,
       * INCLUDING both lowNugs and highNugs.
       *
       * Example:
       * cafeteriaRandomness(5, 10)
       *
       * could return:
       * 5, 6, 7, 8, 9, or 10
       *
       * Use Math.random().
       *
       * Hint: Think about how many possible numbers there are
       * between lowNugs and highNugs.
       */
      public int cafeteriaRandomness(int lowNugs, int highNugs) {
          // TODO: return a random integer from lowNugs through highNugs
          return (int)(Math.random()*(highNugs-lowNugs+1)+lowNugs);
      }


    /**
     * Cafeteria scientists have developed a highly questionable
     * formula called Nugget Power:
     *
     *      numNugs ^ power
     *
     * Use Math.pow()
     */
    public double nuggetPower(double power) {
        // TODO
        return Math.pow(numNugs, power);
    }

    /**
     * Returns whether you received enough nuggets.
     *
     * This is serious business.
     */
    public boolean gotEnoughNugs() {
        // TODO
        return enoughNugs;
    }


    // ============================================================
    // CHALLENGES
    // ============================================================
    //
    // These are harder than what you'll see on the test.
    // Attempt them if the regular exercises have failed to
    // satisfy your hunger for Java.
    //




    /**
     * CHALLENGE #2: CREATE A SECRET LUNCH CODE
     *
     * Return a random String containing exactly codeLength
     * lowercase letters.
     *
     * Example:
     *
     * secretLunchCode(5)
     *
     * might return:
     *
     * "xkqpt"
     *
     * You'll need to generate random characters from 'a' through 'z'.
     *
     * Hint:
     * ASCII values and casting to (char) might be useful.
     */
    public String secretLunchCode(int codeLength) {
        // TODO
        String code = new String();
        while (code.length() < codeLength) {
            code += String.valueOf((char)(Math.random()*(122-97+1)+97));
        }
        return code;
    }


    /**
     * CHALLENGE #3: SAUCE CATASTROPHE INDEX
     *
     * The cafeteria has created a completely scientific formula
     * for determining how dangerous your lunch is.
     *
     * Calculate:
     *
     *      | mysterySauce ^ saucePower - numNugs ^ nugPower |
     *
     * and return the result.
     *
     * Example:
     *
     * mysterySauce = 4
     * numNugs = 3
     * saucePower = 2
     * nugPower = 2
     *
     * | 4^2 - 3^2 |
     *
     * | 16 - 9 |
     *
     * = 7
     *
     * Use Math.pow() AND Math.abs().
     */
    public double sauceCatastrophe(double saucePower, double nugPower) {
        // TODO
        return Math.abs((Math.pow(mysterySauce, saucePower))-(Math.pow(numNugs, nugPower)));
    }


    /**
     * CHALLENGE #4: DISTANCE TO THE NUGGETS
     *
     * You are sitting at location (studentX, studentY).
     *
     * The tray of chicken nuggets is sitting at
     * (nugX, nugY).
     *
     * Calculate how far you must travel to acquire the nuggets.
     *
     * Use the distance formula:
     *
     * distance =
     *
     * sqrt(
     *      (nugX - studentX)^2
     *      +
     *      (nugY - studentY)^2
     * )
     *
     */
    public double distanceToNuggets(double studentX, double studentY,
                                    double nugX, double nugY) {
        // TODO
        return Math.sqrt((Math.pow((nugX-studentX),2))+(Math.pow((nugY-studentY),2)));
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        // TODO:
        // Create a LunchTime object using the no-argument constructor.
        LunchTime lunchA = new LunchTime();

        // TODO:
        // Create another LunchTime object using the constructor
        // with parameters.
        //
        // Feel free to invent an appropriately terrible cafeteria
        // entree name.
        LunchTime lunchB = new LunchTime(12, 40.0, true, "double nugget");

        // TODO:
        // Call EVERY non-challenge method at least once.
        //
        // Print the results so you can verify that your methods work.
        System.out.println(lunchA.getEntreeNameLength());
        System.out.println(lunchA.getEntreeSubstring(0,3));
        System.out.println(lunchA.containsNug());
        System.out.println(lunchA.compareLunchNames("burger"));
        System.out.println(lunchA.isSameLunch("nugget"));
        System.out.println(lunchA.cafeteriaRandomness(6,12));
        System.out.println(lunchA.nuggetPower(3));
        System.out.println(lunchA.gotEnoughNugs());

        // OPTIONAL:
        // Attempt the four challenges if you are feeling powerful.
        System.out.println(lunchA.secretLunchCode(10));
        System.out.println(lunchA.sauceCatastrophe(7,3));
        System.out.print(lunchA.distanceToNuggets(0,0,30,40));

        // IMPORTANT:
        // Java cannot actually provide you with chicken nuggets.
        // This is a known limitation of the language.
    }
}