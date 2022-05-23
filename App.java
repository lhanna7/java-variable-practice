class App {
  public static void main(String args[]) {

    int VIN = 1234567;
    String makeModel = "Ford Escape";
    String color = "White";
    Boolean towPkg = false;
    int odo = 27_863;
    int price = 28_000;
    char quality = 'A';

    String vehicleInfo = String.format(
        "Vin: %d\nMake/Model: %s\nColor: %s\nTow Package: %s\nOdometer: %d\nPrice: %d\nQuality: %c",
        VIN, makeModel, color, towPkg, odo, price, quality);

    System.out.println(vehicleInfo);
  }
}
