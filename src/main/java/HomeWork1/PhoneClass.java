package HomeWork1;

public class PhoneClass {

    private String producer; //производитель
    private int cost; // стоимость

    public PhoneClass(String producer, int cost) {
        this.producer = producer;
        this.cost = cost;
    }

    public void PhoneInfo() {
        System.out.println("Телефон, который вы выбрали: " + producer + " сo стоимотью " + cost + " $");
    }

    public static void main(String[] args) {
        PhoneClass mobile = new PhoneClass("IPhone", 1299);
        mobile.PhoneInfo();
    }
}
