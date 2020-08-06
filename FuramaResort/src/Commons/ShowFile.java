package commons;

import models.House;
import models.Room;
import models.ServiceIncluded;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShowFile {

    public ShowFile() {
    }

    public static void showVilla(File file) {
        List<Villa> villaList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            String[] arrTemp;
            int stt = 0;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                Villa villa = new Villa(arrTemp[0], arrTemp[1], Double.parseDouble(arrTemp[2]),
                        Double.parseDouble(arrTemp[3]), Integer.parseInt(arrTemp[4]),
                        arrTemp[5], arrTemp[6], arrTemp[7], Double.parseDouble(arrTemp[8]), Integer.parseInt(arrTemp[9]));
                villaList.add(villa);
            }
            for (Villa villa1 : villaList) {
               villa1.showInformation();
                stt++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = "";
//            String[] arrTemp;
//            int id = 0;
//            while ((line = bufferedReader.readLine()) != null) {
//                arrTemp = line.split(",");
//                System.out.println(Arrays.toString(arrTemp));
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "Done";

    }

    public static void showHouse(File file) {
        List<House> houseList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            String[] arrTemp;
            int stt = 0;
            while ((line = bufferedReader.readLine()) != null) {
                    arrTemp = line.split(",");
                House house = new House(arrTemp[0], arrTemp[1], Double.parseDouble(arrTemp[2]),
                        Double.parseDouble(arrTemp[3]), Integer.parseInt(arrTemp[4]),
                        arrTemp[5], arrTemp[6], arrTemp[7], Integer.parseInt(arrTemp[8]));
               houseList.add(house);
            }
            for (House house1 :houseList) {
                 house1.showInformation();
                 stt++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showRoom(File file) {
        List<Room> roomList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            String[] arrTemp;
            int stt = 0;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                System.out.println(arrTemp[6] + Integer.parseInt(arrTemp[7]) + Double.parseDouble(arrTemp[8]));
                ServiceIncluded serviceIncluded = new ServiceIncluded(arrTemp[6], Integer.parseInt(arrTemp[7]),
                        Double.parseDouble(arrTemp[8]));
                System.out.println(serviceIncluded);
                Room room = new Room(arrTemp[0], arrTemp[1], Double.parseDouble(arrTemp[2]),
                        Double.parseDouble(arrTemp[3]), Integer.parseInt(arrTemp[4]),
                        arrTemp[5],serviceIncluded);
                roomList.add(room);
            }
            for (Room room1 : roomList) {
                 room1.showInformation();
                 stt++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
