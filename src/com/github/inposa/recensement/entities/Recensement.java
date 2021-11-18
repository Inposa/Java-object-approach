package com.github.inposa.recensement.entities;

import com.github.inposa.recensement.utils.Utils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Recensement {

    //On a besoin de FileParser pour peupler listeVille
    private List<Ville> listeVille;

    public Recensement(List<Ville> listeVille) {
        this.listeVille = listeVille;
    }

    public Recensement() {
        this.listeVille = new ArrayList<>();
    }

    public List<Ville> getListeVille() {
        return listeVille;
    }

    public void setListeVille(List<Ville> listeVille) {
        this.listeVille = listeVille;
    }


    /**
     * Retourne une ville en la cherchant via son nom dans toutes les listes présentes dans le rescencement
     *
     * @param name Nom de la ville à rechercher
     * @return Retourne la ville désignée par name
     */
    private Ville getVilleByName(String name) {
        boolean isFounded = false;
        Ville retour = null;

        int i = 0;
        while (!isFounded && i < this.listeVille.size()) {
            Ville current = this.listeVille.get(i);
            if (current.getNomCommune().equals(name)) {
                retour = current;
                isFounded = true;
            }
            i++;
        }
        return retour;
    }

    public int getPopulationVille(String name) {
        return this.getVilleByName(name).getPopulation();
    }

    public int getPopulationDepartement(String codeDepartement) {
        List<Ville> listVilleDepartement = this.getVillesByDepartementName(codeDepartement);

        int sumPopulation = 0;
        for (Ville ville : listVilleDepartement) {
            sumPopulation += ville.getPopulation();
        }

        return sumPopulation;
    }

    private List<Ville> getVillesByDepartementName(String codeDepartement) {
        String formatedName = Utils.formatString(codeDepartement);

        List<Ville> filteredList = this.listeVille.stream().filter(ville -> Utils.formatString(ville.getDepartement().getCodeDepartement()).equals(formatedName)).collect(Collectors.toList());
        return filteredList;
    }

    public int getPopulationRegion(String nomRegion) {
        List<Ville> listeVilleRegion = this.getVillesByRegionName(nomRegion);

        int sumPopulation = 0;
        for (Ville ville : listeVilleRegion) {
            sumPopulation += ville.getPopulation();
        }

        return sumPopulation;
    }

    private List<Ville> getVillesByRegionName(String nomRegion) {
        String formatedName = Utils.formatString(nomRegion);

        List<Ville> filteredList = this.listeVille.stream().filter(ville -> Utils.formatString(ville.getRegion()
                .getNomRegion()).equals(formatedName)).collect(Collectors.toList());
        return filteredList;
    }

    public List<Departement> getTop10Departements() {
        List<Departement> departementList = getAllDepartementsByPopulation();
        Collections.sort(departementList, new ComparatorPopulationDepartement());

        return departementList.subList(0, 9);
    }

    private List<Departement> getAllDepartementsByPopulation() {
        AbstractMap<Departement, Integer> departementMap = new HashMap<>();

        for (Ville ville : listeVille) {
            Integer compteur = departementMap.get(ville.getDepartement());
            if (compteur == null) {
                compteur = 0;
                departementMap.put(ville.getDepartement(), 0);
            }
            departementMap.put(ville.getDepartement(), compteur + ville.getPopulation());
        }

        List<Departement> departmentList = new ArrayList<>();

        for (Departement key : departementMap.keySet()) {
            //TODO
            key.setPopulationDepartement(departementMap.get(key));
            departmentList.add(key);
        }

        return departmentList;
    }


    public List<Region> getTop10Regions() {
        List<Region> regionList = getAllRegionsByPopulation();
        Collections.sort(regionList, new ComparatorPopulationRegion());

        return regionList.subList(0, 9);
    }

    //Retourne une hashmap avec
    private List<Region> getAllRegionsByPopulation() {
        AbstractMap<Region, Integer> regionMap = new HashMap<>();

        for (Ville ville : listeVille) {
            Integer compteur = regionMap.get(ville.getRegion());
            if (compteur == null) {
                compteur = 0;
                regionMap.put(ville.getRegion(), 0);
            }
            regionMap.put(ville.getRegion(), compteur + ville.getPopulation());
        }

        List<Region> regionsList = new ArrayList<>();

        for (Region key : regionMap.keySet()) {
            key.setPopulationRegion(regionMap.get(key));
            regionsList.add(key);
        }

        return regionsList;
    }

    //Retourne une liste des 10 villes les plus peuplées
    public List<Ville> getTop10VillesFrance() {
        //tri de la liste par population
        Collections.sort(this.listeVille, new ComparatorPopulationVille());
        return this.listeVille.subList(0, 9);
    }

    public List<Ville> getTop10VilleFromDepartementName(String codeDepartement) {
        List<Ville> villeList = this.getVillesByDepartementName(codeDepartement);
        Collections.sort(villeList, new ComparatorPopulationVille());

        return villeList.subList(1, 9);
    }

    private List<Ville> getVillesFromDepartementName(String codeDepartement) {
        return listeVille.stream().filter(ville ->
                ville.getDepartement().getCodeDepartement().equals(codeDepartement)).collect(Collectors.toList());
    }


    public List<Ville> getTop10VilleFromRegionName(String nomRegion) {
        List<Ville> villeList = this.getVillesByRegionName(nomRegion);
        Collections.sort(villeList, new ComparatorPopulationVille());

        return villeList.subList(0, 9);
    }

    private List<Ville> getVillesFromRegionName(String nomRegion) {
        return listeVille.stream().filter(ville ->
                ville.getRegion().getNomRegion().equals(nomRegion)).collect(Collectors.toList());
    }

}