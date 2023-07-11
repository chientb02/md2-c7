package baitap.btQuanLySp;
import java.util.Arrays;
import java.util.Scanner;
public class Manager {
    static Scanner scanner = new Scanner(System.in);
    Products product1 = new Products(1,"kẹo" , 100 , 50,"Hàng mới về");
    Products product2 = new Products(2,"bánh" , 1000 , 50,"Hàng mới về");
    Products product3 = new Products(3,"sữa" , 11000 , 50,"Hàng mới về");
    Products product4 = new Products(4,"kem" , 12000 , 50,"Hàng mới về");
    Products product5 = new Products(5,"bia" , 10030 , 50,"Hàng mới về");
    Products []  listProduct =  {product1 , product2, product3 , product4 , product5} ;


//    thêm sản phẩm
    public int length = listProduct.length;
    int id = 5 ;
    public  void addProduct  () {

        System.out.println("nhập tên");
        String newName = scanner.nextLine();
        System.out.println("nhập giá");
        int newPrice = scanner.nextInt();
        System.out.println("nhập số lượng");
        int newQuantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập ghi chú");
        String newDescription = scanner.nextLine();
        id++ ;
        Products newProduct = new Products(id ,newName , newPrice, newQuantity , newDescription);
        Products [] newList = Arrays.copyOf(listProduct , length + 1);
        newList[newList.length -1] = newProduct ;
        length++ ;
        listProduct = newList;

        System.out.println("đã thêm sản phẩm ");
        for (Products value:
                listProduct) {
            System.out.println(value);
        }
    }
//    -----------------------------------------------------------------------

//    sửa sản phẩm
    int index ;
    public void editProduct () {
        System.out.println("nhập id sản phẩm cần sửa");
        index = scanner.nextInt();
        boolean flag = true;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getId() == index ){
                flag = false;
//                System.out.println("nhập id mới");
//                listProduct[i].setId(scanner.nextInt());
                scanner.nextLine();

                System.out.println("nhập tên thay đổi");
                listProduct[i].setName(scanner.nextLine());

                System.out.println("nhập giá thay đổi");
                listProduct[i].setPrice(scanner.nextInt());

                 System.out.println("nhập số lượng thay đổi");
                listProduct[i].setQuantity(scanner.nextInt());
                scanner.nextLine();

                System.out.println("nhập thông tin chi tiết cần thay đổi");
                listProduct[i].setDescription(scanner.nextLine());
                System.out.println("đã sửa thành công");
            }
        }
        if(flag){
            System.out.println("không có id sản phẩm nào trùng với id vừa nhập ");
        }

    }

//-----------------------------------------------------------------------------------------
//    xóa sản phẩm
    public void deleteProduct () {
        System.out.println("nhập id sản phẩm cần xoa");
        index = scanner.nextInt();
        boolean flag = true;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getId() == index) {
                flag = false;
                for (int j = i; j < listProduct.length -1  ; j++) {
                    listProduct[j] = listProduct[j + 1];
                }
            }
        }
        if(flag){
            System.out.println("không có id sản phẩm nào trùng với id vừa nhập ");
        }else {
            Products [] deleteProduct = new Products[listProduct.length -1];
            for (int i = 0; i < deleteProduct.length; i++) {
                deleteProduct[i] = listProduct[i];
            }
            listProduct = deleteProduct ;
            System.out.println("đã xóa thành công");
//            for (Products value: listProduct
//                 ) {
//                System.out.println(value);
//            }
        }
    }

//-------------------------------------------------------------------------------------------------

//    hiển thị sản phẩm
    public void showProduct () {
        for (Products value:
             listProduct) {
            System.out.println(value);
        }
    }

//   -------------------------------------------------------------

//    hiển thị các product có giá lớn nhất
    int count ;
    public void maxPrice () {
        int maxPrice = listProduct[0].getPrice();
        for (int i = 0; i < listProduct.length; i++) {
            if (maxPrice < listProduct[i].getPrice()) {
                maxPrice = listProduct[i].getPrice() ;
                count = i ;
            }
        }
        System.out.println("sản phẩm có giá lớn nhất là " + listProduct[count]);
    }

//---------------------------------------------------\

//    Hien thi san pham co gia nho nhat
public void minPrice () {
    int minPrice = listProduct[0].getPrice();
    for (int i = 0; i < listProduct.length; i++) {
        if (minPrice > listProduct[i].getPrice()) {
            minPrice = listProduct[i].getPrice() ;
            count = i ;
        }
    }
    System.out.println("sản phẩm có giá nhỏ nhất là " + listProduct[count]);
}

//    -------------------------------------------
//    hiển thị product có số lượng lớn nhất

    public void maxQuantity () {
        int maxQuantity = listProduct[0].getPrice();
        for (int i = 0; i < listProduct.length; i++) {
            if (maxQuantity < listProduct[i].getPrice()) {
                maxQuantity = listProduct[i].getPrice() ;
                count = i ;
            }
        }
        System.out.println("sản phẩm có số lượng lớn nhất là " + listProduct[count]);
    }

//---------------------------------------------------\

    //    Hien thi san pham co số lượng nho nhat
    public void minQuantity () {
        int minQuantity = listProduct[0].getPrice();
        for (int i = 0; i < listProduct.length; i++) {
            if (minQuantity > listProduct[i].getPrice()) {
                minQuantity = listProduct[i].getPrice() ;
                count = i ;
            }
        }
        System.out.println("sản phẩm có số lượng nhỏ nhất là " + listProduct[count]);
    }

//--------------------------------------------------------
//    Tổng tiền hàng hiện có
    int sum = 0 ;
    public void sumProduct () {
        for (int i = 0; i < listProduct.length; i++) {
            sum+= ( listProduct[i].getPrice() * listProduct[i].getQuantity() ) ;
        }
        System.out.println("tổng tiền hàng hiện tại là :" + sum);
    }


}
