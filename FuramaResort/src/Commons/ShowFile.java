package commons;

import models.House;
import models.Room;
import models.ServiceIncluded;
import models.Villa;

import java.io.*;

public class ShowFile {

    public ShowFile() {
    }

    public static void showVilla(File file) {
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
                Villa.getVillaList().add(villa);
                Villa.setVillaList(Villa.getVillaList());
            }
            for (Villa villa1 : Villa.getVillaList()) {
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
                House.getHouseList().add(house);
                House.setHouseList(House.getHouseList());
            }
            for (House house1 : House.getHouseList()) {
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
                Room.getRoomList().add(room);
                Room.setRoomList(Room.getRoomList());
            }
            for (Room room1 : Room.getRoomList()) {
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
