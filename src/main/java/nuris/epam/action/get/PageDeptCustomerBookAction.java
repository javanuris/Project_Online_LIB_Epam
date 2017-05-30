package nuris.epam.action.get;

import nuris.epam.action.manager.Action;
import nuris.epam.action.manager.ActionResult;
import nuris.epam.entity.Customer;
import nuris.epam.entity.Transaction;
import nuris.epam.services.TransactionService;
import nuris.epam.services.exceptions.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

import static nuris.epam.action.constants.Constants.*;

/**
 * Action class, provide data about dept books for specific customer
 *
 * @author Kalenov Nurislam
 */
public class PageDeptCustomerBookAction implements Action {
    private static final Logger log = LoggerFactory.getLogger(PageDeptCustomerBookAction.class);

    @Override
    public ActionResult execute(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        int id = (int) session.getAttribute(ATT_CUSTOMER_ID);

        TransactionService transactionService = new TransactionService();
        Transaction transaction = new Transaction();
        Customer customer = new Customer();
        customer.setId(id);
        transaction.setCustomer(customer);

        try {
            List<Transaction> transactions = transactionService.getActiveCustomerTransaction(transaction);
            req.setAttribute(ATT_CUSTOMER_BOOK, transactions);
            log.debug("Transfer information about customer where customer id = {} ", customer.getId());
        } catch (ServiceException e) {
            log.warn("Can't transfer information about customer where customer id = {} ", customer.getId());
        }
        return new ActionResult(DEPT_CUSTOMER_BOOK);
    }

}