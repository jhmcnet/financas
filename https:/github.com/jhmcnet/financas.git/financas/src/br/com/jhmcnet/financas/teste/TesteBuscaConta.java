package br.com.jhmcnet.financas.teste;

import javax.persistence.EntityManager;

import br.com.jhmcnet.financas.modelo.Conta;
import br.com.jhmcnet.financas.util.JPAUtil;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class, 5);
		conta.setTitular("Luiz Pedro");
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
	}

}
