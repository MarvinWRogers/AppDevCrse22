package WK02HW2Java;


// the chef class is a character who has a cuisine pulled from the enum CUISINE { } and a few attributes listed below
class CHEF {

    private CUISINE cuisineType;
    private int age;
    private String culinarySchool;
    private double rating;

    public CHEF() {
        } // constructor for chef



// Define a mutator for each of the fields defined in your class.
    // Define an accessor for each of the fields defined in your class.
        // Four private variables -- enum, int, String, double
public int getChefAge() {
        return age;
        }  // age accessor
public void setChefAge(int newAge) {
        age = newAge;
        } // age mutator

public double getChefRating() {
        return rating;
        }  // age accessor
public void setChefRating(double newRating) {
        rating = newRating;
        } // age mutator
public String getCulinarySchool() {
        return culinarySchool;
        }  // culinary accessor

public void setCulinarySchool(String newCulinarySchool) {
        culinarySchool = newCulinarySchool;
        } // culinary mutator

    public CUISINE getCuisine() {
        // does not like when you try to add a string into the return when using a enum
        return cuisineType;
    }

    public void setCuisine(CUISINE newCuisineType) {
        cuisineType = newCuisineType;
    }
} // end chef class