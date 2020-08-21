package com.yogo.nakalabackend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Covid {
    @Id
    private String id;

    private String isoCode, continent, location, testsUnits;
    private String date;

    private Double totalCases, newCases, totalDeaths, newDeaths, totalDeathsPerMillion, newDeathsPerMillion;
    private Double newCasesSmoothed, newDeathSmoothed, totalCasesPerMillion, newCasesPerMillion;
    private Double newCasesSmoothedPerMillion, newDeathsSmoothedPerMillion, totalTestsPerThousand, newTestsPerThousand,
            newTestsSmoothed, newTestsSmoothedPerThousand, testsPerCase, positiveRate, stringencyIndex, medianAge,
            aged65OrOlder, aged70Older, gdpPerCapita, extremePoverty, cardiovascDeathRate, diabetesPrevalence,
            femaleSmokers, maleSmokers, handwashingFacilities, hospitalBedsPerThousand, lifeExpectancy,
            populationDensity;

    private Double newTests, totalTest, population;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Double totalCases) {
        this.totalCases = totalCases;
    }

    public Double getNewCases() {
        return newCases;
    }

    public void setNewCases(Double newCases) {
        this.newCases = newCases;
    }

    public Double getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Double totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Double getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Double newDeaths) {
        this.newDeaths = newDeaths;
    }

    public Double getTotalDeathsPerMillion() {
        return totalDeathsPerMillion;
    }

    public void setTotalDeathsPerMillion(Double totalDeathsPerMillion) {
        this.totalDeathsPerMillion = totalDeathsPerMillion;
    }

    public Double getNewDeathsPerMillion() {
        return newDeathsPerMillion;
    }

    public void setNewDeathsPerMillion(Double newDeathsPerMillion) {
        this.newDeathsPerMillion = newDeathsPerMillion;
    }

    public Double getNewCasesSmoothed() {
        return newCasesSmoothed;
    }

    public void setNewCasesSmoothed(Double newCasesSmoothed) {
        this.newCasesSmoothed = newCasesSmoothed;
    }

    public Double getNewDeathSmoothed() {
        return newDeathSmoothed;
    }

    public void setNewDeathSmoothed(Double newDeathSmoothed) {
        this.newDeathSmoothed = newDeathSmoothed;
    }

    public Double getTotalCasesPerMillion() {
        return totalCasesPerMillion;
    }

    public void setTotalCasesPerMillion(Double totalCasesPerMillion) {
        this.totalCasesPerMillion = totalCasesPerMillion;
    }

    public Double getNewCasesPerMillion() {
        return newCasesPerMillion;
    }

    public void setNewCasesPerMillion(Double newCasesPerMillion) {
        this.newCasesPerMillion = newCasesPerMillion;
    }

    public Double getNewCasesSmoothedPerMillion() {
        return newCasesSmoothedPerMillion;
    }

    public void setNewCasesSmoothedPerMillion(Double newCasesSmoothedPerMillion) {
        this.newCasesSmoothedPerMillion = newCasesSmoothedPerMillion;
    }

    public Double getNewDeathsSmoothedPerMillion() {
        return newDeathsSmoothedPerMillion;
    }

    public void setNewDeathsSmoothedPerMillion(Double newDeathsSmoothedPerMillion) {
        this.newDeathsSmoothedPerMillion = newDeathsSmoothedPerMillion;
    }

    public Double getTotalTestsPerThousand() {
        return totalTestsPerThousand;
    }

    public void setTotalTestsPerThousand(Double totalTestsPerThousand) {
        this.totalTestsPerThousand = totalTestsPerThousand;
    }

    public Double getNewTestsPerThousand() {
        return newTestsPerThousand;
    }

    public void setNewTestsPerThousand(Double newTestsPerThousand) {
        this.newTestsPerThousand = newTestsPerThousand;
    }

    public Double getNewTestsSmoothed() {
        return newTestsSmoothed;
    }

    public void setNewTestsSmoothed(Double newTestsSmoothed) {
        this.newTestsSmoothed = newTestsSmoothed;
    }

    public Double getNewTestsSmoothedPerThousand() {
        return newTestsSmoothedPerThousand;
    }

    public void setNewTestsSmoothedPerThousand(Double newTestsSmoothedPerThousand) {
        this.newTestsSmoothedPerThousand = newTestsSmoothedPerThousand;
    }

    public Double getTestsPerCase() {
        return testsPerCase;
    }

    public void setTestsPerCase(Double testsPerCase) {
        this.testsPerCase = testsPerCase;
    }

    public Double getPositiveRate() {
        return positiveRate;
    }

    public void setPositiveRate(Double positiveRate) {
        this.positiveRate = positiveRate;
    }

    public String getTestsUnits() {
        return testsUnits;
    }

    public void setTestsUnits(String testsUnits) {
        this.testsUnits = testsUnits;
    }

    public Double getStringencyIndex() {
        return stringencyIndex;
    }

    public void setStringencyIndex(Double stringencyIndex) {
        this.stringencyIndex = stringencyIndex;
    }

    public Double getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(Double medianAge) {
        this.medianAge = medianAge;
    }

    public Double getAged65OrOlder() {
        return aged65OrOlder;
    }

    public void setAged65OrOlder(Double aged65OrOlder) {
        this.aged65OrOlder = aged65OrOlder;
    }

    public Double getAged70Older() {
        return aged70Older;
    }

    public void setAged70Older(Double aged70Older) {
        this.aged70Older = aged70Older;
    }

    public Double getGdpPerCapita() {
        return gdpPerCapita;
    }

    public void setGdpPerCapita(Double gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }

    public Double getExtremePoverty() {
        return extremePoverty;
    }

    public void setExtremePoverty(Double extremePoverty) {
        this.extremePoverty = extremePoverty;
    }

    public Double getCardiovascDeathRate() {
        return cardiovascDeathRate;
    }

    public void setCardiovascDeathRate(Double cardiovascDeathRate) {
        this.cardiovascDeathRate = cardiovascDeathRate;
    }

    public Double getDiabetesPrevalence() {
        return diabetesPrevalence;
    }

    public void setDiabetesPrevalence(Double diabetesPrevalence) {
        this.diabetesPrevalence = diabetesPrevalence;
    }

    public Double getFemaleSmokers() {
        return femaleSmokers;
    }

    public void setFemaleSmokers(Double femaleSmokers) {
        this.femaleSmokers = femaleSmokers;
    }

    public Double getMaleSmokers() {
        return maleSmokers;
    }

    public void setMaleSmokers(Double maleSmokers) {
        this.maleSmokers = maleSmokers;
    }

    public Double getHandwashingFacilities() {
        return handwashingFacilities;
    }

    public void setHandwashingFacilities(Double handwashingFacilities) {
        this.handwashingFacilities = handwashingFacilities;
    }

    public Double getHospitalBedsPerThousand() {
        return hospitalBedsPerThousand;
    }

    public void setHospitalBedsPerThousand(Double hospitalBedsPerThousand) {
        this.hospitalBedsPerThousand = hospitalBedsPerThousand;
    }

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Double getPopulationDensity() {
        return populationDensity;
    }

    public void setPopulationDensity(Double populationDensity) {
        this.populationDensity = populationDensity;
    }

    public Double getNewTests() {
        return newTests;
    }

    public void setNewTests(Double newTests) {
        this.newTests = newTests;
    }

    public Double getTotalTest() {
        return totalTest;
    }

    public void setTotalTest(Double totalTest) {
        this.totalTest = totalTest;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Covid [aged65OrOlder=" + aged65OrOlder + ", aged70Older=" + aged70Older + ", cardiovascDeathRate="
                + cardiovascDeathRate + ", continent=" + continent + ", date=" + date + ", diabetesPrevalence="
                + diabetesPrevalence + ", extremePoverty=" + extremePoverty + ", femaleSmokers=" + femaleSmokers
                + ", gdpPerCapita=" + gdpPerCapita + ", handwashingFacilities=" + handwashingFacilities
                + ", hospitalBedsPerThousand=" + hospitalBedsPerThousand + ", id=" + id + ", isoCode=" + isoCode
                + ", lifeExpectancy=" + lifeExpectancy + ", location=" + location + ", maleSmokers=" + maleSmokers
                + ", medianAge=" + medianAge + ", newCases=" + newCases + ", newCasesPerMillion=" + newCasesPerMillion
                + ", newCasesSmoothed=" + newCasesSmoothed + ", newCasesSmoothedPerMillion="
                + newCasesSmoothedPerMillion + ", newDeathSmoothed=" + newDeathSmoothed + ", newDeaths=" + newDeaths
                + ", newDeathsPerMillion=" + newDeathsPerMillion + ", newDeathsSmoothedPerMillion="
                + newDeathsSmoothedPerMillion + ", newTests=" + newTests + ", newTestsPerThousand="
                + newTestsPerThousand + ", newTestsSmoothed=" + newTestsSmoothed + ", newTestsSmoothedPerThousand="
                + newTestsSmoothedPerThousand + ", population=" + population + ", populationDensity="
                + populationDensity + ", positiveRate=" + positiveRate + ", stringencyIndex=" + stringencyIndex
                + ", testsPerCase=" + testsPerCase + ", testsUnits=" + testsUnits + ", totalCases=" + totalCases
                + ", totalCasesPerMillion=" + totalCasesPerMillion + ", totalDeaths=" + totalDeaths
                + ", totalDeathsPerMillion=" + totalDeathsPerMillion + ", totalTest=" + totalTest
                + ", totalTestsPerThousand=" + totalTestsPerThousand + "]";
    }

}