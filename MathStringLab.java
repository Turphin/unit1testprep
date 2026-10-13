public class MathStringLab {

    private String text;

    // 5 points: Create a constructor with a parameter that sets the instance variable to that parameter
    public MathStringLab(String theText) {
        text = theText;
    }

    // 5 points: Create a no-argument constructor that sets the instance variable to some value
    public MathStringLab() {
        text = "Hello";
    }

    // 10 points: Return the absolute difference in length between text and the parameter word.
    // Example: text="hello", word="hi" → |5 - 2| = 3
    public int lengthDifference(String word) {
        return Math.abs(text.length() - word.length());
    }

    // 10 points: Return the character at a random index of text.
    // HINT: Use Math.random() to generate an index.
    // Example: text="Ballard" → could return 'l'
    public String randomCharacter() {
        int i = (int)Math.random()*text.length();
        return text.substring(i, i+1);
    }


    // CHALLENGE: (for extra credit)
    // Return text with each character repeated N times (e.g., "cat", n=2 → "ccaatt")
    // You’ll need to use a loop to do this, so try it *after* finishing everything else.
    public String repeatEachChar(int n) {
        String result = new String("");
        for (int i = 0; i < text.length(); i++) {
            result = result + text.substring(i, i+1).repeat(n);
        }
        return result;
    }

    public static void main(String[] args) {
        // 5 points: Instantiate an object of MathStringLab with a parameter of your choosing
        MathStringLab one = new MathStringLab("Hello World");
        // 5 points: Call the no-argument constructor
        MathStringLab two = new MathStringLab();
        // 5 points each: Call each of your methods (lengthDifference and randomCharacter)
        int lengthDiff = one.lengthDifference("Hi");
        String randomChar = one.randomCharacter();
        String repeatString = one.repeatEachChar(2);
        // Print out the results neatly so they’re easy to read. The output should be in the following format:
        // "Result of lengthDifference(): <the result>
        System.out.println(lengthDiff);
        System.out.println(randomChar);
        System.out.print(repeatString);
    }
}