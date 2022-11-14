package by.teachmeskills.classwork.lesson29_SOLID.first_principe;

/**
 * This class used for calculating month of user`s life
 */
public class MonthCalculator {

    /**
     *
     * @param user - current user
     * @return full month of user`s life
     */
    public int getCurrentMonthOfLife(User user) {

        return user.getAge()*12;
    }
}
