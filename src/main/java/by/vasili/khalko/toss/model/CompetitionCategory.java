package by.vasili.khalko.toss.model;

import java.util.Map;

public class CompetitionCategory extends AbstractNamedEntity {
    private WeightCategory weightCategory;
    private AgeCategory ageCategory;
    private Gender gender;
    private Map<Sportsman, Integer> toss;
}
