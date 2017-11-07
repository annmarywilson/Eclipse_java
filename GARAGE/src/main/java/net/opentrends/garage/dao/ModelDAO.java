package net.opentrends.garage.dao;

import java.util.List;

import net.opentrends.garage.dto.VehicleDto;
import net.opentrends.garage.model.Model;

public interface ModelDAO {
	
	public void addModel(Model model);
	public List<Model> getAllModel();
	public void deleteModel(Integer modelID);
	public Model updateModel(Model model);
	public Model getModel(int model);
	public void addVehicle(VehicleDto vehicleDto);
	public List getModelListById(int brandId);

}
