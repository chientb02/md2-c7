package baitap.btQuanLySp;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = -1;
        Manager manager = new Manager();
        do {
            System.out.println("nhập 1 để thêm sản phẩm");
            System.out.println("nhập 2 để sửa  ");
            System.out.println("nhập 3 để xóa");
            System.out.println("nhập 4 để hiển thị tất cả");
            System.out.println("nhập 5 để hiển thị sản phẩm có giá lớn nhất");
            System.out.println("nhập 6 để hiển thị sản phẩm có giá nhỏ nhất");
            System.out.println("nhập 7 để hiển thị sản phẩm có số lượng nhiều nhất");
            System.out.println("nhập 8 để hiển thị sản phẩm có số lượng ít nhất");
            System.out.println("nhập 9 để tính tổng tiền hàng hiện có");
            System.out.println("nhập 0 để thoát ");
            index = scanner.nextInt();
            if (index < 0 || index > 9) {
                System.out.println("vui lòng nhập lại");
            }
            switch (index) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.editProduct();
                    break;
                case 3:
                    manager.deleteProduct();
                    break;
                case 4:
                    manager.showProduct();
                    break;
                case 5:
                    manager.maxPrice();
                    break;
                case 6:
                    manager.minPrice();
                    break;
                case 7:
                    manager.maxQuantity();
                    break;
                case 8:
                    manager.minQuantity();
                    break;
                case 9:
                    manager.sumProduct();
                    break;
                case 0:
                    System.exit(0);
//        Products [] newList = new Products[listProduct.length + 1];
            }
        } while (index != 0);

    }
}
