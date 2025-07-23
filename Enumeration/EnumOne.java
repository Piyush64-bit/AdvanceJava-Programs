
package Enumeration;

enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

// 1> With the help of enumeration in java, i can declare any constant whatsoever in java and use it anywhere in my code.
// 2> Here, i have used constants RED, GREEN and BLUE along with that thier values, so when they are called, thier values present inside them is also shown.
// 3> They can be allocated in diffrent files, without creating and object