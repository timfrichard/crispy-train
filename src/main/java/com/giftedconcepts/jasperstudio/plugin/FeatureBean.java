package com.giftedconcepts.jasperstudio.plugin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FeatureBean {

    private String featureCode;
    private String featureName;
    private String featureDescription;
    private String active;
    private String businessStoreName;
    private Long businessId;
    private String requestingFlag;
    private String servicingFlag;
}
