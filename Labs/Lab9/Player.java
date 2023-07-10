/*
    @author Mehmet Akif Şahin
    22203673
    @date 15/12/2022 
    Player Class
*/

public class Player {
    private String name;
    private int age;
    private String nationality;
    private int jerseyNumber;
    private String position;
    private int marketValue;

    public Player(String name, int age, String nationality, int jerseyNumber, String position, int marketValue) {
        this.name = name;
        if (age >= 0) this.age = age;
        this.nationality = nationality;
        if (jerseyNumber < 100 && jerseyNumber > 0) this.jerseyNumber = jerseyNumber;
        this.position = position;
        if (marketValue >= 0) this.marketValue = marketValue;
    }


    public int getAge() {
        return age;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public int getMarketValue() {
        return marketValue;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public String getPosition() {
        return position;
    }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }
    public void setJerseyNumber(int jerseyNumber) {
        if (jerseyNumber < 100 && jerseyNumber > 0) this.jerseyNumber = jerseyNumber;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setMarketValue(int marketValue) {
        if (marketValue >= 0) this.marketValue = marketValue;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String toString() {
        return String.format("%-20s%-5d%-15s%-8d%-25s%,d\n", this.name, this.age, this.nationality, this.jerseyNumber, this.position, this.marketValue);
    }
}
