package com.giftedconcepts.jasperstudio.plugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FeatureStudioFactory {

    public static Collection generateFeatureCollection(){

        List<FeatureBean> featureBeans = new ArrayList<FeatureBean>();

        // FeatureCode FeatureName FeatureDescription active businessStoreName businessId RequestingFlag ServicingFlag
        featureBeans.add(new FeatureBean("Feature0", "Feature 0",
                "The Feature Description Zero", "Yes", "Company 0", 0L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature1", "Feature 1",
                "The Feature Description One", "Yes", "Company 1", 1L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature2", "Feature 2",
                "The Feature Description Two","Yes", "Company 2", 2L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature3", "Feature 3",
                "The Feature Description Three", "Yes","Company 3", 3L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature4", "Feature 4",
                "The Feature Description Four", "Yes","Company 4", 4L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature5", "Feature 5",
                "The Feature Description Five", "Yes","Company 5", 5L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature6", "Feature 6",
                "The Feature Description Six", "Yes","Company 6", 6L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature7", "Feature 7",
                "The Feature Description Seven", "Yes","Company 7", 7L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature8", "Feature 8",
                "The Feature Description Eight", "Yes","Company 8", 8L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature9", "Feature 9",
                "The Feature Description Nine", "Yes","Company 9", 9L,
                "Yes", "Yes"));
        featureBeans.add(new FeatureBean("Feature10", "Feature 10",
                "The Feature Description Ten", "Yes","Company 10", 10L,
                "Yes", "Yes"));

        return featureBeans;
    }

    /* Report Structure Type Information */
    //https://community.jaspersoft.com/wiki/report-structure-jaspersoft-studio
    /* Excel Export Recommendations */
    //https://community.jaspersoft.com/wiki/tips-exporting-excel
    /* Working with Datasources in Studion */
    //https://community.jaspersoft.com/documentation/tibco-jaspersoft-studio-user-guide/v611/working-collection-javabeans-data-adapter

    //1Controlled classification header
    //Features by Company Report
    //Report Date Wed Feb 2 2022 16:38:00 EST
    //User Id
    //Parameters:
    //Feature Code | Feature Name | Feature Description | Active | Account Name | Account Id | Requesting Flag | Servicing Flag

    //Jaspersoft Datasource Bean name - FeatureBeanDatasource
}
