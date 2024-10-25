//package Task_6;
//
//    public class Car {
//        private final String model;
//        private int year;
//        private double price;
//
//
//        public Car(String model, int year, double price) {
//            this.model = model;
//            setYear(year);
//            setPrice(price);
//        }
//
//
//        public void setYear(int year) {
//            if (year < 2000 || year > 2024) {
//                System.out.println("Error: წელი უნდა იყოს ამ შუალედში: 2000-2024. ");
//                return;
//            }
//                this.year = year;
//
//        }
//
//        public void setPrice(double price) {
//            if (price < 0) {
//                System.out.println("Error: ფასი ვერ იქნება უარყოფითი. ");
//            } else
//                this.price = price;
//        }
//
//        String getModel() {
//            return model;
//        }
//
//        public int getYear() {
//            return year;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//
//        @Override
//        public String toString() {
//            if (year == 0 || price == 0)return "Invalid Car";
//            return "Model: " + model + ", Year: " + year + ", Price: " + price;
//        }
//    }