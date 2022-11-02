package WK02HW2Java;

/*

   Marvin Rogers

    Description:
    Week 02 HW 02
        - Utilized enum types and integrated in class
        - Setters/Getters for three different data types
        - Set private class variables and accessed enum and printed display to user

 */

public class Main {

    public static void main(String[] args) {
        // Use the accessors defined above to display the values of all fields of your two instances.

        CHEF chef1 = new CHEF(); // instance of class 1
        CHEF chef2 = new CHEF(); // instance of class 2

        // Use the mutators defined above to set all instance variables for your two instances.
        chef1.setChefAge(53); chef1.setCulinarySchool("Java Culinary School"); chef1.setCuisine(CUISINE.INDIAN); chef1.setChefRating(5.0);
        chef2.setChefAge(47); chef2.setCulinarySchool("C# Culinary Skool"); chef2.setCuisine(CUISINE.AMERICAN); chef2.setChefRating(3.4);

        // Use the accessors defined above to display the values of all fields of your two instances.
        System.out.println(chef1.getChefAge()+"\n"+ chef1.getCulinarySchool()+"\n"+chef1.getChefRating()+"\n"+chef1.getCuisine()+"\n");
        System.out.println(chef2.getChefAge()+"\n"+ chef2.getCulinarySchool()+"\n"+chef2.getChefRating()+"\n"+chef2.getCuisine());
    } // end main execution
} // end main class