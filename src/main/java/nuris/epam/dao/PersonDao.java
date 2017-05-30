package nuris.epam.dao;

import nuris.epam.dao.exception.DaoException;
import nuris.epam.entity.Customer;
import nuris.epam.entity.Person;

/**
 * Abstract class, describes additional queries for the person table in the database.
 *
 * @author Kalenov Nurislam
 */
public abstract class PersonDao extends BaseDao<Person> {

    /**
     * Method, searches for the Person entity with the Book entity taken into account.
     *
     * @param customer - entity
     * @return Returns a specific entity.
     */
    public abstract Person findByCustomer(Customer customer) throws DaoException;
}
