package clas;

    public class Toyota extends Car {
        private String manufacturer;

        public Toyota() {
        }

        public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
            super(name, model, maxSpeed, year, volume);
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        @Override
        public String ride() {
            return getName() +" "+ "Car" + " " + getName() + " " + getModel() +
                    " with max speed " + getMaxSpeed() + " km/h" +
                    " from " + getYear() + " year" +
                    " with engine volume " + getVolume() + " liters manufactured from " + getManufacturer() + " is riding.";
        }
    }






