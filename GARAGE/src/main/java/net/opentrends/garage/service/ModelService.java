package net.opentrends.garage.service;

import java.util.List;

import net.opentrends.garage.dto.ModelDTO;
import net.opentrends.garage.dto.VehicleDto;
import net.opentrends.garage.model.Model;

public interface ModelService {
	public void addModel(VehicleDto vehicle);
	public List<ModelDTO> getAllModels();
	public void deleteModel(Integer modelID);
	public Model updateModel(Model model);
	public Model getModel(int modelID);
	void addModel(Model model);
	public List getModelListById(int brandId);

}
