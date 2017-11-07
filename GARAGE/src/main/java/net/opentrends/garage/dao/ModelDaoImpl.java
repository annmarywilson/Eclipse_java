package net.opentrends.garage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.opentrends.garage.dto.ModelDTO;
import net.opentrends.garage.dto.VehicleDto;
import net.opentrends.garage.model.Brand;
import net.opentrends.garage.model.Model;
import net.opentrends.garage.model.Rent;

@Repository
@Transactional
public class ModelDaoImpl implements ModelDAO{
@Autowired
private SessionFactory sessionFactory;
@Override
public void addModel(Model model) {
sessionFactory.openSession().saveOrUpdate(model);		
}
@Override
public List<Model> getAllModel() {
	return sessionFactory.openSession().createQuery("FROM Model").list();
}
@Override
public void deleteModel(Integer modelID) {
	Model model = sessionFactory.openSession().get(Model.class, modelID);	
    if(null!=model){
    	this.sessionFactory.openSession().delete(model);
}	
}
@Override
public Model updateModel(Model model) {
	sessionFactory.openSession().update(model);
	return model;
}
@Override
public Model getModel(int model) {
	return null;
}
@Override
public void addVehicle(VehicleDto vehicleDto) {
Rent rent = new Rent(vehicleDto.getRentperDay());
Brand brand = sessionFactory.openSession().get(Brand.class, vehicleDto.getBrandId());
Model model = new Model(vehicleDto.getModelNumber(), vehicleDto.getStock(),brand,rent);
rent.setModel(model);
sessionFactory.openSession().save(model);
}
@Override
public List getModelListById(int brandId) {
	Session session=sessionFactory.openSession();
	Criteria crit=session.createCriteria(Model.class);
	crit.add(Restrictions.eq("brand.brandid", brandId));
	List<Model> model= crit.list();
	List<ModelDTO> modelDto=new ArrayList<>();
	for(Model model_item:model) {
		ModelDTO modelDTO=new ModelDTO();
		BeanUtils.copyProperties(model_item, modelDTO);
		modelDto.add(modelDTO);
	}
	return modelDto;
}
}
