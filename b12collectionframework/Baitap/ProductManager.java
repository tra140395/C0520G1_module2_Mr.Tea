package b12collectionframework.Baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        List<Product> myArrayList = new ArrayList<>();
        int size = 0;

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice !=-1) {
            System.out.println("Quản lý sản phẩm:");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm");
            System.out.println("3.Xoá sản phẩm");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7.Out");
            System.out.println("-------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập tên mặt hàng muốn thêm:");
                    scanner.nextLine();
                    String n = scanner.nextLine();
                    System.out.println("Nhập giá bạn muốn bán: ");
                    int g = scanner.nextInt();
                    myArrayList.add(size, new Product(n, g));
                    System.out.println(myArrayList);
                    size++;
                    break;
                }
                case 2: {
                    System.out.println("Nhập tên sản phẩm muốn sửa:");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    for (Product temp : myArrayList) {
                        if (editName.equals(temp.getName())) {
                            System.out.println("Nhập tên mặt hàng muốn sửa lại:");
                            String n = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Nhập giá bạn muốn sửa lại: ");
                            int g = scanner.nextInt();
                            myArrayList.set(myArrayList.indexOf(temp), new Product(n, g));
                            System.out.println(myArrayList);
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập tên sản phẩm muốn xóa:");
                    scanner.nextLine();
                    String delName = scanner.nextLine();
                    for (Product temp : myArrayList) {
                        if (delName.equals(temp.getName())) {
                            myArrayList.remove(myArrayList.indexOf(temp));
                            System.out.println(myArrayList);
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhập tên mặt hàng bạn muốn tìm kiếm: ");
                    scanner.nextLine();
                    String findName = scanner.nextLine();
//                    if(myArrayList.contains(findName)){
//                        System.out.println("Mặt hàng bạn muốn tìm có trong danh sách tại vị trí thứ "+(myArrayList.indexOf(findName)+1));
//                    }else
//                        System.out.println("Mặt hàng không có trong danh sách!");
                    for (Product temp : myArrayList) {
                        if (findName.equals(temp.getName())) {
                            System.out.println("Mặt hàng có trong danh sách tại vị trí thứ " + (myArrayList.indexOf(temp) + 1));
                            System.out.println(myArrayList);
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Đã tích hợp chức năng in danh sách vào 4 chức năng trên!!");
                    break;
                }
                case 6: {
                    System.out.println("GOODBYE!!!");
                    System.exit(6);
                }
            }
        }
    }
}

