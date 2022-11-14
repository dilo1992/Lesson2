package by.teachmeskills.classwork.lesson29_SOLID.first_principe;

/**
 * this class used for calculating some statistics for salary
 */
public class SalaryStatistics {


    /**
     * @param user - user is selected for statistics
     * @return int value of year`s salary
     */
    public int getSalaryStatistics(User user) {
        return user.getSalary() * 12;
    }

    /**
     * @param company - selected company
     * @return all user`s salary in the company
     */
    public long getSalaryStatistics(Company company) {
        long sum = 0;
        for (User user : company.getUsers()) {
            sum += getSalaryStatistics(user);
        }
        return sum;
    }
}
