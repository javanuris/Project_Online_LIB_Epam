package nuris.epam.dao;

import nuris.epam.dao.exception.DaoException;
import nuris.epam.entity.City;
import nuris.epam.entity.Person;

import java.util.List;

/**
 * Abstract class, describes additional queries for the city table in the database.
 *
 * @author Kalenov Nurislam
 */
public abstract class CityDao extends BaseDao<City> {
    /**
     * A method for finding a book with Person.
     *
     * @param person - entity
     * @return Returns the concise City entity.
     */
    public abstract City findByPerson(Person person) throws DaoException;

    /**
     * Method, provides a list of all cities.
     *
     * @return Returns the list of cities.
     */
    public abstract List<City> getAllCity() throws DaoException;

}
