package br.com.saudefacil;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.dao.PessoaDAO;
import br.com.saudefacil.models.Pessoa;

 
public class AppMain {
 
    static Pessoa pessoa;
	static PessoaDAO controllerPessoa = new PessoaDAO();
 
    public static void main(String[] args) {
        System.out.println(".......Hibernate Maven Example.......\n");
    	List<Pessoa> consulta = controllerPessoa.getPessoas();
    	System.out.println(consulta);
    }
    
    protected static void read() {
        Session session = HibernatesUtil.getSessionFactory().openSession();
     
        int pessoaId = 1;
        Pessoa pessoa = (Pessoa)session.get(Pessoa.class, pessoaId);
     
        System.out.println("Nome: " + pessoa.getNome());
     
        session.close();
    }
}