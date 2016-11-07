package it.azienda.progetto.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.azienda.progetto.bean.Cyclist;
import it.azienda.progetto.filter.CyclistFilter;

@Repository("cyclistDao")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class CyclistDAO {
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	public List<Cyclist> retrieveCyclist(CyclistFilter filter){
		return sessionFactory.openSession().selectList("retrieveAllCyclist", filter);
	}

}
