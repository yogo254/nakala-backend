package com.yogo.nakalabackend.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

import com.yogo.nakalabackend.domain.Covid;

public class DataLoader {

    public static List<Covid> loadData() {
        List<Covid> covids = null;

        try {
            Path path = Path.of("src/main/resources/data/data.csv");
            covids = Files.lines(path).limit(13000).map(s -> {
                Covid covid = new Covid();
                List<String> values = Arrays.asList(s.split(","));

                covid.setId(UUID.getRandomString());
                covid.setIsoCode((values.get(0).equals("")) ? "" : values.get(0));
                covid.setContinent((values.get(1).equals("")) ? "" : values.get(1));
                covid.setLocation((values.get(2).equals("")) ? "" : values.get(2));
                covid.setDate((values.get(3).equals("")) ? "" : values.get(3));

                covid.setTotalCases((values.get(4).equals("")) ? 0.0 : Double.valueOf(values.get(4)));
                covid.setNewCases((values.get(5).equals("")) ? 0.0 : Double.valueOf(values.get(5)));
                covid.setNewCasesSmoothed((values.get(6).equals("")) ? 0.0 : Double.valueOf(values.get(6)));
                covid.setTotalDeaths((values.get(7).equals("")) ? 0.0 : Double.valueOf(values.get(7)));
                covid.setNewDeaths((values.get(8).equals("")) ? 0.0 : Double.valueOf(values.get(8)));
                covid.setNewDeathSmoothed((values.get(9).equals("")) ? 0.0 : Double.valueOf(values.get(9)));
                covid.setTotalCasesPerMillion((values.get(10).equals("")) ? 0.0 : Double.valueOf(values.get(10)));
                covid.setNewCasesPerMillion((values.get(11).equals("")) ? 0.0 : Double.valueOf(values.get(11)));
                covid.setNewCasesSmoothedPerMillion((values.get(12).equals("")) ? 0.0 : Double.valueOf(values.get(12)));
                covid.setTotalDeathsPerMillion((values.get(13).equals("")) ? 0.0 : Double.valueOf(values.get(13)));
                covid.setNewDeathsPerMillion((values.get(14).equals("")) ? 0.0 : Double.valueOf(values.get(14)));
                covid.setNewDeathsSmoothedPerMillion(
                        (values.get(15).equals("")) ? 0.0 : Double.valueOf(values.get(15)));
                covid.setNewTests((values.get(16).equals("")) ? 0.0 : Double.valueOf(values.get(16)));
                covid.setTotalTest((values.get(17).equals("")) ? 0.0 : Double.valueOf(values.get(17)));
                covid.setTotalTestsPerThousand((values.get(18).equals("")) ? 0.0 : Double.valueOf(values.get(18)));
                covid.setNewTestsPerThousand((values.get(19).equals("")) ? 0.0 : Double.valueOf(values.get(19)));
                covid.setNewTestsSmoothed((values.get(20).equals("")) ? 0.0 : Double.valueOf(values.get(20)));
                covid.setNewTestsSmoothedPerThousand(
                        (values.get(21).equals("")) ? 0.0 : Double.valueOf(values.get(21)));
                covid.setTestsPerCase((values.get(22).equals("")) ? 0.0 : Double.valueOf(values.get(22)));
                covid.setPositiveRate((values.get(23).equals("")) ? 0.0 : Double.valueOf(values.get(23)));
                covid.setTestsUnits((values.get(24).equals("")) ? "" : values.get(24));
                covid.setStringencyIndex((values.get(25).equals("")) ? 0.0 : Double.valueOf(values.get(25)));
                covid.setPopulation((values.get(26).equals("")) ? 0.0 : Double.valueOf(values.get(26)));
                covid.setPopulationDensity((values.get(27).equals("")) ? 0.0 : Double.valueOf(values.get(27)));
                covid.setMedianAge((values.get(28).equals("")) ? 0.0 : Double.valueOf(values.get(28)));
                covid.setAged65OrOlder((values.get(29).equals("")) ? 0.0 : Double.valueOf(values.get(29)));
                covid.setAged70Older((values.get(30).equals("")) ? 0.0 : Double.valueOf(values.get(30)));
                covid.setGdpPerCapita((values.get(31).equals("")) ? 0.0 : Double.valueOf(values.get(31)));
                covid.setExtremePoverty((values.get(32).equals("")) ? 0.0 : Double.valueOf(values.get(32)));
                covid.setCardiovascDeathRate((values.get(33).equals("")) ? 0.0 : Double.valueOf(values.get(33)));
                covid.setDiabetesPrevalence((values.get(34).equals("")) ? 0.0 : Double.valueOf(values.get(34)));
                covid.setFemaleSmokers((values.get(35).equals("")) ? 0.0 : Double.valueOf(values.get(35)));
                covid.setMaleSmokers((values.get(36).equals("")) ? 0.0 : Double.valueOf(values.get(36)));
                covid.setHandwashingFacilities((values.get(37).equals("")) ? 0.0 : Double.valueOf(values.get(37)));
                covid.setHospitalBedsPerThousand((values.get(38).equals("")) ? 0.0 : Double.valueOf(values.get(38)));
                covid.setLifeExpectancy((values.get(39).equals("")) ? 0.0 : Double.valueOf(values.get(39)));

                return covid;

            }).collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return covids;

    }

}