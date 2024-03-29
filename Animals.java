import java.time.LocalDate;
import java.util.ArrayList;
public class Animals {
    private long id;
    private String type;
    private LocalDate arrivalDate;
    private ArrayList<String> listDiseases = new ArrayList<>();
    private String diet;
    private LocalDate birthDate;
    private double weight;
    private int feedingFrequency;
    private boolean isVaccinated;

    public Animals(long id, String type, LocalDate arrivalDate, String diet, LocalDate birthDate, double weight, int feedingFrequency, boolean isVaccinated) {
        this.id = id;
        this.type = type;
        this.arrivalDate = arrivalDate;
        this.diet = diet;
        this.birthDate = birthDate;
        this.weight = weight;
        this.feedingFrequency = feedingFrequency;
        this.isVaccinated = isVaccinated;
    }
    public void addDisease(String newDisease){
        listDiseases.add(newDisease);
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public ArrayList<String> getListDiseases() {
        return listDiseases;
    }

    public String getDiet() {
        return diet;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getWeight() {
        return weight;
    }

    public int getFeedingFrequency() {
        return feedingFrequency;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFeedingFrequency(int feedingFrequency) {
        this.feedingFrequency = feedingFrequency;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
