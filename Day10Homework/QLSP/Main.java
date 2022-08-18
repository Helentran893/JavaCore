import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        Product productList1 = new Product("P1","pen","to write",10,150000,"item");
        Product productList2 = new Product("P2","eraser","to remove",5,80000,"item");
        Product productList3 = new Product("P3","pencil","to write then remove",3,30000,"item");
        productList.add(0,productList1);
        productList.add(1,productList2);
        productList.add(2,productList3);
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println(productList.toString());

        System.out.println("2 - Tìm sản phẩm theo tên");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of product you wanna find: ");
        String findName = scanner.nextLine();
        for(Product p:productList) {
            if (p.toFindName(findName)) {
                System.out.println(p.toString());
            }
        }

        System.out.println("3 - Tìm sản phẩm theo id: ");
        System.out.println("3.1: Xóa sản phẩm: ");
        String findId = scanner.nextLine();
        for(Product p:productList) {
            if (p.toFindId(findId)) {
                productList.remove(p);
            }
        }
        System.out.println(productList.toString());

        System.out.println("3.2: Cập nhật số lượng sản phẩm: ");
        String nameFindAmount = scanner.nextLine();
        for(Product p:productList) {
            if (p.toFindName(nameFindAmount)) {
                System.out.println(p.getAmount());
            }
        }
        System.out.println("4- Tìm các sản phẩn có số lượng dưới 5 ");
        for(Product p:productList) {
            if (p.getAmount()<5) {
                System.out.println(p.toString());
            }
        }
        System.out.println("5 - Tìm sản phẩm theo mức giá: ");
        System.out.println("5.1: Dưới 50.000 ");
        for(Product p:productList) {
            if (p.getPrice()<50000) {
                System.out.println(p.toString());
            }
        }
        System.out.println("5.2: Từ 50.000 đến dưới 100.000");
        for(Product p:productList) {
            if (p.getPrice()>=50000 && p.getPrice()<100000) {
                System.out.println(p.toString());
            }
        }
        System.out.println("5.3: Từ 100.000 trở lên");
        for(Product p:productList) {
            if (p.getPrice()>100000) {
                System.out.println(p.toString());
            }
        }
    }
}
