package com.wildcodeschool.swapi.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {

    // TODO : add attributes
	private String name;
	private Integer population;
	@JsonProperty("rotation_period")
   private String rotationPeriod;
	@JsonProperty("orbital_period")
   private String orbitalPeriod;
   private String diameter;
   private String climate;
   private String gravity;
   private String terrain;
   @JsonProperty("surface_water")
   private String surfaceWater;
   private String[] residents;
   private String[] films;
   private Date created;
   private Date edited;
   private String url;

    // TODO : add an empty constructor
	public Planet() {
	}

	 // TODO : add getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}


	public String[] getResidents() {
		return residents;
	}

	public void setResidents(String[] residents) {
		this.residents = residents;
	}

	public String[] getFilms() {
		return films;
	}

	public void setFilms(String[] films) {
		this.films = films;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEdited() {
		return edited;
	}

	public void setEdited(Date edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(String rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public String getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public String getSurfaceWater() {
		return surfaceWater;
	}

	public void setSurfaceWater(String surfaceWater) {
		this.surfaceWater = surfaceWater;
	}


}
