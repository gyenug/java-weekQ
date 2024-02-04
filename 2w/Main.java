
public class Main {
    public static void main(String[] args) {

        Product pro = new Beauty("문구점", 34200, 1);

        Integer deliveryCharge = pro.getDeliveryCharge();

        if (deliveryCharge == null)

            System.out.println("배송비는 한번만 무료로 합니다");


        else
        {
            System.out.println("배송비가격= " + deliveryCharge + "$$$원 입니다.");
        }
    }
}
