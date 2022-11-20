public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public void outPutFirstTask() {

        System.out.println("Привет! Меня зовут " + this.name + " Я из города " + this.town + " Я родился в " + this.yearOfBirth + " году. Будем знакомы!");
    }

    public void outPutSecondTask() {
        System.out.println("Привет! Меня зовут " + this.name + " Я из города " + this.town + " Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.jobTitle + " Будем знакомы!");
    }

    public void outPutThirdTask() {
        if (name == null || name == "") {
            this.name = "Информация не указана";
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        }
        System.out.println("Привет! Меня зовут " + this.name + " Я из города " + this.town + " Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.jobTitle + " Будем знакомы!");
    }

}
