package br.com.jhmcnet.financas.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jhmcnet.financas.util.JPAUtil;

public class TestaConta {
	
	public static void main(String[] args){
		
		Conta conta = new Conta();
		conta.setTitular("João");
		conta.setBanco("BB");
		conta.setAgencia("0027");
		conta.setNumero("987654321-0");
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		
	}
	
	

}
