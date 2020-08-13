package b17binaryfileandserialization.BaiTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    public static final String FILE_PATH = "src/b17binaryfileandserialization/BaiTap/Product.txt";

    int size = 0;
    List<Product> productList = new ArrayList<>();

    public ProductManage() {
    }

    public void writeFileProduct() throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            objectOutputStream = new ObjectOutputStream(fos);

                Scanner scanner = new Scanner(System.in);
                System.out.println("Input Id of product: ");
                int maSP = Integer.parseInt(scanner.nextLine());
                System.out.println("Input name of product: ");
                String tenSP = scanner.nextLine();
                System.out.println("Input producer of product: ");
                String nhaSX = scanner.nextLine();
                System.out.println("Input price of product: ");
                int gia = Integer.parseInt(scanner.nextLine());
                System.out.println("Input information product: ");
                String thongTinSP = scanner.nextLine();
                productList.add(size,new Product(maSP, tenSP, nhaSX, gia, thongTinSP));
                size++;
                objectOutputStream.writeObject(productList);
                objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }

    public static void readFileProduct() {
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fis);

            List<Product> productList = (List<Product>) objectInputStream.readObject();
            for (Product product : productList) {
                System.out.println("ID:"+product.getId() + ", Name:" + product.getName() + ", Producer:" + product.getProducer() +
                        ", Price:" + product.getPrice() + ", Information:" + product.getMoreInformation());
            }
            objectInputStream.close();

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findTheProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the name of product you want to find: ");
        String findName = scanner.nextLine();
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fis);

            List<Product> productList1 = (List<Product>) objectInputStream.readObject();
            for (Product product: productList1) {
                if(product.getName().toLowerCase().contains(findName.toLowerCase())){
                    System.out.println("The product you are looking for is in the list: ID:"+product.getId() + ", Name:"
                            + product.getName() + ", Producer:" + product.getProducer() +
                            ", Price:" + product.getPrice() + ", Information:" + product.getMoreInformation());
                }
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
      ProductManage productManage = new ProductManage();
        int choice = 0;
        while (choice != -1) {
            System.out.println("***Product Manage***");
            System.out.println("1.Add more Product");
            System.out.println("2.Print the list of Product");
            System.out.println("3.Search product");
            System.out.println("4.End the program!");
            System.out.println("Input the choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    productManage.writeFileProduct();
                    break;
                }
                case 2: {
                    readFileProduct();
                    break;
                }
                case 3:{
                    productManage.findTheProduct();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
            }
        }
    }
}
