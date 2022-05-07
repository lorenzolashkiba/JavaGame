package model;

import java.time.LocalDateTime;

public class CityData
{
	private LocalDateTime day;
	private int housesNum;
	private int cinemasNum;
	private int restaurantsNum;
	private int policeStationsNum;
	private int trainStationsNum;
	private int airportsNum;
	private int arcadesNum;
	private int casinoNum;
	private int factoriesNum;
	private int supermarketsNum;
	private int parksNum;
	private int hospitalsNum;
	
	public CityData(LocalDateTime day)
	{
		this.day = day;
		this.housesNum=0;
		this.cinemasNum=0;
		this.restaurantsNum=0;
		this.policeStationsNum=0;
		this.trainStationsNum=0;
		this.airportsNum=0;
		this.arcadesNum=0;
		this.casinoNum=0;
		this.factoriesNum=0;
		this.supermarketsNum=0;
	}
	public int sumAll() {
		return housesNum+cinemasNum+restaurantsNum+policeStationsNum+trainStationsNum+airportsNum+arcadesNum+casinoNum+factoriesNum+supermarketsNum;
	}

	public LocalDateTime getDay()
	{
		return day;
	}
	
	public void setDay(LocalDateTime day)
	{
		this.day = day;
	}
	
	public int getHousesNum()
	{
		return housesNum;
	}

	public void setHousesNum(int housesNum)
	{
		this.housesNum = housesNum;
	}

	public int getCinemasNum()
	{
		return cinemasNum;
	}

	public void setCinemasNum(int cinemasNum)
	{
		this.cinemasNum = cinemasNum;
	}

	public int getRestaurantsNum()
	{
		return restaurantsNum;
	}

	public void setRestaurantsNum(int restaurantsNum)
	{
		this.restaurantsNum = restaurantsNum;
	}

	public int getPoliceStationsNum()
	{
		return policeStationsNum;
	}

	public void setPoliceStationsNum(int policeStationsNum)
	{
		this.policeStationsNum = policeStationsNum;
	}

	public int getTrainStationsNum()
	{
		return trainStationsNum;
	}

	public void setTrainStationsNum(int trainStationsNum)
	{
		this.trainStationsNum = trainStationsNum;
	}

	public int getAirportsNum()
	{
		return airportsNum;
	}

	public void setAirportsNum(int airportsNum)
	{
		this.airportsNum = airportsNum;
	}

	public int getArcadesNum()
	{
		return arcadesNum;
	}

	public void setArcadesNum(int arcadesNum)
	{
		this.arcadesNum = arcadesNum;
	}

	public int getCasinoNum()
	{
		return casinoNum;
	}

	public void setCasinoNum(int casinoNum)
	{
		this.casinoNum = casinoNum;
	}

	public int getFactoriesNum()
	{
		return factoriesNum;
	}

	public void setFactoriesNum(int factoriesNum)
	{
		this.factoriesNum = factoriesNum;
	}

	public int getSupermarketsNum()
	{
		return supermarketsNum;
	}

	public void setSupermarketsNum(int supermarketsNum)
	{
		this.supermarketsNum = supermarketsNum;
	}
}
