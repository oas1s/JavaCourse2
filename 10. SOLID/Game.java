public class Game {

    private String origin;
    private String shop;
    private String company;
    private String console;
    private String genre;
    private String title;
    private Double price;
    private String currency;
    private boolean availability;

    public Game(String origin, String shop, String company, String console, String genre, String title, Double price, String currency, boolean availability) {
        this.origin = origin;
        this.shop = shop;
        this.company = company;
        this.console = console;
        this.genre = genre;
        this.title = title;
        this.price = price;
        this.currency = currency;
        this.availability = availability;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Game{" +
                "origin='" + origin + '\'' +
                ", shop='" + shop + '\'' +
                ", company='" + company + '\'' +
                ", console='" + console + '\'' +
                ", genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", availability=" + availability +
                '}';
    }
}
