package malaria;

/**
 * Handles malaria diagnosis logic.
 */
public class MalariaDiagnosis {

    /**
     * Checks if user is likely to have malaria.
     *
     * @return true if malaria is likely
     */
    public boolean diagnose(boolean fever, boolean headache,
                            boolean weakness, boolean chills,
                            boolean vomiting, boolean bodyPain) {

        int count = 0;

        if (fever) count++;
        if (headache) count++;
        if (weakness) count++;
        if (chills) count++;
        if (vomiting) count++;
        if (bodyPain) count++;

        assert count >= 0 : "Symptom count cannot be negative";

        return count >= 4;
    }
}
