package nuris.epam.dao;

import nuris.epam.dao.exception.DaoException;
import nuris.epam.entity.BookInfo;
import nuris.epam.entity.Transaction;

/**
 * Abstract class, describes additional queries for the bookInfo table in the database.
 *
 * @author Kalenov Nurislam
 */
public abstract class BookInfoDao extends BaseDao<BookInfo> {

    /**
     * Method, to search for a book by the number in the table.
     *
     * @param id - unique number
     * @return Returns the concise essence of BookInfo.
     */
    public abstract BookInfo findByBook(int id) throws DaoException;

    /**
     * Метод, для поиск книги с учетом сущности Transaction.
     *
     * @param transaction - entity
     * @return Returns a specific BookInfo entity.
     */
    public abstract BookInfo findByTransaction(Transaction transaction) throws DaoException;
}
