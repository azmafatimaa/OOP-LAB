public class Company {
    String name;
    CityCinema[] branches;

    public Company(String name, CityCinema[] branches) {
        this.name = name;
        this.branches = branches;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company: ").append(name).append("\n");
        for (CityCinema branch : branches)
            stringBuilder.append(branch);
        return stringBuilder.toString();
    }
}

