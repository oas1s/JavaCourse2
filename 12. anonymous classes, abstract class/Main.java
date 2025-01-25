import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("forbes_billionaires_2022.csv"));
        Billionaire[] billionaires = new Billionaire[10000];
        int counter = 0;
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (!s.matches("\\d{1,4},.*")) continue;
            s = removeCommas(s);
            String[] values = s.split(",");
            Billionaire billionaire = new Billionaire(Integer.parseInt(values[0]),values[1],values[2].isEmpty() ? 100 : Integer.parseInt(values[2]),
                    Integer.parseInt(values[3]),values[4],values[5],values[6],values[7],values[8],values[9],values[10],values[11],values[12],values[13],values[14].isEmpty() ? 0 : Integer.parseInt(values[14]),values[15],"");
            billionaires[counter] = billionaire;
            counter++;
            System.out.println(billionaire);
        }
        int counter2 = 0;
        for (int i = 0; i <billionaires.length ; i++) {
            if (billionaires[i] != null){
                counter2++;
            }
        }
        System.out.println(counter2);
    }


    public static String removeCommas(String s){
        char[] chars = s.toCharArray();
        boolean insideQuotes = false;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i] == '"'){
                insideQuotes = !insideQuotes;
            }
            if (insideQuotes && chars[i] == ','){
                chars[i] = ' ';
            }
        }
        return new String(chars);
    }


    static class Billionaire{
        public int rank;
        public String personName;
        public int age;
        public int finalWorth;
        public String category;
        public String source;
        public String country;
        public String state;
        public String city;
        public String organization;
        public String selfMade;
        public String gender;
        public String birthDate;
        public String title;
        public int philanthropyScore;
        public String bio;
        public String about;

        public Billionaire(int rank, String personName, int age, int finalWorth, String category, String source, String country, String state, String city, String organization, String selfMade, String gender, String birthDate, String title, int philanthropyScore, String bio, String about) {
            this.rank = rank;
            this.personName = personName;
            this.age = age;
            this.finalWorth = finalWorth;
            this.category = category;
            this.source = source;
            this.country = country;
            this.state = state;
            this.city = city;
            this.organization = organization;
            this.selfMade = selfMade;
            this.gender = gender;
            this.birthDate = birthDate;
            this.title = title;
            this.philanthropyScore = philanthropyScore;
            this.bio = bio;
            this.about = about;
        }

        @Override
        public String toString() {
            return "Billionaire{" +
                    "rank=" + rank +
                    ", personName='" + personName + '\'' +
                    ", age=" + age +
                    ", finalWorth=" + finalWorth +
                    ", category='" + category + '\'' +
                    ", source='" + source + '\'' +
                    ", country='" + country + '\'' +
                    ", state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", organization='" + organization + '\'' +
                    ", selfMade='" + selfMade + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthDate='" + birthDate + '\'' +
                    ", title='" + title + '\'' +
                    ", philanthropyScore=" + philanthropyScore +
                    ", bio='" + bio + '\'' +
                    ", about='" + about + '\'' +
                    '}';
        }
    }
}
