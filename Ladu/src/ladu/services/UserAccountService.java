package ladu.services;

import javax.persistence.Query;

import ladu.model.UserAccount;

import org.apache.log4j.Logger;


	public class UserAccountService extends BaseService{
		public UserAccount getAccountByUsernameAndPassword(String username, String password) {
			 try {
				 Query q = getEntityManager().createQuery("select user_account from UserAccount where username=:username and passw=:psw");
				 q.setParameter("username", username).setParameter("psw", password);
				 return (UserAccount) q.getSingleResult();
			 } catch (Exception e) {
				Logger.getLogger(UserAccountService.class).warn(e.getMessage());
			}
			 return null;
		 }
}
