import java.util.Scanner;

public class CaffeeShop {
    public static void main(String[] args) {

//        coffeeM.insertItem(CoffeeType.CAFE_LATTE.name(),  2000);
//        coffeeM.insertItem(CoffeeType.AMERICANO.name(), 1000);
//        coffeeM.insertItem(CoffeeType.ICE_AMERICANO.name(), 1500);
//        for (String itemName : coffeeM.itemList.keySet()) {
//            System.out.println(itemName + " : " + coffeeM.itemList.get(itemName));
//        }
//
//        System.out.println(coffeeM.insertMoney(10000));
//        System.out.println(coffeeM.withdrawMoney(1000));
//        coffeeM.sellItem(CoffeeType.CAFE_LATTE.name(),  10000);

        CoffeeM coffeeM = new CoffeeM();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("\n[INFOR] 현재 잔액: %d \n", coffeeM.money);
            System.out.println("1.제품 등록 2. 제품목록 3.제품삭제 4.입금 5.출금 6.판매 7.중료");
            System.out.print("메뉴를 입력하세요 >>>");
            String menu = scanner.next();
            switch (menu){
                case "1":
                    System.out.println("1. 제품등록");
                    System.out.print("제품 입력 >>");
                    String name = scanner.next();
                    System.out.print("제품각격 입력 >>");
                    int price = scanner.nextInt();
                    coffeeM.insertItem(name, price);

                    break;
                case "2":
                    System.out.println("2. 제품목록");
                    for (String itemName : coffeeM.itemList.keySet()) {
                    System.out.println(itemName + " : " + coffeeM.itemList.get(itemName));
                    }
                    break;
                case "3":
                    System.out.println("3. 제품삭제");
                    System.out.println("내용추가");
                    String deletename = scanner.next("제품삭제 입력 >>");
                    System.out.println("muốn về nhà quá");
                    coffeeM.updateItem(deletename);
                    break;
                case "4":
                    System.out.println("4. 입급");

                    break;
                case "5":
                    System.out.println("5. 출급");
                    break;
                case "6":
                    System.out.println("6.판매");
                    break;
                case "7":
                    System.out.println("프로그램 종료 중.....");
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }

    }

}
