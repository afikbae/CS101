public class Lab01_Q3_revision {
    public static void main(String[] args) {
        final float PERCENT_OF_SIX_ELEMENTS = 98.6f;
        final int OXYGEN_RATIO = 65;
        final float CARBON_RATIO = 18.5f;
        final int HYDROGEN_RATIO = 10;
        final float NITROGEN_RATIO = 3.2f;
        final float CALCIUM_RATIO = 1.5f;

        final int HYDROGEN_ATOM_RATIO = 62;
        final int OXYGEN_ATOM_RATIO = 24;
        final int ATOM_RATIO_OF_OTHER_ELEMENTS = 100 - HYDROGEN_ATOM_RATIO - OXYGEN_ATOM_RATIO;

        final double ATOM_COUNT = 7 * Math.pow(10, 27); 

        float weightOfBody = 70;

        final double PHOSPHORUS_RATIO = PERCENT_OF_SIX_ELEMENTS
        - OXYGEN_RATIO
        - CARBON_RATIO
        - HYDROGEN_RATIO
        - NITROGEN_RATIO
        - CALCIUM_RATIO;
        
        final double PERCENT_OF_OTHER_ELEMENTS = 100 - PERCENT_OF_SIX_ELEMENTS;

        System.out.printf("\nPhosphorus makes up %f percent of the mass in the human body.\n", PHOSPHORUS_RATIO);
        System.out.printf("Elements other than oxygen, carbon, hydrogen, nitrogen, calcium and phosphorus make up %f percent of the mass with an atom count of %e\n\n",
         PERCENT_OF_OTHER_ELEMENTS, 
         ATOM_RATIO_OF_OTHER_ELEMENTS * ATOM_COUNT / 100);
        System.out.printf("For a person of %.1f kg the mass of the elements are: \nOxygen: %skg\nCarbon: %skg\nOther elements: %skg\n\n",
        weightOfBody, 
        OXYGEN_RATIO * weightOfBody / 100, 
        CARBON_RATIO * weightOfBody / 100,
        PERCENT_OF_OTHER_ELEMENTS* weightOfBody / 100);
        System.out.printf("Whereas the number of atoms of some elements in this person are:\nHydrogen: %e\nOxygen: %e\nOther elements: %e\n\n",
        HYDROGEN_ATOM_RATIO * ATOM_COUNT / 100,
        OXYGEN_ATOM_RATIO * ATOM_COUNT / 100,
        ATOM_RATIO_OF_OTHER_ELEMENTS * ATOM_COUNT / 100);
    }
}
