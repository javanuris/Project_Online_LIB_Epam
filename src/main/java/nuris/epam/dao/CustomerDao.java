package nuris.epam.dao;

import nuris.epam.dao.exception.DaoException;
import nuris.epam.entity.Customer;
import nuris.epam.entity.Management;

import java.util.List;

/**
 * Abstract class, describes additional queries for the customer table in the database.
 *
 * @author Kalenov Nurislam
 */
public abstract class CustomerDao extends BaseDao<Customer> {

    /**
     * Method, determines the number of users in the table.
     *
     * @return Returns a specific number of users
     */
    public abstract int getCustomerCount() throws DaoException;

    /**
     * Method, searches for a user by a unique name (login).
     *
     * @param login - unique name (login) of the user.
     * @return Returns a particular user.
     */
    public abstract Customer getCustomer(String login) throws DaoException;

    /**
     * Method, searches for a user by a unique name (login) and password.
     *
     * @param login    - unique name (login) of the user.
     * @param password - user password.
     * @return Returns a specific user.
     */
    public abstract Customer getCustomer(String login, String password) throws DaoException;

    /**
     * Method, searches for a user based on the entity Management.
     *
     * @param management - entity
     * @return Returns a specific user.
     */
    public abstract Customer findByManagement(Management management) throws DaoException;

    /**
     * The method returns the n-th number of users.
     *
     * @param start - start the field in the table in the database
     * @param count - the number of fields in the database to load.
     * @return Returns a specific number of users
     */
    public abstract List<Customer> getLimitCustomers(int start, int count) throws DaoException;


}
