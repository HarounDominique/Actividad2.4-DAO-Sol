package es.teis.ud2.model.dao.account;

import es.teis.ud2.model.Account;
import es.teis.ud2.model.dao.IGenericDao;

import java.math.BigDecimal;

public interface IAccountDao extends IGenericDao<Account> {
    boolean transferir(int accIdOrigen, int accIdDestino, BigDecimal amount);
}
