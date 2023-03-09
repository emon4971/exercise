public class DashBoard {
    public double size;
    public DashBoard(double size)
    {
        this.size=size;
    }


    public class Car1 {
        public String model;
        public String company;
        public void drive() {
            System.out.println("Driving");
        }
        public void stop()
        {
            System.out.println("Stopping");
        }


    }


    public class Volvo extends Car1{
        double price;
        String productionYear;
        String registrationNumber;
        Engine eng;
        DashBoard db;
        public Volvo(double price, String productionYear, String registrationNumber, Engine eng, DashBoard db)
        {
            this.price=price;
            this.productionYear=productionYear;
            this.registrationNumber=registrationNumber;
            this.eng=eng;
            this.db=db;
        }
