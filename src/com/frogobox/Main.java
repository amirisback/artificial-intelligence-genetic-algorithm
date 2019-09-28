package com.frogobox;

import com.frogobox.algorithm.PopulationAlgo;

import static com.frogobox.base.BaseHelper.LINE_VIEW;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
 * Copyright (C) 27/09/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox
 */
public class Main {

    private static void programName(int population, int chromosome, int gen){
        System.out.println("..:: Algortima Genetik ::..");
        System.out.println(LINE_VIEW);
        System.out.println("Muhammad Faisal Amir");
        System.out.println("1301198497");
        System.out.println("IFX-43-02");
        System.out.println(LINE_VIEW);
        System.out.println("Jumlah Populasi \t\t: " + population + " Makhluk");
        System.out.println("1 Makhluk Memiliki \t\t: " + chromosome + " Kromosom");
        System.out.println("1 Kromosom Memiliki \t: " + gen + " Gen");
        System.out.println(LINE_VIEW);
    }

    public static void main (String[] args) {
        PopulationAlgo populationAlgo = new PopulationAlgo();
        programName(populationAlgo.SUM_POPULATION, populationAlgo.SUM_CHROMOSOME, populationAlgo.SUM_GEN);
        populationAlgo.declarePopulation();
        populationAlgo.getPopulation();
    }

}