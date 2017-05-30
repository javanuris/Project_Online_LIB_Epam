package nuris.epam.dao;

import nuris.epam.dao.exception.DaoException;
import nuris.epam.entity.Book;
import nuris.epam.entity.Genre;

import java.util.List;

/**
 * Abstract class, describes additional queries for the genre table in the database.
 *
 * @author Kalenov Nurislam
 */
public abstract class GenreDao extends BaseDao<Genre> {

    /**
     * A method that searches for a genre, taking into account the Book entity.
     *
     * @param book - entity
     * @return Returns a particular genre.
     */
    public abstract Genre findByBook(Book book) throws DaoException;

    /**
     * Method, provides a list of genres.
     *
     * @return Returns a particular genre.
     */
    public abstract List<Genre> getAllGenre() throws DaoException;

}
