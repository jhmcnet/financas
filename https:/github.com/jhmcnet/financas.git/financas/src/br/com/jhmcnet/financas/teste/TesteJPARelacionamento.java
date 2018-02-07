package br.com.jhmcnet.financas.teste;

import javax.persistence.EntityManager;

import br.com.jhmcnet.financas.util.JPAUtil;

public class TesteJPARelacionamento {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		
		em.getTransaction().commit();
		em.close();

	}

}
