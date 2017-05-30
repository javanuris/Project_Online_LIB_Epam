package nuris.epam.dao;

import nuris.epam.dao.exception.DaoException;
import nuris.epam.entity.Management;
import nuris.epam.entity.Transaction;

import java.util.List;

/**
 * Abstract class, describes additional queries for the transaction table in the database.
 *
 * @author Kalenov Nurislam
 */
public abstract class TransactionDao extends BaseDao<Transaction> {

    /**
     * Method, provides a list of Transaction entities found with the Customer entity.
     *
     * @param transaction - Entity containing data about the entity Customer
     * @return Returns the list of Transaction entities
     */
    public abstract List<Transaction> findByCustomer(Transaction transaction) throws DaoException;

    /**
     * Method, returns the n-th number of Transaction entities.
     *
     * @param start    - start the field in the table in the database
     * @param count    - the number of fields in the database to load.
     * @param isActive - state of the Transaction entity
     * @return Returns a specific number of Transaction
     */
    public abstract List<Transaction> getListTransactionByCustomer(Transaction transaction, int start, int count, boolean isActive) throws DaoException;

    /**
     * Method, delineates the list of Transaction entities found with the essence of Management.
     *
     * @param management - entity containing data about the entity Customer
     * @return Returns a specific number of Transaction
     */
    public abstract Transaction findByManagement(Management management) throws DaoException;

    /**
     * Method, delivers the total number of Transaction entities, taking into account their composition and membership in the Customer entity (active, inactive).
     *
     * @param transaction - contain information about the Customer entity.
     * @param isActive    - state of the Transaction entity
     * @return Returns a specific number of Management
     */
    public abstract int getTransactionCountByCustomer(Transaction transaction, boolean isActive) throws DaoException;


}
