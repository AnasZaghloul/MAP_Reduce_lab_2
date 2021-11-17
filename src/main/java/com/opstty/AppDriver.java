package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("Districts", Districts.class,
                    "A map/reduce program that displays the list of distinct containing trees");

            programDriver.addClass("treeSpecies", TreeSpecies.class,
                    "A map/reduce program that displays the list of different species trees in this\n" +
                            "file.");

            programDriver.addClass("treeSpeciesCount", TreeSpeciesCount.class,
                    "A map/reduce program that calculates the number of trees of each kinds.");

            programDriver.addClass("maxHeightSpecies", MaxHeightSpecies.class,
                    "A map/reduce program that calculates the height of the tallest tree of each\n" +
                            "kind.");

            programDriver.addClass("treesSortedByHeight", TreesSortedByHeight.class,
                    "A map/reduce program that sort the trees height from smallest to largest.");

            programDriver.addClass("oldestTreeDistrictReduce", OldestTreeDistrictReduce.class,
                    "A map/reduce program that that displays the district where the oldest tree is.");

            programDriver.addClass("maxTreesDistrict", MaxTreesDistrict.class,
                    "A map/reduce program that displays the district that contains the most trees. ");



            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }