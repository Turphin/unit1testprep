
public class MovieTheater {

    // ============================================================
    // INSTANCE VARIABLES
    // ============================================================

    // The title of the movie you're watching.
    // Examples:
    // "Attack of the Killer Popcorn"
    // "Fast and Furious 27: Retirement Home Drift"
    // "The Homework Strikes Back"
    private String movieTitle;

    // The number of tickets you purchased.
    // Hopefully you have at least one friend.
    private int numTickets;

    // The price of ONE ticket.
    // Warning: May require taking out a small loan.
    private double ticketPrice;

    // Whether the movie is actually worth watching.
    // The trailers may have been misleading.
    private boolean goodMovie;


    // ============================================================
    // CONSTRUCTORS
    // ============================================================

    /**
     * No-argument constructor.
     *
     * Give ALL FOUR instance variables reasonable default values.
     * Feel free to invent a ridiculous movie title.
     */
    public MovieTheater() {
        // TODO: Initialize all four instance variables.
        // You can default it to a movie that is playing at Majestic Bay right now.
        movieTitle = ;
        numTickets = ;
        ticketPrice = ;
        goodMovie = ;
    }


    /**
     * Constructor that allows someone to describe
     * their exact movie-going situation.
     */
    public MovieTheater(String title, int tickets,
                        double price, boolean good) {
        // TODO: Initialize all four instance variables
        // using the parameters.
        movieTitle = title;
        numTickets = tickets;
        ticketPrice = price;
        goodMovie = good;
    }


    // ============================================================
    // STRING PRACTICE
    // ============================================================

    /**
     * Returns the number of characters in the movie title.
     *
     * Example:
     * "Sharknado" -> 9
     *
     */
    public int getMovieTitleLength() {
        // TODO
        return movieTitle.length();
    }


    /**
     * Returns part of the movie title using the given indexes.
     *
     * Example:
     * If movieTitle is "Attack of Jimothy":
     *
     * getMovieSubstring(0, 6)
     *
     * would return:
     *
     * "Attack"
     */
    public String getMovieSubstring(int start, int end) {
        // TODO
        return movieTitle.getMovieSubstring(start,end);
    }


    /**
     * Finds the first occurrence of the word "of"
     * in the movie title.
     *
     * Example:
     * "The Opening of Exit 5" -> 12
     *
     * If "of" isn't found, what does indexOf() return?
     *
     * Use .indexOf()
     */
    public int findOf() {
        // TODO
        return movieTitle.indexOf("of");
    }


    /**
     * Compares your movie title to another movie title
     * alphabetically.
     *
     * Use .compareTo()
     *
     * Returns a negative number, zero, or positive number.
     *
     */
    public int compareMovieTitles(String otherTitle) {
        // TODO
        return 0;
    }


    /**
     * Returns true if your movie title is EXACTLY
     * the same as another movie title.
     *
     * Use .equals()
     *
     * Remember: "Beavers" and "beavers"
     * are NOT the same String.
     */
    public boolean isSameMovie(String otherTitle) {
        // TODO
        return false;
    }


    // ============================================================
    // MATH AND BOOLEAN PRACTICE
    // ============================================================

    /**
     * The theater has decided that ticket prices
     * should be determined by a random number generator.
     *
     * Return a random integer between minPrice and maxPrice,
     * INCLUDING both endpoints.
     *
     * Example:
     * randomTicketPrice(10, 20)
     *
     * could return:
     * 10, 11, 12, ..., 19, or 20
     *
     * Use Math.random() and casting to int.
     *
     * Assume minPrice <= maxPrice.
     */
    public int randomTicketPrice(int minPrice, int maxPrice) {
        // TODO
        return 0;
    }


    /**
     * The movie theater has invented a new way to calculate
     * ticket prices: exponential price increases!
     *
     * Return ticketPrice raised to the given power.
     *
     * Example:
     * ticketPrice = 5.0
     * power = 2
     *
     * Result = 25.0
     *
     * Use Math.pow()
     */
    public double ticketPricePower(double power) {
        // TODO
        return 0.0;
    }


    /**
     * Returns the absolute difference between
     * the actual ticket price and the amount you
     * THINK a ticket should cost.
     *
     * Example:
     * ticketPrice = 18.50
     * fairPrice = 7.50
     *
     * Result = 11.0
     *
     * Use Math.abs()
     */
    public double ticketPriceRipoff(double fairPrice) {
        // TODO
        return 0.0;
    }


    /**
     * Returns whether the movie is actually good.
     *
     * Remember: Just because a movie has explosions,
     * dinosaurs, and a talking dog doesn't mean
     * it's good. Although it probably is.
     */
    public boolean isWorthWatching() {
        // TODO
        return false;
    }


    // ============================================================
    // CHALLENGES
    // ============================================================
    //
    // These are harder than what you'll see on the test.
    //
    // Complete the regular exercises first.
    // Then attempt these if you have survived the previews.
    //


    /**
     * CHALLENGE #1: THE POPCORN LOTTERY
     *
     * The theater gives you a random number of popcorn
     * kernels. Yes, they count them individually.
     *
     * Return a random integer between minKernels and
     * maxKernels, INCLUDING both endpoints.
     *
     * HOWEVER, the theater guarantees that every customer
     * gets at least 50 kernels.
     *
     * Example:
     * popcornLottery(10, 100)
     *
     * should return a random integer between 50 and 100.
     *
     * popcornLottery(80, 120)
     *
     * should return a random integer between 80 and 120.
     *
     * Assume maxKernels >= 50 and
     * minKernels <= maxKernels.
     *
     * Hint: Math.random() and Math.max() could help,
     * but you can solve it without Math.max().
     */
    public int popcornLottery(int minKernels, int maxKernels) {
        // TODO
        return 0;
    }


    /**
     * CHALLENGE #2: GENERATE A SECRET TICKET CODE
     *
     * Every ticket needs a secret code to prevent
     * movie theater espionage.
     *
     * Return a random String containing exactly
     * codeLength UPPERCASE letters (A-Z).
     *
     * Example:
     * secretTicketCode(6)
     *
     * might return:
     *
     * "QZBTRX"
     *
     * Hint:
     * ASCII values, Math.random(), and casting
     * to (char) might be useful.
     */
    public String secretTicketCode(int codeLength) {
        // TODO
        return "";
    }


    /**
     * CHALLENGE #3: THE POPCORN PRICE DISASTER
     *
     * Movie theaters have discovered that popcorn
     * can cost more than the actual movie.
     *
     * Calculate the absolute difference between:
     *
     *     ticketPrice ^ ticketPower
     *
     * and:
     *
     *     popcornPrice ^ popcornPower
     *
     * Formula:
     *
     * | ticketPrice^ticketPower -
     *   popcornPrice^popcornPower |
     *
     * Example:
     *
     * ticketPrice = 10
     * popcornPrice = 4
     * ticketPower = 2
     * popcornPower = 2
     *
     * | 100 - 16 | = 84
     *
     * Use Math.pow() AND Math.abs().
     */
    public double popcornPriceDisaster(double popcornPrice,
                                       double ticketPower,
                                       double popcornPower) {
        // TODO
        return 0.0;
    }


    /**
     * CHALLENGE #4: THE BATHROOM EMERGENCY
     *
     * You're halfway through a three-hour movie,
     * and that 64-ounce soda was a terrible idea.
     *
     * Your seat is at (seatX, seatY).
     * The bathroom is at (bathroomX, bathroomY).
     *
     * Calculate the straight-line distance to the bathroom.
     *
     * Use the distance formula:
     *
     * sqrt(
     *   (bathroomX - seatX)^2
     *   +
     *   (bathroomY - seatY)^2
     * )
     *
     * You may NOT use Math.sqrt().
     *
     * Instead:
     * sqrt(number) = Math.pow(number, 0.5)
     *
     * Use Math.pow().
     *
     * The fate of your bladder depends on it.
     */
    public double distanceToBathroom(double seatX, double seatY,
                                     double bathroomX, double bathroomY) {
        // TODO
        return 0.0;
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        // TODO:
        // Create a MovieTheater object using the
        // no-argument constructor.


        // TODO:
        // Create another MovieTheater object using
        // the constructor with parameters.
        //
        // Invent your own ridiculous movie title.


        // TODO:
        // Call EVERY non-challenge method at least once.
        //
        // Print the results so you can verify
        // that your methods work.


        // OPTIONAL:
        // Attempt all four challenges.


        // FINAL WARNING:
        // If your program crashes, you do NOT get a refund.
    }
}
