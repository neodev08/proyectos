public class Main {
        public static void main(String[] args) {
            Store cookieShop = new Store("Galletas", 12, 3.75);

            System.out.println("El balance total del inventario es: " + cookieShop.inventoryCount * cookieShop.inventoryPrice);
        }
}
