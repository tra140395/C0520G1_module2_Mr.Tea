package models;

public class ServiceIncluded {
  private String nameOfService;
  private int unitOfService;
  private double moneyOfService;

    public ServiceIncluded(){};

    public ServiceIncluded(String nameOfService, int unitOfService, double moneyOfService) {
        this.nameOfService = nameOfService;
        this.unitOfService = unitOfService;
        this.moneyOfService = moneyOfService;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public int getUnitOfService() {
        return unitOfService;
    }

    public void setUnitOfService(int unitOfService) {
        this.unitOfService = unitOfService;
    }

    public double getMoneyOfService() { return moneyOfService; }

    public void setMoneyOfService(double moneyOfService) {
        this.moneyOfService = moneyOfService;
    }

    @Override
    public String toString() {
        return nameOfService +", "+
                 unitOfService+", "+
                + moneyOfService ;
    }
}

